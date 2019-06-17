package za.ac.wits.domain.customer;

import java.io.UnsupportedEncodingException;
import java.math.BigInteger;
import java.security.GeneralSecurityException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.logging.Logger;

import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;



public class EncryptionUtil {
	private static final Logger LOG = Logger.getLogger( EncryptionUtil.class.getName() );
	
	public static byte[] TripleDESEncrypt(byte[] key, byte[] input) throws GeneralSecurityException {
		Cipher cipher = Cipher.getInstance( "DESede/ECB/NoPadding" );
		cipher.init( Cipher.ENCRYPT_MODE, new SecretKeySpec( key, "DESede" ) );
		return( cipher.doFinal( input ) );
	}

	public static byte[] TripleDESDecrypt(byte[] key, byte[] input) throws GeneralSecurityException {
		Cipher cipher = Cipher.getInstance( "DESede/ECB/NoPadding" );
		cipher.init( Cipher.DECRYPT_MODE, new SecretKeySpec( key, "DESede" ) );
		return( cipher.doFinal( input ) );
	}

	public static byte[] AESEncrypt(byte[] key, byte[] input) throws GeneralSecurityException {
		Cipher cipher = Cipher.getInstance( "AES" );
		cipher.init( Cipher.ENCRYPT_MODE, new SecretKeySpec( key, "AES" ) );
		return( cipher.doFinal( input ) );
	}

	public static byte[] AESDecrypt(byte[] key, byte[] input) throws GeneralSecurityException {
		Cipher cipher = Cipher.getInstance( "AES" );
		cipher.init( Cipher.DECRYPT_MODE, new SecretKeySpec( key, "AES" ) );
		return( cipher.doFinal( input ) );
	}
	
	public static final byte[] MD5(String input) throws NoSuchAlgorithmException {
		LOG.fine( "MD5[" + input + "]" );
		MessageDigest digest = MessageDigest.getInstance( "MD5" );
	    digest.update( input.getBytes() );
		return( digest.digest() );		
	}

	public static final byte[] SHA1(String input) throws NoSuchAlgorithmException {
		LOG.fine( "SHA1[" + input + "]" );
		MessageDigest digest = MessageDigest.getInstance( "SHA1" );
	    digest.update( input.getBytes() );
		return( digest.digest() );		
	}

	public static final String HEX(byte[] input) {
		String hex = new BigInteger( 1, input ).toString( 16 ).toUpperCase();
		for( int x = hex.length(); x < input.length * 2; x++ ) {
			hex = "0" + hex;
		}
		LOG.fine( "HEX[" + hex + "]" );
		return( hex );
	}
	
	public static byte[] UNHEX(String hex) {
		if( hex.length() % 2 != 0 ) {
			throw new IllegalArgumentException( "Input length must be multiple of 2" );
		}
		byte[] bin = new byte[ hex.length() / 2 ];		
		for( int x = 0; x < bin.length; x++ ) {
			int a = unhex_char( hex.charAt( x * 2 ) );
			int b = unhex_char( hex.charAt( (x * 2) + 1 ) );
			bin[ x ] = (byte)(b + (a * 16));
		}
		return( bin );
	}
	
	private static int unhex_char(char c) {
		return( ((c >= '0' && c <= '9') ? c - '0' : 
				((c >= 'A' && c <= 'F') ? c - 'A' + 10 : 
				((c >= 'a' && c <= 'f') ? c - 'a' + 10 : 0))) );
	}
	
	private static final byte[] ID_3DES_KEY = "MARVEL_IRONMAN_3DES_KEY1".getBytes();
	
	
	public static String TripleDESEncryptAndHEXEncode(String input) throws GeneralSecurityException, UnsupportedEncodingException {
		
		int requiredPadding = 8 - (input.length() % 8);
		if( requiredPadding != 8 ) {
			for( int x = 0; x < requiredPadding; x++ ) {
				input += "~";
			}
		}
		LOG.fine( input );
		return( HEX( EncryptionUtil.TripleDESEncrypt( ID_3DES_KEY, input.getBytes() ) ) ); 
	}

	public static String HEXDecodeTripleDESDecrypt(String input) throws GeneralSecurityException, UnsupportedEncodingException {

		byte[] unencoded = UNHEX( input );
		byte[] data = EncryptionUtil.TripleDESDecrypt( ID_3DES_KEY, unencoded );
		String output = new String( data ).replaceAll( "~", "" );
		return( output );
	}
	
	public static void main(String[] args) throws Exception {
		String input = "(channelId)1SA(applicationType)ZNB(applicationChannelType)COMM";
		String output = TripleDESEncryptAndHEXEncode( input );
		System.out.println( "Output[" + output + "]" );
		String original = HEXDecodeTripleDESDecrypt( output );
		System.out.println( "ORIGINAL[" + original + "]" );
		
	}
}
