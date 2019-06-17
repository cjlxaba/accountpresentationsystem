/**
 * 
 */
package za.ac.wits.aps.service;

import java.util.List;

import za.ac.wits.domain.customer.UserCredential;

/**
 * @author f4780027
 *
 */
public interface ICustomer {

	List <UserCredential> getUsersRegisteredForBilling() ;
}
