/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javaapplication1;

import java.util.Scanner;

/**
 *
 * @author 605
 */
public class TamGiac {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap do dai 3 canh cua tam giac:");
        System.out.print("Canh 1: ");
        int side1 = scanner.nextInt();
        System.out.print("Canh 2: ");
        int side2 = scanner.nextInt();
        System.out.print("Canh 3: ");
        int side3 = scanner.nextInt();
        scanner.close();

        // Kiểm tra xác định loại tam giác
        String triangleType = isTamGiac(side1, side2, side3);
        System.out.println("Loai tam giac la: " + triangleType);
    }

    // Phương thức xác định loại tam giác
    public static String isTamGiac(int a, int b, int c) {
        // Kiểm tra các cạnh có dương hay không
        if (a <= 0 || b <= 0 || c <= 0) {
            return "NotATriangle";
        }

        // Kiểm tra điều kiện tam giác
        if (a + b <= c || a + c <= b || b + c <= a) {
            return "NotATriangle";
        }

        // Xác định loại tam giác
        if (a == b && b == c) {
            return "Equilateral";
        } else if (a == b || b == c || a == c) {
            return "Isosceles";
        } else if (a * a + b * b == c * c || a * a + c * c == b * b || b * b + c * c == a * a) {
            return "RightTriangle";
        } else {
            return "Scalene";
        }
    }
}
    

