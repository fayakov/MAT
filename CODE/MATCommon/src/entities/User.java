package entities;

import java.io.Serializable;

public class User implements Serializable
{
	private int id;	
	private String firstName;
	private String lastName;
	private String password;
	private EUserType userType;
	private boolean isLogged;
	private boolean isLocked;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	
	public EUserType getUserType(){
		return userType;
	}

	public void setUserType(EUserType userType) {
		this.userType = userType;
	}
	
	public Boolean getIsLogged() {
		return isLogged;
	}
	
	public void setIsLogged(boolean isLogged) {
		this.isLogged = isLogged;
	}
	
	public Boolean getIsLocked() {
		return isLocked;
	}
	
	public void setIsLocked(boolean isLocked) {
		this.isLocked = isLocked;
	}
}
