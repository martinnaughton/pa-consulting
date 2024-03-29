package uk.ac.belfastmet.examples1;

import static org.junit.Assert.*;

import org.junit.Test;

public class MyUnitTest {

	 @Test
	    public void testConcatenate() {
	        MyUnit myUnit = new MyUnit();

	        String result = myUnit.concatenate("one", "two");

	        assertEquals("onetwo", result);

	    }
	 
	 @Test
	    public void testConcatenateSpace() {
	        MyUnit myUnit = new MyUnit();

	        String result = myUnit.concatenate("one", "two");

	        assertNotEquals("one two", result);

	    }

}
