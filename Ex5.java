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
public class Ex5 {
    public static void main(String[] args) {
        float gas, pg, litro;
        Scanner sc = new Scanner(System.in);
        System.out.println("Informe o preço da gasolina: ");
        gas = sc.nextFloat();
        System.out.println("Agora informe o valor que pagou: ");
        pg = sc.nextFloat();
        litro = pg / gas;
        System.out.println("Foi abastecido " + litro + " litros");
        
    }
    
}
