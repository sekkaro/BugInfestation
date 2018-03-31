// this is the package name that the current class file is in
package edu.handong.csee.java.lab06;

// this imports the scanner class that we can read user input by using the methods.
import java.util.Scanner;

/**
 * Class Lab06 computes the number and volume of bugs.
 * <p>
 * This class has two methods: main method and compteNumberOfBugKill().
 * This class first initializes growth rate of the bugs and volume of one bug. 
 * @author Jun Seob Lee
 *
 */

// lab06 class
public class Lab06 {
	//class variables
	final double GROWTH_RATE =0.95; // initializes and makes the value of growth rate as constant and fixed.
	final double ONE_BUG_VOLUME = 0.002; //initializes and makes the value of the volume of one bug as constant and fixed.

	
	/**
	 * This is the main method where we create a new constructor of Lab06 and call the method to compute the number of bug kills.
	 * <p>
	 * @param args the value that we can give while compiling.
	 */
	
	public static void main(String[] args) {

		Lab06 myCokroch = new Lab06(); // creates the myCokroch instance of the Lab06 class
		myCokroch.compteNumOfBugKill();// the method is used through the newly created constructor and this prints out the computed values.

	}


	/**
	 * This is compteNumOfBugKill() method of the Lab06 class.
	 * <p>
	 * This method computes how much the bugs will be filled within the capacity of the house.
	 * And also calculates the total volume of bugs after weeks through the variables declared in the Lab06 class. 
	 */
	public void compteNumOfBugKill() {


		Scanner keyboard = new Scanner(System.in); // keyboard instance is created to call the methods and get the user input 


		System.out.print("Enter the total volume of your house in cubic feet : ");// guides the user to type the total volume of the house
		double houseVolume = keyboard.nextDouble();// reads the value as double from the user


		System.out.print("Enter the estimate number of roaches in your house: ");// guides the user to enter the estimated number of roaches/bugs at their house
		double startPopulation = keyboard.nextDouble(); // reads the value as double from the user
 
		double  population  = startPopulation;// saves the value read from the user as initial population so that it can be used later 

		double totalBugvolume = population  * ONE_BUG_VOLUME;//  calculates the total volume of the bugs
		
		int countWeek = 0; // initializes the number of weeks 



		// as long as the bug volume is less than the house volume, the statement loops
		while (totalBugvolume < houseVolume) {

			double newBugs = population * GROWTH_RATE; // to use this value later, multiplies the inital bug population and growth rate as the starting value
			double newBugVolume = newBugs * ONE_BUG_VOLUME; // new volume of the bug is calculated by multiplying the above varible with 1 bug volume
			population = population + newBugs; // calculates the actual population now
			totalBugvolume = population  * ONE_BUG_VOLUME; // calculates the total volume with the total population and one bug volume
			countWeek = countWeek + 1; // keeps increasing number of weeks

		}	

		// prints out the message to show the starting population of bugs
		System.out.println("Staring with a roach population of  " + startPopulation );

		// prints out the initial volume of the house
		System.out.println("and a house with a volume of "+   houseVolume +" Cubic feet" );

		// prints out how many weeks have passed
		System.out.println("After " + countWeek +" Week" );

		// prints out how much the house will be filled with how many roaches
		System.out.println("the house will be fiiled with  " + population +" roaches");

		// prints out what will be the final volume of the bugs
		System.out.println("They will fill a volume of " + (int) totalBugvolume + " cubic feet" );

		// shows the message that we better call the experts 
		System.out.println("Better call Debugging Experts Inc.");



	}



}