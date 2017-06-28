package entities;

import javafx.beans.property.SimpleBooleanProperty;
import javafx.beans.property.SimpleIntegerProperty;

public class Table {

	private final SimpleIntegerProperty requestNunber ;
	private final SimpleIntegerProperty studentId ;
	private final SimpleIntegerProperty classNumber ;
	private final SimpleIntegerProperty courseId ;
	private final SimpleBooleanProperty isHandled ;
	private final SimpleBooleanProperty isConfirmed ;



	public Table(int requestNunber, int studentId, int classNumber, int courseId, boolean isHandled, boolean isConfirmed) {
		
		this.requestNunber = new SimpleIntegerProperty(requestNunber);
		this.studentId = new SimpleIntegerProperty(studentId);
		this.classNumber = new SimpleIntegerProperty(classNumber);
		this.courseId = new SimpleIntegerProperty(courseId);
		this.isHandled = new SimpleBooleanProperty(isHandled);
		this.isConfirmed = new SimpleBooleanProperty(isConfirmed);
	}



 public Integer getrequestNunber(){
	 return requestNunber.get();
 }
 
 public void setrequestNunber(Integer v){
	 requestNunber.set(v);
 }
	
 public Integer getstudentId(){
	 return studentId.get();
 }
 
 public void setstudentId(Integer v){
	 studentId.set(v);
 }
 
 public Integer getclassNumber(){
	 return classNumber.get();
 }
 
 public void setclassNumber(Integer v){
	 classNumber.set(v);
 }
 
 public Integer getcourseId(){
	 return courseId.get();
 }
 
 public void setcourseId(Integer v){
	 courseId.set(v);
 }
 
 
 public Boolean getisHandled(){
	 return isHandled.get();
 }
 
 public void setisHandled(Boolean v){
	 isHandled.set(v);
 }
 
 public Boolean getisConfirmed(){
	 return isConfirmed.get();
 }
 
 public void setisConfirmed(Boolean v){
	 isConfirmed.set(v);
 }
}
