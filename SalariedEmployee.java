/*Adedayo Adebanjo	
 * COSC 1337 002
 * 3/30/2020
 * Purpose: To encapsulate information for a salaried employee (Lab10L3)
 */
package employeeSystem;

/**Encapsulates a Salaried Employee
 * @author aaded
 *
 */
public class SalariedEmployee extends Employee {
	/** Employee's salary*/
	private double salary;
	
	/**Creates a new salary employee from input variable
	 * 
	 * @param firstName of the employee
	 * @param lastName of the employee
	 * @param eid of the employee
	 * @param salary of the employee
	 */
	
	public SalariedEmployee(String firstName, String lastName, String eid, double salary) {
		super(firstName, lastName, eid);
		setSalary(salary);
	}

	/** Returns the salary of the employee
	 * @return the salary
	 */
	public double getSalary() {
		return salary;
	}

	/** Sets the salary of the employee
	 * @param salary the salary to set
	 */
	public void setSalary(double salary) {
		if (salary >= 0)
			this.salary = salary;
		else
			this.salary = 0;
	}
	

	/**returns a user-friendly String version of a Salary Employee
	 * 
	 * @return the String*/
	
	@Override
	public String toString() {
		return "Salary " + super.toString() +"\nSalary: " +getSalary();
	}
	
}
