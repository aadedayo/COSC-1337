/* Adedayo Adebanjo							`
 * COSC 1337 002
 * 02/13/2020
 * Purpose: To test  car and airplane class (Lab7L3)
  */
package automobile;

/**The test class for Lab7L3 that test car and airplane class
 * 
 * @author aadebanjo
 *
 */
public class Lab7L3 {

	/**The entry point for the program that tests car and airplane
	 * 
	 * @param args NOT USED
	 */
	public static void main(String[] args) {
		//create a Car and an Airplane
		Car myCar = new Car();
		Airplane myPlane = new Airplane("model",0,0.0);
		
		//print out the info for the car and the airplane that you created
		System.out.println(myCar);
		System.out.println(myPlane);
	}//end main

}
