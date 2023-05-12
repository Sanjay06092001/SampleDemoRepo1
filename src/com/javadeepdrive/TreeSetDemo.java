package com.javadeepdrive;
/**
 * user give an input and sort them using second name by tree sort
 * @author sraja
 *Date 06.05.2023
 */
import java.util.*;
//create a class and get the name from the private and pass using getters and setters method
class Person implements Comparable<Person>{
	private String name;
	
	//constructor creation
	public Person(String name) {
		this.name = name;
	}
	
	//getters and setters
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	//to string
	@Override
	public String toString() {
		return name;
	}
	
	// sort the name 
	@Override
	public int compareTo(Person o) {
		// TODO Auto-generated method stub
		return name.compareTo(o.name);
	}
}


public class TreeSetDemo {
	public static void main(String[]args) {
		TreeSet<Person> ts=new TreeSet<Person>();
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter how many names to insert");
		int size=scan.nextInt();
		System.out.println("Enter name : ");
		//get the name from the user
		for(int i=0;i<=size;i++) {
			ts.add(new Person(scan.nextLine()));
		}
		//using iterator print the sort name
			System.out.println("The sorted TreeSet is:");
			Iterator<Person> itr=ts.iterator();
			while(itr.hasNext()) {
				System.out.println(itr.next());
		}
			scan.close();
	}
}