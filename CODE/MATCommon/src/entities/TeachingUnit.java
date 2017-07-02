package entities;

import java.io.Serializable;


/**
 * The Class TeachingUnit.
 */
public class TeachingUnit implements Serializable {

	/** The tu number. */
	int tuNumber;
	
	/** The tu name. */
	String tuName;
	
	/**
	 * Gets the tu number.
	 *
	 * @return the tu number
	 */
	public int getTuNumber() {
		return tuNumber;
	}
	
	/**
	 * Sets the tu number.
	 *
	 * @param tuNumber the new tu number
	 */
	public void setTuNumber(int tuNumber) {
		this.tuNumber = tuNumber;
	}
	
	/**
	 * Gets the tu name.
	 *
	 * @return the tu name
	 */
	public String getTuName() {
		return tuName;
	}
	
	/**
	 * Sets the tu name.
	 *
	 * @param tuName the new tu name
	 */
	public void setTuName(String tuName) {
		this.tuName = tuName;
	}
}
