/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pkg12ªexer;

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
        /* algoritmo que leia o nome e a idade de uma peso e imprima na 
           tela o nome da pessoa e se ela é maior ou menor de idade */
        
        // Declarando variáveis
        
        String nome; // Variável que será atribuida com nome pelo usuário
        int idade;   // Variável que será atribuida com a idade pelo usuário
        
        // Atribuindo valores para as variáveis
        nome = JOptionPane.showInputDialog(null,"Digite seu nome");
        idade = Integer.parseInt(JOptionPane.showInputDialog(null,"Digite sua idade"));
        
        // Caso o usuário é menor de idade
        if(idade < 18) JOptionPane.showMessageDialog(null,nome+" você é menor de idade");
        
        // Caso contrário
        else JOptionPane.showMessageDialog(null,nome+" você é maior de idade");
    }
    
}
