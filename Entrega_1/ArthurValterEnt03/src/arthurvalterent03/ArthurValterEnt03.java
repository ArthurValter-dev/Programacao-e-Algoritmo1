/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package arthurvalterent03;

import javax.swing.JOptionPane;
public class ArthurValterEnt03 {

    public static void main(String[] args) {
        //Escreva um programa que receba 15 números e imprima 
        //quantos números maiores que 30 foram digitados.
        int Cont = 0; //Mostra quantos numeros sao maiores do que 30 ao fim do codigo
        
        for(int Ent = 1; Ent <= 15;Ent++){
        String input = JOptionPane.showInputDialog("Digite 15 numeros por favor: ("+Ent+"/15)");
        int N = Integer.parseInt(input);
        // Se o vaolor de N for maior do que 30 mostra o valor de N com uma frase
        if (N > 30){
            JOptionPane.showMessageDialog(null,"O "+N+" e maior que 30");
            Cont++;//Acresentado valor no contador 
        }
         JOptionPane.showMessageDialog(null, "Dos 15 números, um total de "+Cont+" foram maiores do que 30.");
        }
    }
    
}
