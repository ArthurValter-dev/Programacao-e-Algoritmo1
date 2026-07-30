/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pkg8ºexer;

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
        if(a < b && a < c){
            // Se B for 2ºmenor
            if(b < c){
                JOptionPane.showMessageDialog(null,"A: "+a+"\nB: "+b+"\nC: "+c+"\n Ordem Descrescente: \n"+c+" "+b+" "+a);
            }
            // Se C for 2ºmenor
            else if(c < b){
                JOptionPane.showMessageDialog(null,"A: "+a+"\nB: "+b+"\nC: "+c+"\n Ordem Descrescente: \n"+b+" "+c+" "+a);
            }
        }
        
        // Caso B for o menor
        else if(b < a && b < c){
            
            // Se A for 2ºmenor
            if(a < c){
                JOptionPane.showMessageDialog(null,"A: "+a+"\nB: "+b+"\nC: "+c+"\n Ordem Descrescente: \n"+c+" "+a+" "+b);
            }
            
            // Se C for 2ºmenor
            else if(c < a){
                JOptionPane.showMessageDialog(null,"A: "+a+"\nB: "+b+"\nC: "+c+"\n Ordem Descrescente: \n"+c+" "+a+" "+b);
            }
        }
        
        //Caso C for menor
        else if(c < a && c < b){
            
            // Se A for 2ºmenor
            if(a < b) {
                JOptionPane.showMessageDialog(null,"A: "+a+"\nB: "+b+"\nC: "+c+"\n Ordem Descrescente: \n"+b+" "+a+" "+c);
            }
            
            // Se B for 2º menor
            else if(b < a){
                JOptionPane.showMessageDialog(null,"A: "+a+"\nB: "+b+"\nC: "+c+"\n Ordem Descrescente: \n"+a+" "+b+" "+c);
            }
        }
    }
}