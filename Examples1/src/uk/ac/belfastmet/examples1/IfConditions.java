package uk.ac.belfastmet.examples1;

public class IfConditions {
	
	private int a = 4;
	private int b = 5;

	public static void main(String[] args) {
		IfConditions ifConditions = new IfConditions();
		ifConditions.printConditions();
//		ifConditions.forConditions();
// 		ifConditions.whileConditions();
		ifConditions.doWhileCondition();
	}
	
	public void printConditions() {
		
		if(a == b) {
			System.out.println("A equals B");
		} else {
			System.out.println("A does not equal B");
		}
		
		if(!(a < b)) {
			System.out.println("a is less than b");
		} else if(a >b) {
			System.out.println("a is more than b");
		}
	}
	
	public void forConditions() {
		for(int index = 0; index<=10; index+=2) {
			System.out.println("index:" + index);
		}
	}
	
	public void whileConditions() {
//		int i = 0;
//		i++;
//		while (true) {
//		  System.out.println(i);
//		  i++;
//		}
		String name = "martin";
		String name1 = "martin";
		while(name == name1) {
			System.out.println("Strings Equal");
		}
	}
	
	public void doWhileCondition() {
		int index = 0;
		do {
			  System.out.println("index:" + index);
			  index++;
			}
			while (index < 0);
	}
	
	
}
