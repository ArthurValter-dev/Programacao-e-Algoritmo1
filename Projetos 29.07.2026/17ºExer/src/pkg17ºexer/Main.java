/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pkg17ºexer;

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
        /*  Francisco tem 1,50m e cresce 2 centímetros por ano, enquanto Sara tem 1,10m
            e cresce 3 centímetros por ano. Faça um algoritmo que calcule e imprima na tela
            em quantos anos serão necessários para que Francisco seja maior que Sara */
        
        double f = 1.50; // Francisco
        double s = 1.10; // Sara
        int ano = 0; // Variável que será atribuida com os anos necessários
        JOptionPane.showMessageDialog(null,"Francisco tem 1,50m e cresce 2 centímetros por ano, enquanto Sara tem 1,10m e cresce 3 centímetros por ano");
        while(true){
            f += 0.02; // Aumentando a altura de Francisco
            s += 0.03; // Aumentando a altura de Sara
            
            // Quando a Sara for maior que Francisco
            if( s > f){
                JOptionPane.showMessageDialog(null,"São necessários "+ano+" anos para Sara ficar maior do que Francisco");
                break;
            }
            // Aumentando a quantidade de anos
            ano++;
            
        }
        
        
    }
    
}
