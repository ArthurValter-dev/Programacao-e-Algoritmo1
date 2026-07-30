/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pkg11ºexer;

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
        /* algoritmo que leia quatro notas obtidas por um aluno, calcule a
           média das nota obtidas, imprima na tela o nome do aluno e se o aluno foi
           aprovado ou reprovado. Para o aluno ser considerado aprovado sua média final
           deve ser maior ou igual a 7
        */
        
        double n1,n2,n3,n4; // Variáveis das notas do aluno
        double media; // Variável da média das notas do aluno
        String aluno; // Variável que será atribuinda pelo nome do aluno
        
       
        aluno = JOptionPane.showInputDialog(null,"Digite o nome do aluno");
        
        // Atribuindo valores para as variáveis de notas do aluno
        
        n1 = Double.parseDouble(JOptionPane.showInputDialog(null,"Digite a 1ªnota do Aluno"));
        n2 = Double.parseDouble(JOptionPane.showInputDialog(null,"Digite a 2ªnota do Aluno"));
        n3 = Double.parseDouble(JOptionPane.showInputDialog(null,"Digite a 3ªnota do Aluno"));
        n4 = Double.parseDouble(JOptionPane.showInputDialog(null,"Digite a 4ªnota do Aluno"));
        
        media = (n1+n2+n3+n4)/4;
        
        // Caso o aluno esteja aprovado
        if(media >= 7) JOptionPane.showMessageDialog(null,aluno+" está Aprovado(a) sua média é "+media);
        // Caso contrário
        else JOptionPane.showMessageDialog(null,aluno+" está Reprovado(a) sua média é "+media);
    }
    
}
