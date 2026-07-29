/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pkg8ºexer;

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
        // algoritmo que leia três valores inteiros diferentes e imprima na tela os valores em ordem decrescente
        
        //Declando Variáveis para 
        
        int a,b,c; // Variáveis que receberá a entrada do usuário
        
        //Atribuindo valor para a
        a = Integer.parseInt(JOptionPane.showInputDialog(null,"Digite um valor para a"));
        //Atribuindo valor para b
        b = Integer.parseInt(JOptionPane.showInputDialog(null,"Digite um valor para b"));
        //Atribuindo valor para c
        c = Integer.parseInt(JOptionPane.showInputDialog(null,"Digite um valor para c"));
        
        //Caso a for o menor
        if(a < b || a < c){
            
            // B sendo o segundo menor
            if(b < c) JOptionPane.showMessageDialog(null,c+" "+b+" "+a);
            
            
            else JOptionPane.showMessageDialog(null,b+" "+c+" "+a);
        }
        
        //Caso b for 
    }
    
}
