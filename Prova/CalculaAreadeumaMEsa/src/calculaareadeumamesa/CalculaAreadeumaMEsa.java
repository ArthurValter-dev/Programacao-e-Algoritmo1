/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package calculaareadeumamesa;
import javax.swing.JOptionPane;
public class CalculaAreadeumaMEsa {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        double x;
        String input = JOptionPane.showInputDialog(null,"Digite o comprimento da mesa");
        x = Double.parseDouble(input);
        input = JOptionPane.showInputDialog(null,"Digite a largura da mesa");
        double y = Double.parseDouble(input);
        double area = x*y;
        JOptionPane.showConfirmDialog(null,"Area e igual a "+area+"\ncomprimento: "+x+"\nlargura: "+y);
    }
    
}
