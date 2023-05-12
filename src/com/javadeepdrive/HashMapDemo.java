package com.javadeepdrive;
/**
 * using hash map collections get the key and value from the user and print them
 * @author sraja
 *Date 06.05.2023
 */
import java.util.*;
public class HashMapDemo {
	public static void main(String[]args) {
		HashMap<Integer,String> hm=new HashMap<>();
		Scanner scan=new Scanner(System.in);
		//get the size from the user
		System.out.println("Enter the size of entry : ");
		int size=scan.nextInt();
		//get the input from the user
		for(int i=0;i<size;i++) {
			System.out.println("enter id and name");
			hm.put(scan.nextInt(),scan.next());
		}
		//based on choice performance will happen using switch case
		int choice;
		System.out.println("=========================");
		System.out.println("List of Operations\n1.Find using key\n2.Find using value\n3.Print entry\n4.Perform all operations");
		System.out.println("=========================");
		System.out.println("enter choice");
		choice=scan.nextInt();
		System.out.println("=========================");
		switch(choice) {
		//search using key
		case 1:{
			System.out.println("Enter key which want to Find : ");
			if(hm.containsKey(scan.nextInt()))
				System.out.println("Entered key value is available");
			else
				System.out.println("Enterd key is not available");
			break;
		}
		//search using value
		case 2:{
			System.out.println("Enter the value which want to find");
			if(hm.containsValue(scan.next()))
				System.out.println("Enterd value is available");
			else
				System.out.println("Entered value is not available");
			break;
		}
		//print the entry
		case 3:{
			System.out.println("Print the key value pair");
			for (Map.Entry<Integer,String> Map : hm.entrySet()) 
			System.out.println("Key : " + Map.getKey() +" Value : " + Map.getValue());
			break;
		}
		//perform all operations
		case 4:{
			System.out.println("Enter key which want to Find : ");
			if(hm.containsKey(scan.nextInt()))
				System.out.println("Entered key value is available");
			else
				System.out.println("Enterd key is not available");
			System.out.println("=====================================");
			System.out.println("Enter the value which want to find");
			if(hm.containsValue(scan.next()))
				System.out.println("Enterd value is available");
			else
				System.out.println("Entered value is not available");
			System.out.println("=====================================");
			System.out.println("Print the key value pair");
			for (Map.Entry<Integer,String> Map : hm.entrySet()) 
			System.out.println("Key : " + Map.getKey() +" Value : " + Map.getValue());
			System.out.println("======================================");
			break;
		}
		}
		scan.close();
		}
	}