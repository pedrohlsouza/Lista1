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
public class Ex2 {
    public static void main(String[] args) {
        int horse, horseshoe;
        Scanner sc = new Scanner(System.in);
        System.out.println("Informe a quantidade de cavalos :");
        horse = sc.nextInt();
        horseshoe = horse * 4;
        System.out.println("A quantidade de ferraduras necessárias é: " + horseshoe);
    }
    
}
