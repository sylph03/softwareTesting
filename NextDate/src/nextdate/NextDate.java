/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package nextdate;

/**
 *
 * @author 605
 */
public class NextDate {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int day = 2;
        int month = 10;
        int year = 2003;

        // Gọi hàm NextDate và in kết quả
        System.out.println("Ngay ke tiep la: " + NextDate(day, month, year));
    }

    public static String NextDate(int day, int month, int year) {
        // Kiểm tra ràng buộc
        if (day < 1 || month < 1 || month > 12 || year < 1812 || year > 2012) {
            return "Invalid date";
        }
        
        // Tính toán ngày kế tiếp
        int[] daysInMonth = {0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31}; // Số ngày trong mỗi tháng
        if (month == 2 && isLeapYear(year)) { // Năm nhuận và tháng 2
            daysInMonth[2] = 29;
        }
        
        if (day < daysInMonth[month]) {
            day++;
        } else {
            day = 1;
            if (month < 12) {
                month++;
            } else {
                month = 1;
                year++;
            }
        }

        // Trả về ngày kế tiếp dưới dạng chuỗi
        return day + "/" + month + "/" + year;
    }
    
    // Kiểm tra năm nhuận
    public static boolean isLeapYear(int year) {
        return (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
    }

}
