/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pkg16ºexer;

/**
 *
 * @author Arthur V
 */

import javax.swing.JOptionPane;

public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /* algoritmo que leia uma temperatura em Fahrenheit e calcule a
           temperatura correspondente em grau Celsius. Imprima na tela as duas
           temperaturas.
           Fórmula: C =(5*(F-32)/9)*/
        
        //Declarando Variáveis
        
        double F , // Variável que será atribuida com um valor um Fahrenheit pelo usuário
               C;  // Variável que receberá um valor em Celsius
        
        F = Double.parseDouble(JOptionPane.showInputDialog(null," Digite um valor em fahrenheit: "));
        
        // Atribuindo o valor em Fahrenheit para Celsius
        C = (5*(F-32)/9);
        
        // Exibindo o valor
        JOptionPane.showMessageDialog(null, "O valor em Celsius é "+C);
    }
    
}