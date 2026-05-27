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
        int i = 1; //Conta as execuções do prompt de pedir número 
        int cont = 0;
        int soma = 0;// Variavel que somara do usuarios os codigo
        //Se o numero for menor que 100
        
        do{
        String input = JOptionPane.showInputDialog("Digite qualquer numero entre 100 e 200 para fazer a somar do todos");
        int N = Integer.parseInt(input);//Contém o valor digitado no prompt
       
        
        if(N == 0){
            return;//Verifica-se se 0 foi o valor digitado a cada valor recebido, caso seja o código é encerrado
        }
        }while ();
        JOptionPane.showMessageDialog(null, ""+cont+" números foram maiores que 100 e menores que 200.");



    }
}