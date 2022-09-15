package studio2;
import java.util.Scanner;

public class Ruin {

	public static void main(String[] args) {
		Scanner in = new Scanner (System.in);
		System.out.println("What is the amount of money that you start with?");
		int startAmount = in.nextInt();
		System.out.println("What is your chance of winning?");
		double winChance = in.nextDouble();
		System.out.println("What is the win limit?");
		int winLimit = in.nextInt();
		System.out.println("What is the number of total simulations?");
		int totalSimulations = in.nextInt();
		String result = "";
		int numOfLoses = 0;
		
		
		for (int i = 1; i <= totalSimulations; i++)
		{
			int currAmount = startAmount;
			int times = 0;
			
			while (currAmount > 0 && currAmount < winLimit)
			{
				times ++;
				double rdm = Math.random();
				if (rdm > winChance) //loses $1
				{
				   currAmount--;
				   
				}
				else
				{
					currAmount ++;
					
				}
				if (currAmount == 0)
				{
					result = "LOSE";
					numOfLoses ++;
				}
				if (currAmount == winLimit)
				{
					result = "WIN";
				}
					
			}
			
			System.out.println("Simulation " + i + ": " + times + " " + result);
			
			
		}
		double alpha = (1-winChance)/winChance;
		double expectedRuin = 0.0;
		if (winChance == 0.5)
		{
			expectedRuin = 1-startAmount/winLimit;
		}
		else
		{
			expectedRuin = (Math.pow(alpha, startAmount)-Math.pow(alpha, winLimit))/(1-Math.pow(alpha, winLimit));
		}
		System.out.println("Losses: " + numOfLoses + " Simulations: " + totalSimulations);
		System.out.println("Ruin Rate from Simulation: " + (double)numOfLoses/totalSimulations + " Expected Ruin Rate: " + expectedRuin);
		
		
		// TODO Auto-generated method stub

	}

}
