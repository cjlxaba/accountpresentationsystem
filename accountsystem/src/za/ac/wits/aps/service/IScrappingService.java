package za.ac.wits.aps.service;

import java.io.IOException;
import java.util.List;

public interface IScrappingService {
 
	public List <String> scanDirectoryById (String idNumber) throws IOException;
}
