/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package exe1arthurvalter;

import javax.swing.JOptionPane;
public class EXE1ArthurValter {

    public static void main(String[] args) {
        //Exibir todos os números pares existentes entre os números 1 e 20
        
        int number_1 = 1, cont = 0, par;
        JOptionPane.showMessageDialog(null, "Esse codigo ira mostra os numeros pares de 1 a 20");
        for(int i = 1;i <= 20;i++ ){
            par = (number_1%2);
                if(par == 0){
                    JOptionPane.showMessageDialog(null,"O numero "+number_1);
                    cont++;
                }
            number_1++;
        }
        JOptionPane.showMessageDialog(null,"Fomam "+cont+" pares no total");
    }
    
}
