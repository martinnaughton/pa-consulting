package uk.ac.belfastmet.examples1;

import java.util.ArrayList;

public class MethodExamples {

	public static void main(String[] args) {
		MethodExamples methodExamples = new MethodExamples();
		
		boolean outcome = methodExamples.returnSomething();
		
		System.out.println("the outcome was:" + outcome);
		
		ArrayList<String> outcome2 = methodExamples.returnArrayList();
		System.out.println(outcome2);
	}
	
	
	public boolean returnSomething() {
		boolean result = false;
		
		return result;
	}
	
	public ArrayList<String> returnArrayList() {
		ArrayList<String> list = new ArrayList<String>();
		list.add("hello");
		list.add("world");
		return list;
	}
	

}
