package uk.ac.belfastmet.examples1;

public class MethodExample {
	
	public static void main(String[] args) {
		MethodExample example = new MethodExample();
		example.sleepIn(8,false,false);
	}
	
	public void sleepIn(int toSleepIn, boolean vacation, boolean weekend) {
		System.out.println("Sleep in:" + toSleepIn);
		System.out.println("Vacation in:" + vacation);
		System.out.println("weekend in:" + weekend);
	}

}
