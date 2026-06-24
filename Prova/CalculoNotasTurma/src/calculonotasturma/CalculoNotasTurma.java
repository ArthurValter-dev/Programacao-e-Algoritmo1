/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package calculonotasturma;

import javax.swing.JOptionPane;
public class CalculoNotasTurma {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        double nota[] = new double [5];
        int i;
        double soma = 0, media;
        for(i = 0;i<5;i++){
            int l = i+1;
            nota[i] = Double.parseDouble(JOptionPane.showInputDialog(null,"Digite a nota do aluno "+l+"º:"));
            soma = soma +nota[i];
        }
        media = soma /5;
        JOptionPane.showMessageDialog(null,"------------\nA MEDIA DE TURMA E :"+media+"\n------------");
        
        for(i = 0;i<5;i++){
            if(nota[i]>=media){
                int l = i+1;
                JOptionPane.showMessageDialog(null,"Aluno "+l+"º com nota "+nota[i]);
            }
        }
    }
}
