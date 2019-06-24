/**
 * 
 */
package za.ac.wits.factory.statement;

import za.ac.wits.aps.repository.GenerateStatementDAO;
import za.ac.wits.domain.statement.CreditCardStatement;
import za.ac.wits.domain.statement.MunicipalStatement;
import za.ac.wits.domain.statement.TelecomStatement;

/**
 * @author f4780027
 *
 */
public class StatementProvider {

	public static CreditCardStatement generateCreditStatement(Object object) {
           
		return new CreditCardStatement();
	}

	public static MunicipalStatement generateMunicipalStatement(Object object) {

		return new MunicipalStatement();
	}

	public static TelecomStatement generateTelecomStatement(Object object) {

		return new TelecomStatement();
	}
   
	public static GenerateStatementDAO generateRequiredStatement(){
		
		return new GenerateStatementDAO();
	}
	
}
