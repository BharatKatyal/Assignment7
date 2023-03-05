import static org.junit.Assert.*;

import org.junit.Test;

public class AssignmentTwoTest {

	@Test
	public void testFibonacciRecursive() {
		
		AssignmentTwo test1 = new AssignmentTwo();
		int output1 = test1.fibonacciRecursive(10);
		assertEquals(55,output1);
		
		
		
//		AssignmentTwo test2 = new AssignmentTwo();
//		int output2 = test2.fibonacciRecursive(11);
//		assertEquals(56,output2);
//		// answer is 89
////		fail("Not yet implemented");
	}

}
