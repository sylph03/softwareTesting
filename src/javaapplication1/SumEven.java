/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaapplication1;

/**
 *
 * @author Dat
 */
public class SumEven {
    // Tính tổng các số chẵn từ 1 đến n;
    public int sumEven(int n) {
        int sum = 0;
        for (int i = 1; i <=n; i++) {
            if (i % 2 == 0) {
                sum += i;
            }
        }
        return sum;
    }
}
