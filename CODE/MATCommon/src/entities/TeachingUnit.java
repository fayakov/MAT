package entities;

import java.io.Serializable;

public class TeachingUnit implements Serializable {

	int tuNumber;
	String tuName;
	
	public int getTuNumber() {
		return tuNumber;
	}
	public void setTuNumber(int tuNumber) {
		this.tuNumber = tuNumber;
	}
	public String getTuName() {
		return tuName;
	}
	public void setTuName(String tuName) {
		this.tuName = tuName;
	}
}
