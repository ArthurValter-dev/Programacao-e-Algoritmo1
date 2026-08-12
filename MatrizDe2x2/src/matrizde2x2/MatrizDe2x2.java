/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package matrizde2x2;

/**
 *
 * @author Admin
 */

import javax.swing.JOptionPane;

public class MatrizDe2x2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        int a[][] = new int [2][2];
        int b[][] = new int [2][2];
        
        int c[][] = new int [2][2];
        
        for(int i = 0;i < 2;i++){
            for(int j = 0 ;j <2;j++){
                a[i][j] = Integer.parseInt(JOptionPane.showInputDialog(null,"Digite para a matriz A ("+i+"/"+j+")"));
            }
        }
        
        for(int i = 0;i < 2;i++){
            for(int j = 0 ;j <2;j++){
                b[i][j] = Integer.parseInt(JOptionPane.showInputDialog(null,"Digite para a matriz B ("+i+"/"+j+")"));
            }
        }
        
        //Valores da matriz A
        JOptionPane.showMessageDialog(null,"Os valores de A (está no console)");
        System.out.println(" A: ");
        for(int i = 0;i < 2;i++){
            for(int j = 0 ;j <2;j++){
                System.out.print(a[i][j] + "\t");
            }
            System.out.println(" ");
        }
        System.out.println(" ");
        
        //Valores da matriz B
        JOptionPane.showMessageDialog(null,"Os valores de B (está no console)");
        System.out.println(" B: ");
        for(int i = 0;i < 2;i++){
            for(int j = 0 ;j <2;j++){
                System.out.print(b[i][j] + "\t");
            }
            System.out.println(" ");
        }
        System.out.println(" ");
        
        // A Soma
        JOptionPane.showMessageDialog(null,"A soma das matrizes ");
        System.out.println(" C da soma: ");
        for(int i = 0;i < 2; i++){
            for(int j = 0;j<2; j++ ){
                c[i][j] = (a[i][j]) + (b[i][j]);
                System.out.print(c[i][j] +"\t");
            }
            System.out.println(" ");
        }
        
        // A Subtração
        JOptionPane.showMessageDialog(null,"A subtração das matrizes ");
        System.out.println(" C da soma: ");
        for(int i = 0;i < 2; i++){
            for(int j = 0;j<2; j++ ){
                c[i][j] = (a[i][j]) - (b[i][j]);
                System.out.print(c[i][j] +"\t");
            }
            System.out.println(" ");
        }
        
        // A divisão
        JOptionPane.showMessageDialog(null,"A divisão das matrizes ");
        System.out.println(" C da soma: ");
        for(int i = 0;i < 2; i++){
            for(int j = 0;j<2; j++ ){
                c[i][j] = (a[i][j]) / (b[i][j]);
                System.out.print(c[i][j] +"\t");
            }
            System.out.println(" ");
        }
    }
}
