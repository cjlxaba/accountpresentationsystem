/**
 * 
 */
package za.ac.wits.aps.service;

import java.io.IOException;
import java.util.List;

import za.ac.wits.domain.customer.UserCredential;
import za.ac.wits.aps.dto.viewbean.Login;
import za.ac.wits.aps.repository.CustomerDAO;
import za.ac.wits.domain.customer.EncryptionUtil;
import za.ac.wits.domain.customer.PasswordMD5;
import za.ac.wits.domain.customer.User;
import za.ac.wits.domain.customer.UserCredential;

/**
 * @author f4780027
 *
 */

public class CustomerServiceImp implements ICustomerService {
	
	public UserCredential authenticateUser(String contextPath, String username, String passowrd) {
		
		try {
			
			String md5Password = PasswordMD5.convertPassword(passowrd);
			
			boolean authSuccessul = new CustomerDAO().authenticateUser(contextPath, username, md5Password);
			
			if (authSuccessul) {				
				String authKey =  EncryptionUtil.TripleDESEncryptAndHEXEncode(username + ":" + md5Password);
				
				UserCredential userCredential = new UserCredential();
				userCredential.setTokenKey(authKey);
				userCredential.setUser(getUserDetailsByAuthKey(contextPath, authKey));
				return userCredential;
				
			}		
			
		} catch (Exception e) {
			
			e.printStackTrace();
			
			// TODO: Throw Auth Exception
		}	
		
		return null; 
	}
	
	private User getUserDetailsByAuthKey(String contextPath, String authKey) {
		
		try {
			
			User user = new CustomerDAO().getUserByAuthKey(contextPath, authKey);
			
			return user;
			
		} catch (Exception e) {
			e.printStackTrace();
			// TODO: handle exception
		}
		
		return null; 
	}

	@Override
	public List<User> getUsersRegisteredForBilling( String contextPath) throws IOException {
		
		 List <User> users = new CustomerDAO().retriveAllUsers(contextPath);
		 
		return users;
	}

	@Override
	public boolean logApsUser(Login userDtails) {
		// TODO Auto-generated method stub
		return false;
	}	
	
 }
