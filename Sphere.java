/* Name: Adedayo Adebanjo
 * COSC 1337 002
 * 02/25/2020
 * Purpose: To encapsulate data about sphere. (Program 4)
 */
package threeDimensional;

/**Encapsulate informations about a sphere*/
public class Sphere {
	/**The sphere's radius*/
	private int radius;

	/**Creates a new sphere with radius of 1*/
	public Sphere() {
		this.radius = 1;
	}

	/**Creates a new sphere with radius depending on user input
	 * @param the radius of the sphere
	 * */
	public Sphere(int radius) {
		setRadius(radius);
	}

	/** Returns the radius of the sphere
	 * 
	 * @return the radius of the sphere.
	 */
	public int getRadius() {
		return radius;
	}

	/** Sets the radius of the sphere
	 * 
	 * @param radius
	 */
	public void setRadius(int radius) {
		this.radius = radius;
	}

	/** Returns the String version of sphere
	 * 
	 * @return the String version of sphere
	 */
	@Override
	public String toString () {
		return "Sphere: "+ radius;
	}

	/** Returns the surface area of a sphere
	 * 
	 * @param radius
	 * @return the surface area of a sphere
	 */
	public double getSurfaceAreas() {
		return (4*Math.PI*Math.pow(getRadius(), 2));
	}

	/** Returns the volume of a sphere
	 * 
	 * @param radius
	 * @return the volume of a sphere
	 */
	public double getVolumes() {
		return ((4/3)*Math.PI*Math.pow(getRadius(), 3));
	}

}
