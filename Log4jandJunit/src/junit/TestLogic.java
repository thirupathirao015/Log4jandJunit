package junit;

import static org.junit.Assert.*;
import junitsrc.Calculation;

import org.junit.Test;

public class TestLogic {

	@Test
	public void testFindMax(){
		assertEquals(4,Calculation.findMax(new int[]{1,3,4,2}));
		//assertEquals(-2,Calculation.findMax(new int[]{-12,-3,-4,-2}));
	}
	
	@Test  
    public void testCube(){  
        System.out.println("test case cube");  
        assertEquals(27,Calculation.cube(3));  
    }  
}
