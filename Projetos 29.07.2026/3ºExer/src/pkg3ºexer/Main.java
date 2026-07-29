/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pkg3ºexer;

/**
 *
 * @author Admin
 */

import javax.swing.JOptionPane;

public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /* um algoritmo que leia dois valores inteiros A e B, 
        se os valores de A e B forem iguais, deverá somar os dois valores,
        caso contrário devera multiplicar A por B.
        Ao final de qualquer um dos cálculos deve-se 
        atribuir o resultado a uma variável C e imprimir seu valor na tela*/
        
        //Declarando  Variáriveis
        int a, b, // Variáveis que serão atribuidas pelo usuário
            c; // A Variáveil que será atribuido a soma ou a multiplicação de a e b
        
        a = Integer.parseInt
        (JOptionPane.showInputDialog
        (null,"Digite um número para a")); // Atribuindo valor para a pelo usuário
        b = Integer.parseInt
        (JOptionPane.showInputDialog 
        (null,"Digite um número para b")); // Atribuindo valor para b pelo usuário
        
        if( a == b){
            
            
            c = a +b; // Atribuindo a soma de a e b para c
            
            JOptionPane.showMessageDialog(null," A soma de a e b é: "+c);
        }
        
        else{
            
            c = a*b; // Atribuindo o produto de a e b para c
            JOptionPane.showMessageDialog(null,"O produto de a e b é "+ c);
        }
    }
    
}
