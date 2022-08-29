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
public class Ex15 {
    public static void main(String[] args) {
        double conta, cent, felipe, carlos, andre;
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Infome o valor da conta: ");
        conta = sc.nextDouble();
        
            cent = (conta/3)%1;//pegando a parte de centavos de cada um.
            
            carlos = (conta/3) - cent;//pegando a parte do carlos e tirando os centavos que peguei o valor anteriormente
            
            andre = (conta/3) - cent;//pegando a parte do andre e tirando os centavos que peguei o valor anteriormente
            
            felipe = (conta/3) + (2 * cent);//pegando a parte do felipe e somando os centavos do andre e carlos(por isso multiplicado os centavos por 2)
            
            System.out.println("Calos: " + carlos + " André: " + andre + " Felipe: " + felipe);
    
    }
}
