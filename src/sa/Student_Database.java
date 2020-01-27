/**
 * 
 */

package sa;

/**
 * @author HX399ZY
 *
 */
import java.util.*;

public class Student_Database {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Student st1 = new Student("Danielle", "8997908784");
		System.out.println("A new student is registered");
		st1.enroll(Student[0] course = "geo");
		System.out.println("Hey Dude");
		
		
	}

}

class Student {
	private static int id = 0;
	private String user_id;
	private String name;
	private String ssn;
	private String email;
	private Student[] course = new Student[5];
	
	public Student(String name, String ssn) {
		this.name = name;
		this.ssn = ssn;
		setUser_id();
		setEmail();
	
	}
	

	private void setUser_id() {
		
		int b = 9000;
		int a = 1000;		
		int randnum = (int) (Math.random() * ((b - a) + a));
		user_id = id + randnum + ssn.substring(6);
		System.out.println("Your User Id is :\t" + user_id );
		
	}
	
	private void setEmail() {
		email = name.toLowerCase() +"@spyridonalifragkis.com";
		System.out.println("Your email is :\t"+email);
		
	}
	
	public void enroll(Student[] course) {
		
		this.course = course;
		System.out.println("Your courses are :\t" + this.course);
		
	}
	
	public void pay() {
		
		
	}
	
	public void checkBalance() {
		
		
	}
	
	public void showCourses() {
		
		
	}
	
	
}