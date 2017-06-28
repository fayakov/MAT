package entities;

import javafx.beans.property.SimpleBooleanProperty;
import javafx.beans.property.SimpleIntegerProperty;

public class Table {

	private final SimpleIntegerProperty requestNunber ;
	private final SimpleIntegerProperty studentId ;
	private final SimpleIntegerProperty classNumber ;
	private final SimpleIntegerProperty courseId ;
	private final SimpleBooleanProperty isHandled ;



	public Table(int requestNunber, int studentId, int classNumber, int courseId, boolean isHandled) {
		
		this.requestNunber = new SimpleIntegerProperty(requestNunber);
		this.studentId = new SimpleIntegerProperty(studentId);
		this.classNumber = new SimpleIntegerProperty(classNumber);
		this.courseId = new SimpleIntegerProperty(courseId);
		this.isHandled = new SimpleBooleanProperty(isHandled);
	}



	public SimpleIntegerProperty getRequestNunber() {
		return requestNunber;
	}



	public SimpleIntegerProperty getStudentId() {
		return studentId;
	}



	public SimpleIntegerProperty getClassNumber() {
		return classNumber;
	}



	public SimpleIntegerProperty getCourseId() {
		return courseId;
	}



	public SimpleBooleanProperty getIsHandled() {
		return isHandled;
	}
	
	
	
}
