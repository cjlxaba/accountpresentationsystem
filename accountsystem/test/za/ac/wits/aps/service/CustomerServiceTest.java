package za.ac.wits.aps.service;

import java.io.IOException;
import java.util.List;

import org.junit.Test;


import za.ac.wits.domain.customer.User;
import za.ac.wits.domain.customer.UserCredential;

public class CustomerServiceTest extends CustomerService {

	@Test
	public void testAuthenticateUser() {
		
		CustomerService customerService = new CustomerService();
		
		String  contextPath = "/home/phillip/git/accountpresentationsystem/accountsystem/WebContent/";
		
		UserCredential credential = customerService.authenticateUser(contextPath, "user1", "asdfgh1");
		
	}

	@Test
	
	public void testRetrieveAllUsers() throws IOException{
		
		CustomerService customerService = new CustomerService();
		
		String  contextPath = "C:\\Users\\f4780027\\git\\accountpresentationsystem\\accountsystem\\WebContent\\";
		
		List <User> credential = customerService.getUsersRegisteredForBilling(contextPath);		
		
	}
}
