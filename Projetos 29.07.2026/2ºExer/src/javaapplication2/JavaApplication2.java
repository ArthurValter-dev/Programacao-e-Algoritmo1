/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javaapplication2;

/**
 *
 * @author Admin
 */
import javax.swing.JOptionPane;

public class JavaApplication2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // um algoritmo para receber um número qualquer e imprimir na tela
        //se o número é par ou ímpar, positivo ou negativo
        
        //Declarando  Variáriveis
        
        int n; // Variável que receberá a entrada do usuário
        
        n = Integer.parseInt(JOptionPane.showInputDialog
        (null,"Digite um número positivo ou negativo inteiro")); // atribuindo o valor para n
        
        
        // Se o número for par
        if((n%2) == 0) JOptionPane.showMessageDialog(null,"O número é par");
        
        // Se o número é impar
        else JOptionPane.showMessageDialog(null,"O número é impar");
        
        // Se o número é positivo
        if(n > 0) JOptionPane.showMessageDialog(null,"O Número é positivo");
        
        // Se o número é negativo
        else if(n < 0) JOptionPane.showMessageDialog(null,"O Número é negativo");
        // Se o número for zero
        else if(n == 0)JOptionPane.showMessageDialog(null,"Neutro");
    }
    
}
