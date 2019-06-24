/**
 * 
 */
package za.ac.wits.aps.service;

import za.ac.wits.error.dto.ERRORTYPE;

/**
 * @author f4780027
 *
 */
public class ErrorPage extends ErrorService{
	
	
	@Override
	
	public String handleOccurError (){
		
	   return ERRORTYPE.ERROR_PAGE.getResponseCode();
	}
}
