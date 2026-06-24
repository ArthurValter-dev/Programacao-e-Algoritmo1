
package arthurvalterent02;

import javax.swing.JOptionPane;
public class ArthurValterEnt02 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Apresente todos os números inteiros de 200 a 100 (em ordem decrescente)
        //Declarando variaveis
        int n1 = 100, n2 = 200;
        JOptionPane.showMessageDialog(null,"Esse codigo ira mostra em ordem "+"decrescente \n "+"todos os numeros inteiros de 200 a 100");
        while(n2 >= 100){
            //Apresentando o valor de n2 atual
            JOptionPane.showMessageDialog(null,n2);
            //Diminindo o valor de n2 para assim chegar em 100.
            n2 = n2 - 1;
        }
    }
    
}
