package UtilityTUnitesting;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

import UtilityTUnitesting.MAthUtility;


public class MathUtilityTest {

    @Test 
    public void addTest1(){
        assertEquals(0, MAthUtility.add(0, 0));
    }
    @Test
    public void addTest2(){
        assertEquals(-1, MAthUtility.add(-2, 1));
    }
    
}
