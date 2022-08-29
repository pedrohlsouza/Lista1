/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.lista1;

import java.util.Scanner;

/**
 *
 * @author CPD3
 */
public class Ex1 {
    
   

    public static void main(String[] args) {
        int comp, larg, soma;
        String resultado;
        Scanner sc = new Scanner(System.in);
            System.out.println("Informe o comprimento do terreno: ");
            comp = sc.nextInt();
            System.out.println("Informe a largura do terreno: ");
            larg = sc.nextInt();
            soma = comp * larg;
            resultado = "A área do terreno é: ";
            System.out.println(resultado + soma);
        
    }
}
