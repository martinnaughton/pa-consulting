package uk.ac.belfastmet.examples1;

public class StringExample {

	public static void main(String[] args) {
		StringExample examples = new StringExample();
		examples.firstCharacter();
		examples.startCharacter();
		examples.subCharacter();
		examples.containsString();
		examples.indexString();
		examples.splitString();
		examples.upperString();
	}
	
	public void firstCharacter() {
		String name = "martin";
		char letter = name.charAt(2);
		System.out.println(letter);
	}
	
	public void startCharacter() {
		String name = "martin";
		boolean startWith = name.startsWith("mar");
		if(startWith) {
			System.out.println("it starts with the character");	
		}
	}
	
	public void endCharacter() {
		String name = "martin";
		boolean startWith = name.endsWith("itn");
		if(startWith) {
			System.out.println("it ends with the character");	
		}
	}
	
	public void subCharacter() {
		String name = "martin";
		String subCharacter = name.substring(2, 4);
		System.out.println(subCharacter);
	}
	
	public void containsString() {
		String name = "martin";
		boolean contains = name.contains("rt");
		if(contains) {
			System.out.println("it contains");
		}	
	}
	
	public void indexString() {
		String name = "martin";
		int index = name.indexOf("in");
		System.out.println("Index of " + index);
	}
	
	public void splitString() {
		String sentence = "I am studying";
		String[] strings = sentence.split(" ");
		System.out.println("Length is " + strings);
		for(int index = 0; index < strings.length; index++) {
			System.out.println(strings[index]);
		}
	}
	
	public void upperString() {
		String sentence = "I am studying";
		sentence = sentence.toUpperCase();
		System.out.println("upper case sentence: "+ sentence);
	}
	
	public void concatString() {
		String sentence = "I am studying";
		sentence = sentence.concat(arg0);
		System.out.println("upper case sentence: "+ sentence);
	}
	
	public void replaceString() {
		String sentence = "I am studying";
		sentence = sentence.replace(arg0, arg1)
		System.out.println("upper case sentence: "+ sentence);
	}
	
	public void replaceString() {
		String sentence = "I am studying";
		sentence = sentence.replace(arg0, arg1)
		System.out.println("upper case sentence: "+ sentence);
	}
	
}
