/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package javaapplication1;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author 605
 */
public class testTamGiac {
    
    public testTamGiac() {
    }

    @Test
    public void testMain() {
        
    }
    
    @Test
    public void testTamGiacDeu() {
        assertEquals("Equilateral", TamGiac.isTamGiac(3, 3, 3));
    }

    @Test
    public void testTamGiacCan() {
        assertEquals("Isosceles", TamGiac.isTamGiac(5, 5, 3));
    }

    @Test
    public void testTamGiacVuong() {
        assertEquals("RightTriangle", TamGiac.isTamGiac(3, 4, 5));
    }
    
    @Test
    public void testTamGiacThuong() {
        assertEquals("Scalene", TamGiac.isTamGiac(4, 6, 8));
    }

    @Test
    public void testKhongLaTamGiac() {
        assertEquals("NotATriangle", TamGiac.isTamGiac(1, 2, 3));
    }
    
}
