/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.lista1;

import java.util.Scanner;

/**
 *
 * @author CPD3
 */
public class Ex9 {
    public static void main(String[] args) {
        int c1, c2, c3, valort;
        Scanner sc = new Scanner(System.in);
        System.out.println("Informe a quantidade de camisas P: ");
        c1 = sc.nextInt();
        System.out.println("Informe a quantidade de camisas M: ");
        c2 = sc.nextInt();
        System.out.println("Informe a quantidade de camisas G: ");
        c3 = sc.nextInt();
        valort = (c1 * 10) + (c2 * 12) + (c3 * 15);
        System.out.println("O valor total a ser arrecadado é: " + valort);
    }
}
