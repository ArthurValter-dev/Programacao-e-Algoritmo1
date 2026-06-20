/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package exe2arthurvalter;

import javax.swing.JOptionPane;
public class EXE2ArthurValter {

    public static void main(String[] args) {
        //Efetuar a tabuada do número informado pelo usuário
        
        int number_user,multiplicador = 0;
        int number_tabela[]= new int[11];
        String entrada = JOptionPane.showInputDialog(null,"Esse cogigo mostara a tabuada de qualquer numero indo de 0 a 10");
        number_user = Integer.parseInt(entrada);
        JOptionPane.showMessageDialog(null,"tabuaba do "+number_user+":");
        for(int cont= 0;cont < 11;cont++){
            number_tabela[cont]= number_user*multiplicador;
            JOptionPane.showMessageDialog(null,number_user+"*"+multiplicador+"="+number_tabela[cont]);
            multiplicador++;
        }
        
        
    }
    
}
