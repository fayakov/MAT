package entities;

import java.io.Serializable;


/**
 * The Class Teacher.
 */
public class Teacher implements Serializable
{
	
	/** The id. */
	private int id;	
	
	/** The first name. */
	private String firstName;
	
	/** The last name. */
	private String lastName;
	
	/** The max hours. */
	private int maxHours;
	
	/** The teaching unit. */
	private int teachingUnit;
	
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
	 * Gets the max hours.
	 *
	 * @return the max hours
	 */
	public int getMaxHours() {
		return maxHours;
	}
	
	/**
	 * Sets the max hours.
	 *
	 * @param maxHours the new max hours
	 */
	public void setMaxHours(int maxHours) {
		this.maxHours = maxHours;
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
	 * Gets the teaching unit.
	 *
	 * @return the teaching unit
	 */
	public int getTeachingUnit() {
		return teachingUnit;
	}
	
	/**
	 * Sets the teaching unit.
	 *
	 * @param teachingUnit the new teaching unit
	 */
	public void setTeachingUnit(int teachingUnit) {
		this.teachingUnit = teachingUnit;
	}

}
