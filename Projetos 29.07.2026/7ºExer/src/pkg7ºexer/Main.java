/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pkg7ºexer;

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
        // Faça um algoritmo que leia dois valores booleanos (lógicos) e determine se ambos são VERDADEIRO ou FALSO
        
        boolean a,b;
        String Input;
        
        Input = JOptionPane.showInputDialog(null,"Digite true ou false para a variável a");
        
        // Atribuindo valor true para a
        if(Input.equalsIgnoreCase("true")) {
            a = true;
            JOptionPane.showMessageDialog(null,"A variável a é : "+a);
        }
        // Atribuindo valor false para a
        else  if(Input.equalsIgnoreCase("false")) {
            a = false;
            JOptionPane.showMessageDialog(null,"A variável a é : "+a);
        }
        
        Input = JOptionPane.showInputDialog(null,"Digite true ou false para a variável b");
        
        // Atribuindo valor true para b
        if(Input.equalsIgnoreCase("true")) {
            b = true;
            JOptionPane.showMessageDialog(null,"A variável b é : "+b);
        }
        // Atribuindo valor false para b
        else  if(Input.equalsIgnoreCase("false")) {
            b = false;
            JOptionPane.showMessageDialog(null,"A variável b é : "+b);
        }
        
    }
    
}
