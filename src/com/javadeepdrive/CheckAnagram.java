package com.javadeepdrive;
/**
 * to check given two string is same or not
 * @author sraja
 *Date 06.05.2023
 */
import java.util.*;
public class CheckAnagram {
	//by using function check the anagram
	public static void anagram(String s1,String s2) {
		char[] ch1=s1.toCharArray();
		char[] ch2=s2.toCharArray();
		//sorted the character
		Arrays.sort(ch1);
		Arrays.sort(ch2);
		int count =0;
		//check the length of two string if equal process or return 
		if(s1.length()==s2.length()) {
			for(int i=0;i<s1.length();i++) {
			if(ch1[i]==ch2[i])
				count++;
		}
		}
		else
			System.out.println("Entered Two String Size is not Same");
		//check anagram or not
		if(count!=0)
			System.out.println("Anagram");
		else
			System.out.println("Not a Anagram");
}
	public static void main(String[]args) {
		Scanner scan=new Scanner(System.in);
		//get the input from user
		System.out.println("Enter First String : ");
		String s1=scan.nextLine();
		System.out.println("Enter Second String : ");
		String s2=scan.nextLine();
		//convert into lower case
		s1=s1.toLowerCase();
		s2=s2.toLowerCase();
		anagram(s1,s2);//function call
		scan.close();
	}
}