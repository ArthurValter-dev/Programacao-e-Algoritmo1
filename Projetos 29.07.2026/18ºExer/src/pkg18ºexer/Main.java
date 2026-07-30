/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pkg18ºexer;

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
        // Faça um algoritmo que imprima na tela a tabuada de 1 até 10
        
        //O codígo será exercutado no laço
        for(int i = 1; i <= 10;i++){ // Laço que irá de 1 a 10
            for(int j = 1; j <= 10; j++){ // Laço que irá multiplicar o número de 1 a 10
                
                // Exibindo os produtos
                JOptionPane.showMessageDialog(null,"A tabuada de "+i+"\n"+i+"x "+j+" = "+(i*j));
            }
        }
    }
    
}
