import java.util.Scanner;
import java.util.Arrays;
public class ArraysUserInAndSort {

	public static void main(String[] args) {
	Scanner keyboard = new Scanner(System.in);
	int i;
	//prompt user to enter the size of array
	System.out.println("Enter an integer to set size of array: ");
	int size = keyboard.nextInt();
	
	//declare array
	int myArray[] = new int[size];
	
	
	System.out.println("Enter values to be stored in array: "); 
	//this loop stores the array values
	for(i = 0; i < size; i++) {
		myArray[i] = keyboard.nextInt();
	}
	
	//have to loop through array to print it
	System.out.print("Here is the array: ");
	for (i = 0; i< size; i++)
	{
	System.out.print(myArray[i]);
	}
	
//	System.out.println("The sorted array is: "  + Arrays.sort(myArray[i]);
	

	
	}
	
	public static void sort(int array[], int x) {
		for(int i = 0; i < x; i++) {
			
		}
	}

}

