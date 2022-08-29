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
public class Ex8 {
    public static void main(String[] args) {
        int n1, n2, n3, media;
        Scanner sc = new Scanner(System.in);
        System.out.println("Informe a nota da primeira prova: ");
        n1 = sc.nextInt();
        System.out.println("Informe a nota da segunda prova: ");
        n2 = sc.nextInt();
        System.out.println("Informe a nota da terceira prova: ");
        n3 = sc.nextInt();
        media = ((n1 * 1) + (n2 * 2) + (n3 * 3) / (1 + 2 + 3));
        System.out.println("A média foi: " + media);
    }
}
