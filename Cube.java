/* Name: Adedayo Adebanjo	
 * COSC 1337 002
 * 02/25/2020
 * Purpose: To encapsulate data about cube. (Program 4)
 */
package threeDimensional;

/**Encapsulate informations about a cube*/
public class Cube {
	/**The cube's length of side*/
	private int lengthOfSide;

	/**Creates a new cube with length size of 1*/
	public Cube() {
		this.lengthOfSide = 1;
	}

	/**Creates a new cube with size depending on user input
	 * @param the length of the cube
	 * */
	public Cube(int lengthOfSide) {
		setLengthOfSide(lengthOfSide);
	}

	/** Returns the length of the cube
	 * 
	 * @return the length of the cube.
	 */
	public int getLengthOfSide() {
		return lengthOfSide;
	}

	/** Sets the length of the cube
	 * 
	 * @param lengthOfSide
	 */
	public void setLengthOfSide(int lengthOfSide) {
		this.lengthOfSide = lengthOfSide;
	}

	/** Returns the String version of cube
	 * 
	 * @return the String version of cube
	 */
	@Override
	public String toString () {
		return "Cube: "+ lengthOfSide;
	}

	/** Returns the surface area of a cube
	 * 
	 * @param lengthOfSide
	 * @return the surface area of a cube
	 */
	public double getSurfaceArea() {
		return (6*Math.pow(getLengthOfSide(), 2));
	}

	/** Returns the volume of a cube
	 * 
	 * @param lengthOfSide
	 * @return the volume of a cube
	 */
	public double getVolume() {
		return Math.pow(getLengthOfSide(), 3);
	}

}
