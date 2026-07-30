/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pkg13ªexer;

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
        /* algoritmo que receba um valor A e B, e troque o valor de A por B e 
           o valor de B por A e imprima na tela os valores */
        
        int a , b; // variáveis que será atribuindo pelo usuário
        int t; // Variável que receberá o fará a troca dos valores
        
        a = Integer.parseInt(JOptionPane.showInputDialog(null,"Digite um valor pra A"));
        b = Integer.parseInt(JOptionPane.showInputDialog(null,"Digite um valor pra B"));
        
        JOptionPane.showMessageDialog(null,"Valores de A e B antes da troca \nA: "+a+"\nB: "+b);
        
        // Passando o valor A para B
        
        // Atribuindo t com o valor de a
        t = a;
        // Atribuindo A com valor de B
        a = b;
        // Atribuindo B com o valor de antes da troca utilizando a variável T
        b = t;
        
        JOptionPane.showMessageDialog(null,"Valores de A e B antes da troca \nA: "+a+"\nB: "+b);
    }
    
}
