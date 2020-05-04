/* Adedayo Adebanjo							`
 * COSC 1337 002
 * 02/13/2020
 * Purpose: To encapsulate information about a car  (Lab7L3)
  */
package automobile;

import java.text.DecimalFormat;

/** Encapsulates information about a car*/
public class Car {
	/** the name of the car*/
	private String model;
	/** the number of miles driven*/
	private int milesDriven;
	/** the amount of gas used */
	private double gallonsOfGas;
	/** the format for printing out decimals*/
	private DecimalFormat decFormat = new DecimalFormat("0.0");
	
	
	/** Create a new car with model as "unknown", milesDriven at 0, and gallomsOfGas at 0*/
	public Car() {
		setModel("unknown");
	}
	
	/** Create a new car with the input information
	 * 
	 * @param model the model name of the car
	 * @param milesDriven the miles that have been driven in the car
	 * @param gallonsOfGas the amount of gas the car has used
	 */
	public Car(String model, int milesDriven, double gallonsOfGas) {
		setModel(model);
		setMilesDriven(milesDriven);
		setGallonsOfGas(gallonsOfGas);
	}
	
	/** Returns the model of the car
	 * 
	 * @return the model of the car
	 */
	public String getModel() {
		return model;
	}
	
	/** Set the model of the car
	 * 
	 * @param model
	 */
	public void setModel(String model) {
		this.model = model;
	}
	
	/** Returns the number of miles driven
	 * 
	 * @return the number of miles driven
	 */
	public int getMilesDriven() {
		return milesDriven;
	}
	
	/** Set the number of miles driven IF the input is greater than 0, otherwise sets it to 0
	 * 
	 * @param milesDriven the number of miles driven
	 */
	public void setMilesDriven(int milesDriven) {
		if (milesDriven > 0)
			this.milesDriven = milesDriven;
		else
			this.milesDriven = 0;
	}
	
	/** Return the gallon of gas used by the car
	 * 
	 * @return the gallon of gas used by the car
	 */
	public double getGallonsOfGas() {
		return gallonsOfGas;
	}
	
	/** Set the amount of gas that has been used IF the input is greater than 0, otherwise sets it to 0
	 * 
	 * @param gallonsOfGas the amount of gas used by the car
	 */
	public void setGallonsOfGas(double gallonsOfGas) {
		if (gallonsOfGas > 0)
			this.gallonsOfGas = gallonsOfGas;
		else
			this.gallonsOfGas = 0;
	}
	
	/**Get the fuel efficiency of the car IF the amount of gas used is greater than 0.001, otherwise, return 0.
	 * 
	 * @return the fuel efficiency of the car
	 */
	public double getMilesPerGallon() {
		if (getGallonsOfGas() > .001)
			return getMilesDriven()/getGallonsOfGas();
		return 0.0;
	}
	
	/**Get the amount of money spent on gas for this car so far
	 * 
	 * @param pricePerGallon the price per gallon of gas
	 * @return the amount of money spent on gas
	 */
	public double getMoneySpentOnGas(double pricePerGallon) {
		return pricePerGallon*getGallonsOfGas();
	}
	
	/** Returns true iff the input car has the same data as this car
	 * @param o the object to compare this car to
	 * @return true iff they are equal
	 */
	@Override
	public boolean equals(Object o) {
		if (!(o instanceof Car))
			return false;
		Car otherCar = (Car) o ;
		return otherCar.getModel().equals(getModel()) && otherCar.getMilesDriven() == getMilesDriven() &&
				otherCar.getGallonsOfGas() == getGallonsOfGas();
	}
	
	/**Returns the String version of the car
	 * @return the String version of the car
	 */
	@Override
	public String toString() {
		return "Car:"+getModel()+"\n\tMiles Driven:"+getMilesDriven()+". Gas Used: "+getGallonsOfGas()+
				" Fuel Efficiency: "+decFormat.format(getMilesPerGallon())+" mpg.";
	}
}
