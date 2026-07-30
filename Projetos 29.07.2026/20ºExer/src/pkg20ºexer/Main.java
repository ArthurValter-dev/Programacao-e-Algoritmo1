/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pkg20ºexer;

/**
 *
 * @author Arthur V
 */

import javax.swing.JOptionPane;
import java.util.Random;
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //algoritmo que mostre um valor aleatório entre 0 e 100
        
        
        Random ale = new Random(); // Declarando objeto da classe Random
        
        int n; // Declarando variável que será atribuida com o valor do objeto
        
        
        n = ale.nextInt(100); // Atribuindo um valor aleatório de 0 a 100
        
        //Exibindo o valor
        JOptionPane.showMessageDialog(null,"Esse algoritmo irá mostrar um valor aleatório entre 0 e 100\n o número é: "+n);
    }
    
}
