import java.util.Scanner;
import java.util.Random;

public class Lab6 {

	public static void main(String[] args) {
	
		//begin w prompt
		System.out.println("Welcome to the Grand Circus Casino!");
		System.out.println("");
		System.out.println("How many sides should each die have?");
		
		//scan the dice and initialize the thing 
		Scanner cont = new Scanner(System.in);
		Scanner numDieSides = new Scanner(System.in);
		int dieSides = numDieSides.nextInt();
		
		String userInput;
		do { 
			int dice1 = (int) (Math.random() * dieSides);
			int dice2 = (int) (Math.random() * dieSides);
			System.out.println("roll :");
			System.out.println(dice1);
			System.out.println(dice2);
			System.out.println("Roll again? (y/n):");
			
			userInput = cont.next();
		} while (userInput.equalsIgnoreCase("Y"));
		

		}	

	

	public static int generateRandomDieRoll(int dieSides) {
		Random rando = new Random();
		int rollin = rando.nextInt(dieSides) + 1;
		return rollin;
		
	}
}