/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pkg15ºexer;

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
        
        /* algoritmo que leia três valores que representam os três lados de um
           triângulo e verifique se são válidos, determine se o triângulo é equilátero,
           isósceles ou escaleno */
        
        // Declarando variáveis 
        
        double a,b,c; // A variáveis que será atribuindo para serem os lados de um triângulo
        
        // Atribuindo valores para as variáveis
        a = Double.parseDouble(JOptionPane.showInputDialog(null,"Digite um valor para a"));
        b = Double.parseDouble(JOptionPane.showInputDialog(null,"Digite um valor para b"));
        c = Double.parseDouble(JOptionPane.showInputDialog(null,"Digite um valor para c"));
        
        // Verificando se os lados formam um triângulo
        if(a + b > c | c + b > a | a + c > b){
            
            // Triângulo equilátero 
            if(a == c & b == c )JOptionPane.showMessageDialog(null,"Os valores formam um triâgulo equilátero");
            
            
            // Triângulo isósceles
            else if((a == b & b != c) | (b == c & c != a)) JOptionPane.showMessageDialog(null,"Os valores formam um triângulo isósceles");
            
            // Triângulo escaleno
            else if(a != b & a != c & b != c)JOptionPane.showMessageDialog(null,"Os valores formam um triângulo escaleno");
        }
        
        // Caso os valores não formam um triângulo
        else JOptionPane.showMessageDialog(null,"Os valores não formam um triângulo");
    }
    
}
