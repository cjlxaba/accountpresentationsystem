package za.ac.wits.aps.service;

import za.ac.wits.error.dto.ERRORTYPE;

public class CredentialError extends  ErrorService {

	@Override
	public String handleOccurError(){
		
		return ERRORTYPE.AUTHORIZATION_ERROR.getResponseCode();
	}
}
