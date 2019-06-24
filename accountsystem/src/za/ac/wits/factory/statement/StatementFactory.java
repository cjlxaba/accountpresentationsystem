/**
 * 
 */
package za.ac.wits.factory.statement;

import za.ac.wits.aps.exception.StatementException;
import za.ac.wits.domain.statement.Statement;
import za.ac.wits.domain.statement.StatementType;

/**
 * @author f4780027
 *
 */
public class StatementFactory {

	public static Statement StatementTransformerService(String statementType, Object data) throws StatementException {

		statementType = StatementType.find(statementType).getResponseCode();
		Statement statement;
       
		switch (statementType) {

		case "TELECOM_CARD_BILLING_TYPE": {
			statement = StatementProvider.generateTelecomStatement(data);
			StatementProvider.generateRequiredStatement().generateBillingStatement(statement);
		}

		case "CREDIT_CARD_BILLING_TYPE": {
			statement = StatementProvider.generateCreditStatement(data);
			StatementProvider.generateRequiredStatement().generateBillingStatement(statement);
		}

		case "MUNICIPALITY_BILLING_TYPE":
			statement = StatementProvider.generateMunicipalStatement(data);
			StatementProvider.generateRequiredStatement().generateBillingStatement(statement);

		default:
			return null;
		}

	}

}
