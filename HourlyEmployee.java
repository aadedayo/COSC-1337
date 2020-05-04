/*Adedayo Adebanjo	
 * COSC 1337 002
 * 3/30/2020
 * Purpose: To encapsulate information for a Hourly employee (Lab10L3)
 */

package employeeSystem;

/**Encapsulates a Hourly Employee
 * @author aaded
 *
 */
public class HourlyEmployee extends Employee{
	/** Employee's hours*/
	protected double hours;
	/** Employee's wage*/
	protected double wage;
	
	/** Creates a new hourly employee from input variable
	 * 
	 * @param firstName of the employee
	 * @param lastName of the employee
	 * @param eid of the employee
	 * @param wage of the employee
	 */
	
	public HourlyEmployee(String firstName, String lastName, String eid, double wage) {
		super(firstName, lastName, eid);
		setWage(wage);
	}

	/** Returns the hours of the employee
	 * @return the hours
	 */
	public double getHours() {
		return hours;
	}

	/** Sets the hours of the employee
	 * @param hours the hours to set
	 */
	public void setHours(double hours) {
		if (hours >= 0)
			this.hours = hours;
		else
			this.hours = 0;
	}

	/** Returns the wage of the employee
	 * @return the wage
	 */
	public double getWage() {
		return wage;
	}

	/** Sets the wage of the employee
	 * @param wage the wage to set
	 */
	public void setWage(double wage) {
		if (wage >= 0)
			this.wage = wage;
		else
			this.wage = 0;
	}
	
	/**returns a user-friendly String version of a Hourly Employee
	 * 
	 * @return the String*/
	
	@Override
	public String toString() {
		return "Hourly " + super.toString() +"\nWage: " +getWage();
	}
	
	
	
}
