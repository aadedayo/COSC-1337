/* Adedayo Adebanjo							`
 * COSC 1337 002
 * 02/13/2020
 * Purpose: To encapsulate information about an Airplane  (Lab7L3)
 * Insight: It would be easy. Just generalize some variable names and the appropriately named getters and setters
  */
package automobile;

/**A class that encapsulate information about an Airplane including the
 * model, the miles flown, the amount of fuel used. <hr>
 * other stuff i want to say
 * @author aadebanjo
 *
 */
public class Airplane {
	/**the model of the airplane*/
	private String model;
	/**the number of miles this airplane has flown*/
	private int milesFlown;
	/**the amount of fuel this airplane has used*/
	private double gallonsOfFuel;
	
	/**Creates a new airplane with the input information
	 * 
	 * @param model the model of the airplane
	 * @param milesFlown the number of miles this airplane has flown
	 * @param gallonsOfFuel the amount of fuel this airplane has used
	 */
	public Airplane(String model, int milesFlown, double gallonsOfFuel) {
		setModel(model);
		setMilesFlown(milesFlown);
		setGallonsOfFuel(gallonsOfFuel);
	}

	/**Returns the model of the airplane
	 * 
	 * @return the model of the airplane
	 */
	public String getModel() {
		return model;
	}

	/** Sets the model of the airplane
	 * 
	 * @param model the model of the airplane
	 */
	public void setModel(String model) {
		this.model = model;
	}

	/** Returns the number of miles flown
	 * 
	 * @return the number of miles flown
	 */
	public int getMilesFlown() {
		return milesFlown;
	}

	/** Sets the number of miles flown
	 * 
	 * @param milesFlown the number of miles flown
	 */
	public void setMilesFlown(int milesFlown) {
		this.milesFlown = milesFlown;
	}

	/** Returns the gallon of fuel used by the airplane so far
	 * 
	 * @return the gallon of fuel used
	 */
	public double getGallonsOfFuel() {
		return gallonsOfFuel;
	}

	/**Sets the gallons of fuel used by the airplane so far
	 * 
	 * @param gallonsOfFuel the gallons of fuel used by the airplane so far
	 */
	public void setGallonsOfFuel(double gallonsOfFuel) {
		this.gallonsOfFuel = gallonsOfFuel;
	}
	
	
	/**Gets the fuel efficiency of this airplane. Note that if gallonsOfFuel
	 * <= .001, this method just returns 0.
	 * 
	 * @return the number of miles per gallon for this airplane
	 */
	public double getMilesPerGallon() {
		if (getGallonsOfFuel() > .001)
			return getMilesFlown() / getGallonsOfFuel();
		else
			return 0.0;
	}
	
	/**Returns a String version of this airplane
	 * 
	 * @return the String version of this airplane
	 */
	@Override
	public String toString() {
		return "Airplane: "+getModel()+"\n\tMiles Flown: "+getMilesFlown()+". Fuel Used: "+getGallonsOfFuel()+
				" gallons.\n\tFuel efficiency: "+getMilesPerGallon()+ " mpg.";
	}
	
	/**Returns true iff the two airplanes in question have the same data
	 * 
	 * @param o the object to compare to this airplane
	 * @return true iff the two airplanes in question have the same data
	 */
	@Override
	public boolean equals(Object o) {
		return o.toString().equals(toString());
	}
}
