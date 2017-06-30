package entities;

import javafx.beans.property.SimpleBooleanProperty;
import javafx.beans.property.SimpleIntegerProperty;

public class Requests {

	private final SimpleIntegerProperty requestNumber ;
	private final SimpleIntegerProperty userId ;
	private final SimpleIntegerProperty classNumber ;
	private final SimpleIntegerProperty courseId ;
	private final SimpleBooleanProperty isHandled ;
	private final SimpleBooleanProperty isConfirmed ;



	public Requests(int requestNunber, int userId, int classNumber, int courseId, boolean isHandled, boolean isConfirmed) {
		
		this.requestNumber = new SimpleIntegerProperty(requestNunber);
		this.userId = new SimpleIntegerProperty(userId);
		this.classNumber = new SimpleIntegerProperty(classNumber);
		this.courseId = new SimpleIntegerProperty(courseId);
		this.isHandled = new SimpleBooleanProperty(isHandled);
		this.isConfirmed = new SimpleBooleanProperty(isConfirmed);
	}



 public Integer getrequestNunber(){
	 return requestNumber.get();
 }
 
 public void setrequestNunber(Integer v){
	 requestNumber.set(v);
 }
	
 public Integer getuserId(){
	 return userId.get();
 }
 
 public void setuserId(Integer v){
	 userId.set(v);
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
