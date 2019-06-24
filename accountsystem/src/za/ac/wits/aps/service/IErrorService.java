package za.ac.wits.aps.service;

import java.util.List;

public interface IErrorService {

	public String handleOccurError ();
	
	public void logOccurError (List <String> xmlErrors);
	
}
