/**
 * 
 */
package za.ac.wits.scraper.dto;

import za.ac.wits.domain.account.Account;
import za.ac.wits.domain.customer.Customer;

public class ScrapeRequest {

	private Customer customer ;
	
	private Account account;
	
	public Customer getCustomer() {
		return customer;
	}
	 
	public  ScrapeRequest(ScrapeRequestBuilder scrapeRequestBuilder) {
		
		this.customer = scrapeRequestBuilder.customer;
	}
	public static class ScrapeRequestBuilder {
		
		private Customer customer ;
		
		private Account account;
		
		public ScrapeRequestBuilder buildWithCustomer(Customer customer) {
			
			this.customer = customer;
			return this;
		}
	}     
}
