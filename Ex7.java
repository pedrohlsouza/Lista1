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
public class Ex7 {
    public static void main(String[] args) {
        int dia, mes, total;
        Scanner sc = new Scanner(System.in);
        System.out.println("Informe o mês que está: ");
        mes = sc.nextInt();
        System.out.println("Informe o dia que está: ");
        dia = sc.nextInt();
        total = ((mes - 1) * 30) + dia;
        System.out.println("Já se passaram " + total + " dias desde o inicio do ano");
    }
}
