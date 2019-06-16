package za.ac.wits.domain.statement;

import java.io.ByteArrayOutputStream;
import java.io.*;

import fnb.online.docx.api.DocumentGeneratorAPI;
import fnb.online.docx.factory.DocumentGeneratorFactory;

public class DocumentGenerator {
	
	public static void main(String[] args) throws Exception {
		
		DocumentGeneratorAPI generator = DocumentGeneratorFactory.getPdfDocumentGenerator();
		
		String documentPath = "/home/phillip/git/accountpresentationsystem/accountsystem/WebContent/WEB-INF/CUPL_QUOTE.docx";
		
		DocBean docBean = new DocBean();
		docBean.setCurrentDate("YOUYOFDOU");

		ByteArrayOutputStream out = (ByteArrayOutputStream) generator.generateDocument(documentPath,"quote", docBean);
		
		try(OutputStream outputStream = new FileOutputStream("/tmp/thefilename")) {
			out.writeTo(outputStream);
		}
		
	}

}
