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
public class Ex13 {
    public static void main(String[] args) {
        int numero, centena, dezena, unidade;
        Scanner sc = new Scanner(System.in);
        System.out.println("Informe um numero inteiro: ");
        numero = sc.nextInt();
        if (numero<1||numero>999){
            System.out.println("O número informado é invalido, digite um número de 1 a 999");
        }
        else{
            unidade = numero%10;//ok
            dezena = ((numero%100) - (numero%10)) / 10;//ok
            centena = (numero - (numero%100)) / 100;
            System.out.println("Centena: " + centena + " Dezena: " + dezena + " Unidade: " + unidade);
        }
    }
}
