/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package arthurvalterent05;

import javax.swing.JOptionPane;
public class ArthurValterEnt05 {

    public static void main(String[] args) {
        // Criar um algoritmos que imprima os números pares no intervalo de 1-10.
        
        JOptionPane.showMessageDialog(null, "Esse codigo ira mostra os numeros pares de 1 a 10");
        int cont = 1;//variavel que ficara o local do numero
        
        for(int n = 2;n <= 10;cont++){
            JOptionPane.showMessageDialog(null, n+" e "+cont+"° numero");// mostra o local do numero
            n +=2;// n e o valor que sera os pares dos numeros ate 10
        }
    }
}
