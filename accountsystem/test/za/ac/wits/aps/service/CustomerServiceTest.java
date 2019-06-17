package za.ac.wits.aps.service;

import org.junit.Test;

import za.ac.wits.domain.customer.UserCredential;

public class CustomerServiceTest extends CustomerService {

	@Test
	public void testAuthenticateUser() {
		
		CustomerService customerService = new CustomerService();
		
		String  contextPath = "/home/phillip/git/accountpresentationsystem/accountsystem/WebContent/";
		
		UserCredential credential = customerService.authenticateUser(contextPath, "user1", "asdfgh1");
		
	}

}
