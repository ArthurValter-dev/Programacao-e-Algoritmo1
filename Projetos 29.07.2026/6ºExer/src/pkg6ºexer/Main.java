/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pkg6ºexer;

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
        // Faça um algoritmo que leia um valor qualquer e imprima na tela com um reajuste de 5%
        
        //Declarando  Variáriveis
        double n; // Variável que será atribuida pelo usuário
        
        double re; // Variavel que será atribuindo o reajuste da variável
        // Atribuindo valor para n
        n = Double.parseDouble(JOptionPane.showInputDialog(null,"Digite um valor "));
        
        // Fazendo o reajuste do número da variável
        re = n+((n*5)/100);
        
        JOptionPane.showMessageDialog(null,"O valor com reajuste de 5% : "+re);
    }
    
}
