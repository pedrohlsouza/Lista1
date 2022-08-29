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
public class Ex12 {
    public static void main(String[] args) {
        float sal;
        Scanner sc = new Scanner(System.in);
        System.out.println("Informe seu salário: ");
        sal = sc.nextFloat();
        sal = (float) ((sal * 0.15) + sal);
        System.out.println("Parabéns, você recebeu um aumento de 15%, seu novo salário é: " + sal);
        sal = (float) (sal - (sal * 0.08)); 
        System.out.println("Com os impostos de 8%, fica: " + sal);
    }
}
