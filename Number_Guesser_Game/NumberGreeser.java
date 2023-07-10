package numberGreeser;

import java.util.Scanner;
import java.util.Random;

public class NumberGreeser {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Random random = new Random();
		
		double randomnumber = random.nextInt(100);
		
		//int randomnumber = ; 
		int rounds = 1;
		
		int result = 0; 
		double number = 0;
		
		while (rounds<=6) {
			
			System.out.println("Round " + rounds);
			
			System.out.print("Enter a Number: ");
			number = sc.nextDouble(); // 35
			if (number == randomnumber) {
				result = 1;
				break;
			} else if (number < randomnumber) {
				System.out.println("Number is low, Enter a Higher Number.");
			} else if (number > randomnumber) {
				System.out.println("Number is high, Enter a Smaller Number.");
			} else {
				System.out.println("Invalid Input :("); 
			}
			
			rounds++; //rounds = 2
		}
		///
		
		if (result==1) {
			System.out.println("You win.");
		} else {
			System.out.println("You loose.");
			System.out.println("The Number was " + randomnumber);
		}
	}

}
