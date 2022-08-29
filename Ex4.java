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
public class Ex4 {
    public static void main(String[] args) {
     String nome;
     int ano, idade;
     Scanner sc = new Scanner(System.in);
        System.out.println("escreva seu nome: ");
        nome = sc.next();
        System.out.println("Agora informe quantos anos você tem: ");
        ano = sc.nextInt();
        idade = ano * 365;
        System.out.println(nome + ", possui " + idade + " dias de vida");
    }
}
