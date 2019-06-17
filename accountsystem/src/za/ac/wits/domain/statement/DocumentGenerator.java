package za.ac.wits.domain.statement;

import java.io.ByteArrayOutputStream;
import java.io.*;

import fnb.online.docx.api.DocumentGeneratorAPI;
import fnb.online.docx.factory.DocumentGeneratorFactory;

public class DocumentGenerator {
	
	public static void main(String[] args) throws Exception {
		
		DocumentGeneratorAPI generator = DocumentGeneratorFactory.getPdfDocumentGenerator();
		
		String documentPath = "C:\\Users\\f4780027\\Documents\\school\\Elen 7045 software development,analyses and methodologies\\statement.docx";
		
		DocBean docBean = new DocBean();
		docBean.setCurrentDate("2019/09/12");
		

		ByteArrayOutputStream out = (ByteArrayOutputStream) generator.generateDocument(documentPath,"statement", docBean);
		
		try(OutputStream outputStream = new FileOutputStream("/temp/thefilename.pdf")) {
			out.writeTo(outputStream);
		}
		
	}

}
