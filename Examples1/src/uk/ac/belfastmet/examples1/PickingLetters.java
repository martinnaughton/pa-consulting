package uk.ac.belfastmet.examples1;

public class PickingLetters {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PickingLetters pickingLetters = new PickingLetters();
		String outcome = pickingLetters.everyNth("Miracle", 2);
		String outcome1 = pickingLetters.everyNth("abcdefg", 2);
		String outcome2 = pickingLetters.everyNth("abcdefg", 3);
		if(outcome.equals("Mrce") && outcome1.equals("aceg") && outcome2.equals("adg")) {
			System.out.println("Success");
		} else {
			System.out.println("not success");
		}
	}
	
	public String everyNth(String word, int pickNumber) {
		String newString ="";
		
		for(int index =0; index < word.length(); index+=pickNumber) {
			// System.out.println(word.charAt(index));
			newString += word.charAt(index);
			System.out.println(newString);
		}
		return newString;
	}
}
