/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pkg21ºexer;

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
        /* algoritmo que leia dois valores inteiros A e B, imprima na tela o
           quociente e o resto da divisão inteira entre eles*/
        
        //Declarando variáveis
        
        int a, b; // Variáveis que receberam o valor pelo usuário
        int restoa; // Variável que ficará o resto da divisão de A e B
        int restob; // Variável que ficará o resto da divisão de B e A
        
        int quoa; // Variável que ficará o quociente da divisão de A e B
        int quob; // Variável que ficará o quociente da divisão de B e A
        
        // Atribuindo valor para A e B
        a = Integer.parseInt(JOptionPane.showInputDialog(null,"Digite um valor para A"));
        b = Integer.parseInt(JOptionPane.showInputDialog(null,"Digite um valor para B"));
        
        // A sendo dividido por B
        quoa = a/b;
        restoa = a%b;
        
        // B sendo dividido por A
        quob = b/a;
        restob = b%a;
        
        // Exibindo os resultados
        JOptionPane.showMessageDialog
        (null,"A Sendo dividido por B :\nQuociente: "+quoa+"\nResto: "+restoa+
            "\nB sendo dividido por A :\nQuociente: "+quob+"\nResto: "+restob+"\nA sendo "+a+" e B sendo "+b);
    }
    
}
