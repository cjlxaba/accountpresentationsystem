/**
 * 
 */
package za.ac.wits.aps.service;

import java.util.List;

import za.ac.wits.aps.dto.viewbean.Login;
import za.ac.wits.domain.customer.User;

/**
 * @author f4780027
 *
 */
public interface ICustomerService {

	List <User> getUsersRegisteredForBilling(String contextPath) throws Exception;
	public boolean logApsUser (Login userDtails);
}
