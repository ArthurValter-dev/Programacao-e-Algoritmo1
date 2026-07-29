/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pkg4ºexer;

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
        // algoritmo que receba um número inteiro e imprima na tela o seu antecessor e o seu sucessor
        
        //Declarando  Variáriveis
        int n; // Variável que será atribuinda pelo usuário
        
        n = Integer.parseInt(JOptionPane.showInputDialog(null,"Digite um número"));
        
        JOptionPane.showMessageDialog(null,"O antecessor de "+n+" é :"+(n-1)+"\n e seu secessor é: "+(n+1));
    }
    
}
