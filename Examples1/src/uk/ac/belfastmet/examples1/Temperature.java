package uk.ac.belfastmet.examples1;

public class Temperature {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Temperature temperature = new Temperature();
		boolean outcome = temperature.icyHot(120,-1); // -> true
		boolean outcome1 = temperature.icyHot(-1,120); // -> true
		boolean outcome2 = temperature.icyHot(2,120); // -> false
		
		
		if (outcome == true && outcome1 == true && outcome2 ==false) {
			System.out.println();
		}
	}
	
	public boolean icyHot(int tempA, int tempB) {
		boolean result = false;
		
		if((tempA < 0 && tempB > 100) || (tempA > 100 && tempB <0)) {
			result = true;
		} else {
			result = false;
		}
		
		return result;
	}

}
