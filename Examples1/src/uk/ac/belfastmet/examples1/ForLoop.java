package uk.ac.belfastmet.examples1;

public class ForLoop {

	public static void main(String[] args) {
		
		

	}
	
	public boolean checkIfEmpty(String word) {
		boolean result = false;
		
		if(word.isEmpty()) {
			result = true;
		}
		
		
		
		return result;
	}
	
	public boolean isCThere(String name) {
		boolean result = false;
		if(name.contains("c")) {
			result = true;
		}
		return result;
	}

}
