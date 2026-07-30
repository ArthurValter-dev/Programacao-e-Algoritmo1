/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pkg9ºexer;

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
        /*Faça um algoritmo que calcule o IMC (Índice de Massa Corporal) de uma
          pessoa, leia o seu peso e sua altura e imprima na tela sua condição de acordo
          com a tabela abaixo
        
        Abaixo de 18,5 | Abaixo do peso
        Entre 18,6 e 24,9 | Peso ideal (parabéns)
        Entre 25,0 e 29,9 | Levemente acima do peso
        Entre 30,0 e 34,9 | Obesidade grau I
        Entre 35,0 e 39,9 | Obesidade grau II (severa)
        Maior ou igual a 40 | Obesidade grau III (mórbida)*/
        
        // Declarando Variáveis
        
        double alt, // Variável que será atribuindo o valor da altura pelo usuário  
               peso;// Variável que será atribuindo o valor do peso pelo usuário
        
        double imc; // Variável que será atribuido o valor do IMC
        
        alt = Double.parseDouble(JOptionPane.showInputDialog(null,"Digite sua altura"));
        
        peso = Double.parseDouble(JOptionPane.showInputDialog(null,"Digite seu peso"));
        
        imc = (peso/alt)*(peso/alt);
        
        // Iniciando verifcação do IMC
        if(imc <= 18.5) JOptionPane.showMessageDialog(null,"Peso Ideal *** Parabéms ***");
        
        else if(imc >= 18.6 | imc <= 24.9) JOptionPane.showMessageDialog(null,"Levemente acima do peso");
        
        else if(imc >= 25.0 | imc <=29.9) JOptionPane.showMessageDialog(null,"Obesidade grau I");
        
        else if(imc >=30.0 | imc <= 34.9) JOptionPane.showMessageDialog(null,"Obesidade grau II");
        
        else if(imc >= 35.0 | imc <= 39.9) JOptionPane.showMessageDialog(null,"Obesidade grau III / Mórbida");
    }
    
}
