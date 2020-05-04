/* Name: Adedayo Adebanjo	
 * COSC 1337 002
 * 02/25/2020
 * Purpose: To use datas in cube and sphere class. (Program 4)
 */
package threeDimensional;

import java.text.DecimalFormat;
import java.util.Scanner;

/**
 * @author aaded
 *
 */
public class Program4 {

	/**
	 * @param args NOT USED
	 */
	public static void main(String[] args) {
		DecimalFormat decimal = new DecimalFormat("0.0");
		Scanner scanner= new Scanner(System.in);
		Cube firstCube = new Cube();
		System.out.println(firstCube);
		System.out.print("Please enter the length of the side for the firstCube: ");
		firstCube.setLengthOfSide(scanner.nextInt());
		Cube secondCube = new Cube(8);
		Cube thirdCube = new Cube(3);
		int accessorValue = firstCube.getLengthOfSide();
		System.out.println("FirstCube's side length is: "+ accessorValue+'\t'+"SecondCube's surface area is:"
				+ decimal.format(secondCube.getSurfaceArea())+'\t'+"ThirdCube's volume is: "+ decimal.format(thirdCube.getVolume())+'\n');
		System.out.println( "First "+firstCube+ '\t' + "Second "+secondCube+ '\t' + "Third "+thirdCube);
		System.out.println();
		
		Sphere firstSphere = new Sphere();
		System.out.println(firstSphere);
		System.out.print("Please enter the radius for the firstSphere: ");
		firstSphere.setRadius(scanner.nextInt());
		Sphere secondSphere = new Sphere(8);
		Sphere thirdSphere = new Sphere(3);
		int accessorValues = firstSphere.getRadius();
		System.out.println("FirstSphere's radius is: "+ accessorValues+'\t'+"SecondSphere's surface area is:"
				+ decimal.format(secondSphere.getSurfaceAreas())+'\t'+"ThirdSphere's volume is: "+ decimal.format(thirdSphere.getVolumes())+'\n');
		System.out.println( "First "+firstSphere+ '\t' + "Second "+secondSphere+ '\t' + "Third "+thirdSphere);
		System.out.println();
		scanner.close();
 
	}

}
