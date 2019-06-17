/**
 * 
 */
package za.ac.wits.domain.customer;

/**
 * @author f4780027
 *
 */
public class UserCredential {

	private String tokenKey;
	
	private User user;

	public String getTokenKey() {
		return tokenKey;
	}

	public void setTokenKey(String tokenKey) {
		this.tokenKey = tokenKey;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}
}
