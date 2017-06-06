package entities;

import java.io.Serializable;

public class Teacher implements Serializable
{
	private int id;	
	private String firstName;
	private String lastName;
	private int maxHours;
	private int teachingUnit;
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
	public int getMaxHours() {
		return maxHours;
	}
	public void setMaxHours(int maxHours) {
		this.maxHours = maxHours;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public int getTeachingUnit() {
		return teachingUnit;
	}
	public void setTeachingUnit(int teachingUnit) {
		this.teachingUnit = teachingUnit;
	}

}
