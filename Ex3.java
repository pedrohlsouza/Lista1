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
public class Ex3 {
    public static void main(String[] args) {
        float pao, broa, lucro, poup;
        Scanner sc = new Scanner(System.in);
        System.out.println("Informe a quantidade de pães vendidos");
        pao = sc.nextFloat();
        System.out.println("Informe a quantidade de broas vendidas");
        broa = sc.nextFloat();
        lucro = (float) ((pao * 0.12) + (broa * 1.50));
        System.out.println("O lucro do dia foi: " + lucro);
        poup = (float) (lucro * 0.10);
        System.out.println("O dono deve poupar: " + poup);
        
    }
    
}
