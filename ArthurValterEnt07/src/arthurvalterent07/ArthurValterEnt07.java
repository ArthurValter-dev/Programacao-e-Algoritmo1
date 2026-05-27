/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package arthurvalterent07;

import javax.swing.JOptionPane;
public class ArthurValterEnt07 {

    public static void main(String[] args) {
        // Ler um número inteiro de 3 casas decimais e imprimir se o algarismo da casa das centenas é par ou ímpar.
        String input = JOptionPane.showInputDialog("Digite qualquer numero se seu algarismo so pares ou impares");
            int N = Integer.parseInt(input);// variavel que recebera o valor pelo usuario
        for(int cont =  0; cont <= 3; cont++){
            
            
            
            String into = String.valueOf(N); // passa o numero digitado para String
            int chint = into.charAt(cont); // escolher qual algarismo sera verificado
            if (chint % 2 == 0){//algarismo verificar se o algarismo é par ou impar
                JOptionPane.showMessageDialog(null," O "+cont+ 1+"° algarismo do numero e par");
            }
            else{
                JOptionPane.showMessageDialog(null," O "+cont+"°algarismo do numero e impar");
            }
        }
    }
    
}
