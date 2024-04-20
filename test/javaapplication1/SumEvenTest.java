/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package javaapplication1;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Dat
 */
public class SumEvenTest {
    SumEven ev;
    
    public SumEvenTest() {
        ev = new SumEven();
    }

    @Test
    public void testSumEven() {
        int sum = ev.sumEven(9);
        int expected = 20;
        assertEquals(expected, sum);
    }
    
}
