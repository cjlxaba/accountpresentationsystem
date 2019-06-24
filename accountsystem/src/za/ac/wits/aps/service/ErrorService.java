/**
 * 
 */
package za.ac.wits.aps.service;

import java.util.List;

import za.ac.wits.aps.repository.ErrorHandlingDAO;

/**
 * @author f4780027
 *
 */
public abstract class  ErrorService implements IErrorService{

	private ErrorHandlingDAO errorRepository = new ErrorHandlingDAO ();
	
	@Override
	public abstract String handleOccurError();

	@Override
	public void logOccurError(List<String> xmlErrors) {
		
		errorRepository.logErrors(xmlErrors);
		
	}


}
