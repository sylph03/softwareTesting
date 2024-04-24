/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package nextdate;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author 605
 */
public class NextDateIT {
    
    @Test
    public void testMain() {
        // Bạn có thể viết các testcase cho hàm main nếu cần thiết
    }

    @Test
    public void testNextDate() {
        // Testcase 1: Ngày kế tiếp của 31/12/2012 là 1/1/2013
        assertEquals("1/1/2013", NextDate.NextDate(31, 12, 2012));
        
        // Testcase 2: Ngày kế tiếp của 28/2/2008 là 29/2/2008 (năm nhuận)
        assertEquals("29/2/2008", NextDate.NextDate(28, 2, 2008));
        
        // Testcase 3: Ngày kế tiếp của 28/2/2009 là 1/3/2009 (không phải năm nhuận)
        assertEquals("1/3/2009", NextDate.NextDate(28, 2, 2009));
        
        // Testcase 4: Ngày kế tiếp của 30/12/2009 là 31/12/2009
        assertEquals("31/12/2009", NextDate.NextDate(30, 12, 2009));
    }

    @Test
    public void testIsLeapYear() {
        // Testcase 1: Kiểm tra năm nhuận của năm chia hết cho 4 nhưng không chia hết cho 100
        assertTrue(NextDate.isLeapYear(2024));
        
        // Testcase 2: Kiểm tra năm nhuận của năm chia hết cho 400
        assertTrue(NextDate.isLeapYear(2000));
        
        // Testcase 3: Kiểm tra năm không phải là năm nhuận
        assertFalse(NextDate.isLeapYear(2023));
    }
}
