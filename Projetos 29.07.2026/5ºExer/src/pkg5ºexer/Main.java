/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pkg5ºexer;

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
        // algoritmo que leia o valor do salário mínimo e o valor do salário de um usuário, 
        //calcule quantos salários mínimos esse usuário ganha e imprima na tela o resultado. 
        //(Base para o Salário mínimo R$ 1.293,20).
        
       //Declarando  Variáriveis 
       double salauser,// Variável que será atribuida pelo usuário
              salamini = 1293.30; // Salário mínimo
       
       // Atribuindo valor para salauser pelo usuário
       salauser = Double.parseDouble(JOptionPane.showInputDialog(null,"Digite um valor de seu salário(um número com virgula)"));
       
       JOptionPane.showMessageDialog(null,"Tem "+(salauser/salamini)+" salário mininos");
    }
    
}
