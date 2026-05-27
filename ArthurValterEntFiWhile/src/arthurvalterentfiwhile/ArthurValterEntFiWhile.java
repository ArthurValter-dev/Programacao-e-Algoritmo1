/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package arthurvalterentfiwhile;

import javax.swing.JOptionPane;
public class ArthurValterEntFiWhile {

    public static void main(String[] args) {
        /*
        1-Façar um algoritmo para somar valores até o usuário digitar o valor 0. Ou seja, vamos somar
        todos os valores que o usuário digitar, porém quando ele digitar 0 o “loop” acaba, a cada
        iteração do loop vamos apresentar o resultado atual da soma.
        */
    int soma = 0; // variaveis que mostra a soma dos numeros que foram digitados
        
        while(true){ // Ira repetir o codi automaticamente
            String input = JOptionPane.showInputDialog("Digite qualquer numero a somar do todos");
            int N = Integer.parseInt(input);
       
                if(N != 0){
                    soma = soma + N;
            }
                if(N == 0){
                    JOptionPane.showMessageDialog(null, "A Soma final e "+soma);// mostra quantos numeros foram digitados
                    break; // quando o zero for digitado o codigo encerrara
            }
            
        }
    }
}