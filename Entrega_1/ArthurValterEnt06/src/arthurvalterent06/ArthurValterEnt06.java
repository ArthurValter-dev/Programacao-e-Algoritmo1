/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package arthurvalterent06;

import javax.swing.JOptionPane;
public class ArthurValterEnt06 {

    public static void main(String[] args) {
        //Criar um algoritmo que entre com cinco números e imprima o quadrado de cada número.
        
        for(int cont = 1;cont <=5;cont++){
            
            String input = JOptionPane.showInputDialog("Digite qualquer numero para mostra o seu quadrado");
            int N = Integer.parseInt(input);
            JOptionPane.showMessageDialog(null,"O quadrado do "+cont+"° numero  e "+N*N);// mostrara o quadrado do numero digitado pelo ususario
            
        }
    }
    
}
