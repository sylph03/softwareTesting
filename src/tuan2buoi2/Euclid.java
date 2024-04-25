/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tuan2buoi2;

/**
 *
 * @author Dat
 */
public class Euclid {
     public static void main(String[] args) {
        int m = 0; // Gán giá trị cho m
        int n = 0; // Gán giá trị cho n

        // Thuật toán Euclid
        if (n > m) {
            int temp = m;
            m = n;
            n = temp;
        }

        int r = m % n;
        while (r != 0) {
            m = n;
            n = r;
            r = m % n;
        }

        System.out.println("n=" + n);
    }
}
