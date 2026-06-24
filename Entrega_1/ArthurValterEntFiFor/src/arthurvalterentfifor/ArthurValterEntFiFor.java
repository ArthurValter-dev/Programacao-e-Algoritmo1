/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package arthurvalterentfifor;

import javax.swing.JOptionPane;
public class ArthurValterEntFiFor {

    public static void main(String[] args) {
        /*1-Façar um algoritmo para somar valores até o usuário digitar o valor 0. Ou seja, vamos somar
        todos os valores que o usuário digitar, porém quando ele digitar 0 o “loop” acaba, a cada
        iteração do loop vamos apresentar o resultado atual da soma.
        Obs: teste no final
        2-Que tal fazer o mesmo exercício que fizemos acima com a estrutura ENQUANTO-FAÇA, mas
        desta vez utilizando a estrutura REPITA-ATÉ?
        */
        
        int soma = 0; // variaveis que mostra a soma dos numeros que foram digitados
        do{
            String input = JOptionPane.showInputDialog("Digite qualquer numero a somar do todos");
            int N = Integer.parseInt(input);
            soma = N+soma;
            if(N == 0){
                JOptionPane.showMessageDialog(null, "A Soma final e "+soma);// mostra quantos numeros foram digitados
                break;
            }
        }
