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
 
        int cont = 0; // variaveis que mostra quantos numeros foram digitados
        
        while(true){ // Ira repetir o codi automaticamente
            String input = JOptionPane.showInputDialog("Digite qualquer numero entre 100 e 200 para fazer a somar do todos");
            int N = Integer.parseInt(input);
       
                if(N >= 100 && N <= 200){
                    cont++;
            }
                if(N == 0){
                    JOptionPane.showMessageDialog(null, ""+cont+" números foram maiores que 100 e menores que 200.");// mostra quantos numeros foram digitados
                    break; // quando o zero for digitado o codigo encerrara
            }
            cont++;
        }
    }
}