package jsjf;

import java.util.*;

public class Application {

	public static void main(String[] args) {
		
		String s; //variable holds the sentence input by the user
		String temp; //holds the users decision on whether to play again or not
		
		Scanner scan=new Scanner(System.in);
		System.out.print("Type a sentence: ");
		s=scan.nextLine();
		
		/**
		 * Stores the sentence the user entered
		 */
		
		s=reverseString(s);
		System.out.println("Reversed: " +s);
		
		/**
		 * calls the reverseString method and prints the string after it has been reversed
		 */

		System.out.println("Would you like to enter another sentence? (Y/N) ");
		temp=scan.nextLine();
		if(temp.contentEquals("Y")) {
			System.out.print("Type a sentence: ");
			s=scan.nextLine();
		s=reverseString(s);
		System.out.println("Reversed: " +s);
		}else
			System.out.println("<GOODBYE>");
		
		/**
		 * Asks the user if they want to play again, and will allow them to do so. If the player chooses no or finishes a game then the closing "Goodbye" line is printed
		 */
		
	}//ends main method
	
	public static String reverseString(String s) {
		
		ArrayStack as = new ArrayStack();
		String currentWord=""; //Will hold the inputted sentence with no spaces
		String reversedWord=""; //Will hold the inputted sentence after it has been reversed.
		for(int i=0; i<s.length(); i++) {
			if(s.charAt(i)!=' ') {
				currentWord=currentWord+s.charAt(i);
			}
			
			/**
			 * This for loop will go through the sentence that has been entered and if the character at the increment isn't a space it is passed into the currentWord
			 */
			
			if(s.charAt(i)==' ' || i==s.length()-1){
				for(int x=0; x<currentWord.length(); x++) {
					as.push(currentWord.charAt(x));
				}
				
				/**
				 * This if statement determines if the current increment is a space or if the sentence has ended, if it has then it is added to the currentWord 
				 */
				
				for(int x=0; x<currentWord.length(); x++) {
					reversedWord=reversedWord+ as.pop();
				}
				
				/**
				 * This for loops pops each of the letters that have been added to the ArrayStack so that they will be stored in the reverse order from when they were entered
				 */
				
				reversedWord=reversedWord+' ';
				currentWord="";
				
				/**
				 * Adds the spaces between the words in the sentence so that it will be printed in reverse of how it was entered 
				 */
				
			}//ends if statement
		}//ends for loop
		
		return reversedWord;
	}//ends reverseString
}//ends class
