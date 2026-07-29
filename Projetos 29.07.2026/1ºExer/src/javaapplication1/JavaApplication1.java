/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javaapplication1;

/**
 *
 * @author Admin    
 */
import javax.swing.JOptionPane;

public class JavaApplication1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /*um algoritmo que leia os valores de A, B, C 
        e em seguida imprima na tela a soma entre A e B é mostre 
        se a soma é menor que C
        */
        
        
        // Declarando vairáveis
        
        int a,b,c; 
        int soma; // A soma de de A e B
        
        // Entrada do usuário para A e B
        
        a = Integer.parseInt(JOptionPane.showInputDialog
        (null,"Digite um Valor para a variável a")); // Adicionando valor para a
        
        b = Integer.parseInt(JOptionPane.showInputDialog
        (null,"Digite um Valor para a variável b")); // Adicionando valor para b
        c = Integer.parseInt(JOptionPane.showInputDialog
        (null,"Digite um Valor para a variável c")); // // Adicionando valor para c
        
        soma = a+b; // A soma de A e B 
        
        // Iniciando condições no Código
        if(soma < c) JOptionPane.showMessageDialog
        (null,"A Soma é: "+soma+"\nA Soma de a e b é menor do que c"); // Caso a soma seja maior do que c
    }
    
}
