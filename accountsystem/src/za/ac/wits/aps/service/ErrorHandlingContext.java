/**
 * 
 */
package za.ac.wits.aps.service;

import java.util.List;

/**
 * @author f4780027
 *
 */
public class ErrorHandlingContext {

	private IErrorService strategy;
	
	public void setErrorStrategy (IErrorService strategy){
		
		this.strategy = strategy;
	}
	
	public String handleOccurError (){
		
		return strategy.handleOccurError();
		
	}
	
	public void logOccurError (List <String> xmlErrors){
		
		strategy.logOccurError(xmlErrors);
	}
}
