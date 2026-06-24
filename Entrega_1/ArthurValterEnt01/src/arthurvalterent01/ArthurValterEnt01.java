/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package arthurvalterent01;

import javax.swing.JOptionPane;
public class ArthurValterEnt01 {

    public static void main(String[] args) {
        // Apresente os números impares existentes entre 75 e 197 inclusive
        
        
        int n1 = 75, n2 = 197;
        //Apresenta função do codigo
        JOptionPane.showMessageDialog(null,"Esse codigo ira mostra os numeros impares entre 75");
        
        //Declarando variaveis
        
        //O contador servira para mostrar o numero impar em quetão
        int cont = 1;
        while(n1 <=n2){
            n1 = n1+2;
            JOptionPane.showMessageDialog(null,"O "+cont+"° e "+n1);
            
            //ao n1 chegar ao valor de n2 o laço acabara
            if(n1 == n2){
                break;
            }
            cont++;
        }
    }
    
}
