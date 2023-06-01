// Chapter 6 practice project Adil Yousuf	5/31/2023 going over the one he gave us project for randomguess2.java

import javax.swing.JOptionPane;

public class RandomGuess3
{

	public static void main(String[] args) 
	{
	 // variable and constants
	 int userRandomGuess;
	 int computerRandomGuess;
	 String outcome;
	 int attempts = 1;
	 final int LOW = 1;
	 final int HIGH = 10;

	 // input phase
	 userRandomGuess = Integer.parseInt(JOptionPane.showInputDialog(null, "Please enter a number between " + LOW  + " and " + HIGH));

	 // Processing phase
	 computerRandomGuess = (int) (Math.random() * HIGH) + LOW;

	 while(userRandomGuess != computerRandomGuess)
	 {
	 	if(userRandomGuess > computerRandomGuess)
	 	{
	 		outcome = "Sorry, your guess was too high!";
	 	} else {
	 		outcome = "Sorry, your guess was too low!";
	 	}// end of else statement

	 	// input phase
	 	userRandomGuess = Integer.parseInt(JOptionPane.showInputDialog(null, outcome + "\nPlease enter a number between " + LOW + " and " + HIGH));

	 	//incremet the number of attempts before the userGuess is checked again
	 	++attempts;



	 }// end of the while loop
		
	 // output phase
	 JOptionPane.showMessageDialog(null, "You've Won!! \nThe magic number was: " + computerRandomGuess + "\nYou guessed it in " + attempts + " attempt(s)!");

	} // end of main

}// end of class