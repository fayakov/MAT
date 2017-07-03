package entities;

import java.io.Serializable;


/**
 * The Class User.
 */
public class User implements Serializable
{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/** The id. */
	private int id;	
	
	/** The first name. */
	private String firstName;
	
	/** The last name. */
	private String lastName;
	
	/** The password. */
	private String password;
	
	/** The user type. */
	private EUserType userType;
	
	/** The is logged. */
	private boolean isLogged;
	
	/** The is locked. */
	private boolean isLocked;
	
	
	/**
	 * Instantiates a new user.
	 */
	public User() {
		super();
	
	}


	/**
	 * Instantiates a new user.
	 *
	 * @param id the id
	 * @param firstName the first name
	 * @param lastName the last name
	 * @param password the password
	 * @param userType the user type
	 * @param isLogged the is logged
	 * @param isLocked the is locked
	 */
	public User(int id, String firstName, String lastName, String password, EUserType userType, boolean isLogged,
			boolean isLocked) {
		super();
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.password = password;
		setUserType(userType);
		this.isLogged = isLogged;
		this.isLocked = isLocked;
	}
	
	/**
	 * Sets the all user data.
	 *
	 * @param user the new all user data
	 */
	public void setAllUserData(User user){
		this.id = user.getId();
		this.firstName = user.getFirstName();
		this.lastName = user.getLastName();
		this.password = user.getPassword();
		setUserType(user.getUserType());
		this.isLogged = user.getIsLogged();
		this.isLocked = user.getIsLocked();
	}

	/**
	 * Gets the id.
	 *
	 * @return the id
	 */
	public int getId() {
		return id;
	}
	
	/**
	 * Sets the id.
	 *
	 * @param id the new id
	 */
	public void setId(int id) {
		this.id = id;
	}
	
	/**
	 * Gets the first name.
	 *
	 * @return the first name
	 */
	public String getFirstName() {
		return firstName;
	}
	
	/**
	 * Sets the first name.
	 *
	 * @param firstName the new first name
	 */
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	
	/**
	 * Gets the last name.
	 *
	 * @return the last name
	 */
	public String getLastName() {
		return lastName;
	}
	
	/**
	 * Sets the last name.
	 *
	 * @param lastName the new last name
	 */
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	
	/**
	 * Gets the password.
	 *
	 * @return the password
	 */
	public String getPassword() {
		return password;
	}
	
	/**
	 * Sets the password.
	 *
	 * @param password the new password
	 */
	public void setPassword(String password) {
		this.password = password;
	}
	
	/**
	 * Gets the user type.
	 *
	 * @return the user type
	 */
	public EUserType getUserType(){
		return userType;
	}

	/**
	 * Sets the user type.
	 *
	 * @param userType the new user type
	 */
	public void setUserType(EUserType userType) {
		this.userType = userType;
	}
	
	/**
	 * Gets the checks if is logged.
	 *
	 * @return the checks if is logged
	 */
	public Boolean getIsLogged() {
		return isLogged;
	}
	
	/**
	 * Sets the checks if is logged.
	 *
	 * @param isLogged the new checks if is logged
	 */
	public void setIsLogged(boolean isLogged) {
		this.isLogged = isLogged;
	}
	
	/**
	 * Gets the checks if is locked.
	 *
	 * @return the checks if is locked
	 */
	public Boolean getIsLocked() {
		return isLocked;
	}
	
	/**
	 * Sets the checks if is locked.
	 *
	 * @param isLocked the new checks if is locked
	 */
	public void setIsLocked(boolean isLocked) {
		this.isLocked = isLocked;
	}
}

