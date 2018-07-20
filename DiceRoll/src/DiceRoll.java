import java.util.*;
public class DiceRoll {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//start of method

		//variables needed for program
		int total;
		int newStreak = 1;
		int streak = 2;
		int totalIs1 = 0;
		int totalIs2 = 0;
		int totalIs3 = 0;
		int totalIs4 = 0;
		int totalIs5 = 0;
		int totalIs6 = 0;

		double  twoPercent = 0;
		double  threePercent = 0;
		double  fourPercent = 0;
		double  fivePercent = 0;
		double  sixPercent = 0;

		//intro to program and purpose
		System.out.println("Today we are going to generate 2 random dice and tally the results of their random combined rolls");
		System.out.println("At the bottom of the results, the longest streak will also be listed");

		//variable for while loop
		boolean validInput = true;
		//declaration of scanner before try/catch
		Scanner userInput = new Scanner(System.in);

		//test for valid input
		while (validInput){
			try {
				System.out.print(" \n" + "Please enter the number of trials you would like to be performed:");
				int numberOfRolls = Integer.parseInt(userInput.nextLine());

				//Stop from calling for anything else
				userInput.close();

				//declaring of variables for die 1 and die 2
				int die1[] = new int[numberOfRolls];
				int die2[] = new int[numberOfRolls];


				//create an array for each die roll so that they can each be saved for recalling streak
				int[] array = new int[numberOfRolls];   
				for (int i=1; i<array.length; i++ ) {
					die1[i] = (int) ((Math.random() * 6) + 1);
					die2[i] = (int) ((Math.random() * 6) + 1);
					total = die1[i] + die2[i];

					//streak checker
					int lastTotal = die1[i-1] + die2[i-1];          
					if (lastTotal == total) {
						streak++;
						if (streak > newStreak) {
							newStreak = streak;
						} 
					} else {
						streak = 1;
					}

					//count total of each numbered possibility rolled
					if (total == 2) {
						totalIs2++;
					}
					if (total == 3) {
						totalIs3++;
					}
					if (total == 4) {
						totalIs4++;
					}
					if (total == 5) {
						totalIs5++;
					}
					if (total == 6) {
						totalIs6++;
					}

					//calculate percent of each number rolled
					twoPercent = (totalIs2 / numberOfRolls);
					threePercent = (totalIs3 / numberOfRolls);
					fourPercent = (totalIs4 / numberOfRolls);
					fivePercent = (totalIs5 / numberOfRolls);
					sixPercent = (totalIs6 / numberOfRolls);          
				}


				//results
				System.out.println("\n" + "Total Results:");
				System.out.println("\n" + "Total 2  happened " + totalIs2 + " times which is " + twoPercent + "%");
				System.out.println("Total 3  happened " + totalIs3 + " times which is " + threePercent + "%");
				System.out.println("Total 4  happened " + totalIs4 + " times which is " + fourPercent + "%");
				System.out.println("Total 5  happened " + totalIs5 + " times which is " + fivePercent + "%");
				System.out.println("Total 6  happened " + totalIs6 + " times which is " + sixPercent + "%");

				//stop the loop
				validInput = false;
			}
			//catch exception and call for new input
			catch(Exception e){
				System.out.println("\n" + "Your input was not a number. Please try again: ");
			}
		}
	}
}      
