/* Adedayo Adebanjo				
 * COSC 1337 002
 * 01/30/2020
 * Purpose: Encapsulate a student's information(Lab6L1)
 * Insight: Because getName() might do additional formatting.
 *  */
 
package student;

public class Student {
	// fields  for each students
	String name = "";
	String sid = "";
	double gpa = -1;
	int numberOfHours = -1;
	
	// contructor for student
	public Student(String name, String sid, double gpa, int numberOfHours) {
		setName(name);
		setSid(sid);
		setGpa(gpa);
		setNumberOfHours(numberOfHours);
	}
	
	//getters and setter
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSid() {
		return sid;
	}

	public void setSid(String sid) {
		this.sid = sid;
	}

	public double getGpa() {
		return gpa;
	}

	public void setGpa(double gpa) {
		this.gpa = gpa;
	}

	public int getNumberOfHours() {
		return numberOfHours;
	}

	public void setNumberOfHours(int numberOfHours) {
		this.numberOfHours = numberOfHours;
	}
	
	public String toString() {
		return "Student name: " +getName()+"\n\tStudent ID: "+getSid()+ " GPA: "+getGpa()+" Number of Hours: "+getNumberOfHours();
	}
	
}
