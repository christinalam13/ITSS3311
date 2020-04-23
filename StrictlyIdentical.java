//Sample Run: Enter 5 elements list 1: 1, 2, 3, 4, 5
//Enter 5 elements list 2: 1, 2, 3, 4, 5 


import java.util.Scanner;
public class StrictlyIdentical {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int[] array1 = new int[5]; //Declaring array variable values, creates array, and assign its size
		int[] array2 = new int[5]; //Declaring array variable values, creates array, and assign its size
		for(int i = 0; i<5; i++) { // i = 0, i < 5 means i(=0) is less than 5, i++ is +1 depending on code
		
		System.out.print("Enter " + (i+1) + "th number of first array >> "); //Execute print out statement
		array1[i] = input.nextInt(); //First array options will print out 
		}
		for(int i = 0; i<5; i++) { //Declaring array variable values, creates array, and assign its size

		System.out.print("Enter " + (i+1) + "th number of second array >> "); //Execute print out statement
		array2[i] = input.nextInt(); //Second array options will print out
		}
		if(equals(array1, array2)){ //Declares if array 1 and 2 are equal then will print out either option

		System.out.println("Both arrays are strictly identical."); //Execute print out statement
		} else { //If it is not identical then, it will print other 

		System.out.println("Both arrays are not strictly identical."); //Execute print out statement
		}
		}

		public static boolean equals(int[] array1, int[] array2) { 

		// The arrays must not be null and must have equal length
		if(array1 == null || array2 == null || array1.length != array2.length) return false;
		boolean allEqual = true;
		for(int i = 0; i<array1.length; i++) {
		if(array1[i] != array2[i]) {
		allEqual = false;
		break;
		}
		}
		return allEqual;
	}

}
