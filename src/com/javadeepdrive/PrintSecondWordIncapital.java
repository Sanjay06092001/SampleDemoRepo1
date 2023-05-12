package com.javadeepdrive;
/**
 * print the second word in capital letter or not print less
 * @author sraja
 *Date 06.05.2023
 */
import java.util.*;
public class PrintSecondWordIncapital {
	public static void main(String args[]) {
		// To get the input from the user
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the String : ");
		String str = scan.nextLine();
		//splitting the words
		String secondWord[] = str.split(" ");
		//checking conditions length of the sentence
		if(secondWord.length<2)
			System.out.println("Less");
		// The second word is converted to upper case
		else
			System.out.println(secondWord[1].toUpperCase());
		scan.close();
	}
}