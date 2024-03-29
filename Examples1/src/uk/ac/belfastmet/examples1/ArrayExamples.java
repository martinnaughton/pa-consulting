package uk.ac.belfastmet.examples1;

import java.util.ArrayList;

public class ArrayExamples {

	public static void main(String[] args) {
		ArrayExamples arrayExamples = new ArrayExamples();
		arrayExamples.addStringToArrayList();
		arrayExamples.containsString();
		arrayExamples.removeString();

	}
	
	public void addStringToArrayList() {
		ArrayList<String> listOfStuff = new ArrayList<String>();
		listOfStuff.add("Good");
		listOfStuff.add("Morning");
		System.out.println("Size of Array:" + listOfStuff.size());
		
		for(int index = 0; index < listOfStuff.size(); index++) {
			String indexValue = listOfStuff.get(index);
			System.out.println("Value of string:" + indexValue);
		}
	}
	
	public void containsString() {
		ArrayList<String> listOfStuff = new ArrayList<String>();
		listOfStuff.add("Good");
		listOfStuff.add("Morning");
		System.out.println("Size of Array:" + listOfStuff.size());
		
		System.out.println(listOfStuff.contains("Good"));
	}
	
	public void removeString() {
		ArrayList<String> listOfStuff = new ArrayList<String>();
		listOfStuff.add("Good");
		listOfStuff.add("Morning");
		System.out.println("Size of Array:" + listOfStuff.size());
		
		listOfStuff.remove("Good");

		System.out.println("Size of Array:" + listOfStuff.size());
	}
	
	public void isEmptyArray() {
		ArrayList<String> listOfStuff = new ArrayList<String>();
		listOfStuff.add("Good");
		listOfStuff.add("Morning");
		
		listOfStuff.isEmpty();
	}
}
