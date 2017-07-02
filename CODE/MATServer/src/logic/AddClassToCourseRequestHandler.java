/*
 * 
 */
package logic;

import java.io.IOException;
import java.util.ArrayList;

import DAL.CDALError;
import DAL.CDal;
import communication.*;
import entities.CClass;
import entities.Student;
import ocsf.server.ConnectionToClient;
import utils.Handler;

/**
 * The Class AddClassToCourseRequestHandler.
 */
public class AddClassToCourseRequestHandler implements Handler {

	/* (non-Javadoc)
	 * @see utils.Handler#handle(communication.Message, java.lang.Object)
	 */
	public void handle(Message msg, Object obj) {
		ConnectionToClient client = (ConnectionToClient) obj;
		AddClassToCourseRequest addClassToCourseMsg = (AddClassToCourseRequest)msg;
				
		CDALError error = new CDALError();
		boolean requestSecceded = CDal.addCourseToClass(addClassToCourseMsg.getClassId(), addClassToCourseMsg.getCourseId());
		ArrayList<Student> excludedStudents = null;
		// TODO check the pre conditions of all student in class
		
		/*
		ArrayList<Integer> prevCourses = CDal.getPrevCourses(addClassToCourseMsg.getCourseId());
		CClass classData = CDal.getClassData(addClassToCourseMsg.getClassId(), error);
		ArrayList<Student> studentsInClass = classData.getStudentList();		
		ArrayList<Student> excludedStudents = new ArrayList<Student>();
		
		for (Student student : studentsInClass) {
			if (!CDal.isStudentFinishedPrevCourse(student.getId(), addClassToCourseMsg.getCourseId()))
			{
				excludedStudents.add(student);
				requestSecceded = CDal.removeStudentFromCourseWithClass(addClassToCourseMsg.getCourseId(), addClassToCourseMsg.getClassId(), student.getId());
			}			
		}
		*/
		
		AddClassToCourseResponse res = new AddClassToCourseResponse(requestSecceded, excludedStudents, error.getString());
		try {
			client.sendToClient(res);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
