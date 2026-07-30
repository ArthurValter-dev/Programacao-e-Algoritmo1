/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pkg14ªexer;

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
        /* algoritmo que leia o ano em que uma pessoa nasceu, imprima na tela
           quantos anos, meses e dias essa pessoa ja viveu. Leve em consideração o ano com
           365 dias e o mês com 30 dias.*/
        
       int anoat,anonas, ano, mes, dias;
       
       anoat = Integer.parseInt(JOptionPane.showInputDialog(null,"Digite o nome que você nasceu"));
       
       // Atribuindo valor para ano diminuindo com o ano atual
       ano = 2026 - anoat;
       
       // Atribuindo valor para mes multiplicando por 12 
       mes = ano * 12;
       
       // Atribuindo valor para dias multiplicando por 30
       dias = mes * 30;
      
       // Exibindo valores das variáveis de ano, mes e dias 
       JOptionPane.showMessageDialog(null,"Você já viveu "+ano+" anos,"+mes+" meses"+" e "+dias);
    }
    
}