/**
 * 
 */
package za.ac.wits.aps.repository;

import java.io.ByteArrayOutputStream;
import java.io.FileOutputStream;
import java.io.OutputStream;
import java.util.Date;

import org.aopalliance.aop.AspectException;

import fnb.online.docx.api.DocumentGeneratorAPI;
import fnb.online.docx.factory.DocumentGeneratorFactory;
import za.ac.wits.aps.exception.StatementException;
import za.ac.wits.domain.statement.CreditCardStatement;
import za.ac.wits.domain.statement.DocBean;
import za.ac.wits.domain.statement.MunicipalStatement;
import za.ac.wits.domain.statement.Statement;
import za.ac.wits.domain.statement.TelecomStatement;

/**
 * @author f4780027
 *
 */
public class GenerateStatementDAO {
	
	private DocumentGeneratorAPI generator = DocumentGeneratorFactory.getPdfDocumentGenerator();
	String document = "statement.docx";
	public GenerateStatementDAO() {

	}

	public void generateBillingStatement(Statement statement) throws StatementException {

		DocBean docBean = new DocBean();

		if (statement instanceof CreditCardStatement) {

			docBean.setCredit((CreditCardStatement) statement);
			docBean.setCurrentDate(new Date().toString());
		} else if (statement instanceof MunicipalStatement) {
			docBean.setMunicipality((MunicipalStatement) statement);

		} else if (statement instanceof TelecomStatement) {
			docBean.setTelecoms((TelecomStatement) statement);

		}

		ByteArrayOutputStream out;
		try {
			out = (ByteArrayOutputStream) generator.generateDocument(document, "statement", docBean);

			try (OutputStream outputStream = new FileOutputStream("/temp/thefilename.pdf")) {
				out.writeTo(outputStream);
			}
		} catch (Exception e) {
			
			e.printStackTrace();
			throw new StatementException ();
		}

	}

}
