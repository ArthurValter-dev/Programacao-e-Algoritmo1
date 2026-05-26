/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package arthurvalterent04;

import javax.swing.JOptionPane;
public class ArthurValterEnt04 {

    public static void main(String[] args) {
        /*Escreva um programa que leia vários números e informe quantos números entre 100 e 200
        foram digitados. Quando o valor 0 (zero) for lido, o algoritmo deverá cessar sua execução. 
        Para esta resolução não utilizar a estrutura “for”. */
        
        
        String input = JOptionPane.showInputDialog("Digite qualquer numero entre 100 e 200 para fazer a somar do todos");
        int N = Integer.parseInt(input);
        int soma = 0;// Variavel que somara do usuarios os codigo
        //Se o numero for menor que 100
            
        while(N != 0){
            
            //Soma em loop recebendo os valores lidos na variavel soma
            if (N < 100){
            JOptionPane.showMessageDialog(null,"O numero menor que 100");
            input = JOptionPane.showInputDialog("Digite qualquer numero entre 100 e 200");
            N = Integer.parseInt(input);
            }
            if (N >= 200){
            JOptionPane.showMessageDialog(null,"O numero maior que 200");
            input = JOptionPane.showInputDialog("Digite qualquer numero entre 100 e 200");
            N = Integer.parseInt(input);
            }
            else{
                soma = soma + N;
                JOptionPane.showMessageDialog(null,"A soma de todos e "+ soma);
            //Pedido qualquer numero menos o zero
        input = JOptionPane.showInputDialog("Digite qualquer numero");
        N = Integer.parseInt(input);
            }
            //Pedido qualquer numero menos o zero
        input = JOptionPane.showInputDialog("Digite qualquer numero");
        N = Integer.parseInt(input);
        
        }
        //Quando o usuario enviar o zero o codigo cessará
        //Soma final dos valores
        JOptionPane.showMessageDialog(null,"A soma de todos e "+ soma);
        
    }
    
}
