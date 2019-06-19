/**
 * 
 */
package za.ac.wits.aps.service;

import java.util.List;

import za.ac.wits.domain.customer.User;

/**
 * @author f4780027
 *
 */
public interface ICustomer {

	List <User> getUsersRegisteredForBilling(String contextPath) throws Exception;
}
