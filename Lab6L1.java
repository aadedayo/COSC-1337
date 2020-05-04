/* Adedayo Adebanjo					
 * COSC 1337 002
 * 01/30/2020
 * Purpose: To process students using a loop (Lab6L1)
 * Insight: 
 *  */
package student;

import java.util.Scanner;

public class Lab6L1 {

	public static void main(String[] args) {
		// create a scanner and a string called name
		Scanner myInput = new Scanner(System.in);
		String name;
		
		// create a do while loop to read in student
		do {
			// read in all relevant input
			System.out.println("Please enter a student's name: ");
			name = myInput.nextLine();
			
			// Only prompt them for the rest of the input if name != done
			if (!name.equals("done")) {
				System.out.println("Please enter a student's sid: ");
				String sid = myInput.nextLine();
				System.out.println("Please enter a student's GPA: ");
				double gpa = myInput.nextDouble();
				System.out.println("Please enter a student's number of hours: ");
				int numberOfHours = myInput.nextInt();
				
				// Throw away any trailing white space
				myInput.nextLine();
				
				//create and print out the student
				Student myStudent = new Student(name,sid,gpa,numberOfHours);
				System.out.println(myStudent);
			}
		} while (!name.equals("done"));
		
		//close the scanner
		myInput.close();

	}

}
