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
public class Ex6 {
    public static void main(String[] args) {
        float pesop, preco;
        Scanner sc = new Scanner(System.in);
        System.out.println("Informe o peso do seu prato: ");
        pesop = sc.nextFloat();
        preco = pesop * 12;
        System.out.println("O valor a ser pago é: " + preco);
    }
}
