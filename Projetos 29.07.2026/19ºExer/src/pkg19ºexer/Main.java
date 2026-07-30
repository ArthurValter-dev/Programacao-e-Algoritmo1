/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pkg19ºexer;

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
        //Faça um algoritmo que receba um valor inteiro e imprima na tela a sua tabuada
        
        // Declarando variáveis 
        
        int user; // Variável que será atribuida pelo usuário
        int i; // Variável que será usada do laço
        
        user = Integer.parseInt(JOptionPane.showInputDialog(null,"Digite um valor: "));
        
        JOptionPane.showMessageDialog(null,"Tabuada de "+user);
        //Iniciando laço for para exibir a tabuada do valor do usuário
        for(i= 1;i <=10;i++){
            JOptionPane.showMessageDialog(null,user+" x "+i+" = "+(user*i));
        }
    }
    
}
