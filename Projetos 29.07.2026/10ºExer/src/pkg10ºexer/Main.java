/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pkg10ºexer;

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
        /* Faça um algoritmo que leia três notas obtidas por um aluno, 
           e imprima na tela a média das notas */
        
        // Declarando Variáveis
        double n1,n2,n3, // Variáveis das notas do aluno
               media;    // Variável da média dos alunos
        
        n1 = Double.parseDouble(JOptionPane.showInputDialog(null,"Digite a primeira nota"));
        n2 = Double.parseDouble(JOptionPane.showInputDialog(null,"Digite a segunda nota"));
        n3 = Double.parseDouble(JOptionPane.showInputDialog(null,"Digite a terceira nota"));
        
        media = (n1+n2+n3) / 3;
        
        JOptionPane.showMessageDialog(null,"A média do aluno é "+media);
    }
    
}
