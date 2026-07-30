/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pkg22ºexer;

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
        /* algoritmo que efetue o cálculo do salário líquido de um professor.
           As informações fornecidas serão: valor da hora aula, número de aulas lecionadas
           no mês e percentual de desconto do INSS(8,5%). Imprima na tela o salário líquido
           final.
*/
        // Declarando variáveis
        
        int al; // Aulas lecionadas
        double ha; // Valor hora das aulas
        double sali;// Salário líquido
        
        
        // Entradas de dados
        ha = Double.parseDouble(JOptionPane.showInputDialog(null,"Digite o valor hora das aulas do professor "));
        al = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite o número de aulas por mês do professor"));
        
        // Atribuindo valor para sali
        sali = ha * al; 
        
        //Descontando 8,5%
        sali = sali - (sali*(8.5/100));
        
        // Exibindo valor
        JOptionPane.showMessageDialog(null,"O salário líquido do professor é "+sali);
    }
    
}
