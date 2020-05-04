/*Adedayo Adebanjo`		
 * COSC 1337 002
 * 3/30/2020
 * Purpose: To encapsulate information for an employee (Lab10L3)
 */
 
package employeeSystem;

/**Encapsulates an Employee
 * @author aaded
 *
 */
public class Employee {
	/** Employee's first name*/
	protected String firstName;
	/** Employee's last name*/
	protected String lastName;
	/** Employee's ID*/
	protected String eid;
	
	/** Creates a new employee from input variable
	 * 
	 * @param firstName of the employee
	 * @param lastName of the employee
	 * @param eid of the employee
	 */
	public Employee(String firstName, String lastName, String eid) {
		setFirstName(firstName);
		setLastName(lastName);
		setEid(eid);
	}
	
	/** Returns the first name of the employee
	 * @return the firstName
	 */
	public String getFirstName() {
		return firstName;
	}
	/** Sets the first name of the employee
	 * @param firstName the firstName to set
	 */
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	/** Returns the last name of the employee
	 * @return the lastName
	 */
	public String getLastName() {
		return lastName;
	}
	/** Sets the last name of the employee
	 * @param lastName the lastName to set
	 */
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	/** Returns the ID of the employee
	 * @return the eid
	 */
	public String getEid() {
		return eid;
	}
	/** Sets the ID of the employee
	 * @param eid the eid to set
	 */
	public void setEid(String eid) {
		this.eid = eid;
	}
	
	/**returns a user-friendly String version of an Employee
	 * 
	 * @return the String*/
	
	@Override
	public String toString() {
		return "Employee: " + getFirstName() + " " + getLastName() +"\nEmployee ID: "
				+ getEid();
	}
}
