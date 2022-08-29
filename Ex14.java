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
public class Ex14 {
    public static void main(String[] args) {
        double area, raio;
        Scanner ph = new Scanner(System.in);
        System.out.println("Informe o raio da pizza: ");
        raio = ph.nextFloat();
        
        area = 3.14 * (raio*raio);
        
        System.out.println("A area da circunferência é: " + area);
    }
}
