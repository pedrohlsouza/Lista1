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
public class Ex11 {
    public static void main(String[] args) {
        int dia, aux, ano, mes;
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Informe a quantidade de dias sem acidentes: ");
        dia = sc.nextInt();
        
        ano = dia/360;//Estou pegando o ano, em número inteiro para não quebrar e poder ter mês.
        mes = (dia/30) - (ano *12);//
        aux = dia%30;//pegar os dias finais fazendo um simples mod.
        System.out.println("Sem acidente faz " + ano + " ano/s, " + mes + " meses, " + aux + " dias");
    }
}
