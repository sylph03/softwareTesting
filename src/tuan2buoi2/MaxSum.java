/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tuan2buoi2;

/**
 *
 * @author Dat
 */
public class MaxSum {
    public static void maxsum(int maxint, int value) {
        int result = 0;
        int i = 0;

        if (value < 0) {
            value = -value;
        }

        while (i < value && result <= maxint) {
            i++;
            result++;
        }

        if (result <= maxint) {
            System.out.println(result);
        } else {
            System.out.println("too large");
        }
    }

    public static void main(String[] args) {
        maxsum(10, 5); // Gọi hàm với maxint = 10 và value = 5
    }
}
