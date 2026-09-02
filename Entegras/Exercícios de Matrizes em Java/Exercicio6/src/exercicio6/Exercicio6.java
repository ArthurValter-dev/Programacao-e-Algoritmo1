/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package exercicio6;

/**
 *
 * @author Admin
 */

import javax.swing.JOptionPane;
public class Exercicio6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int[][] A = new int[2][3];
        
        int[][] A5 = new int[2][3];
        
        
        for(int i = 0;i<A.length;i++){
            for(int j = 0;j <A[i].length;j++){
                A[i][j] = Integer.parseInt(JOptionPane.showInputDialog(null,"Digite um valor para a Matriz A ("+(i+1)+","+(j+1)+")"));
            }
        }
        
        for(int i = 0;i<A.length;i++){
            for(int j = 0;j<A[i].length;j++){
                A5[i][j] = 5*(A[i][j]);
            }
        }
        
         System.out.println(" A: ");
        for(int i = 0;i<A.length;i++){
            for(int j = 0;j<A[i].length;j++){
             
                System.out.print(A[i][j]+"\t");
            }
            System.out.println("");
        }
        
         System.out.println(" A X 5: ");
        for(int i = 0;i<A5.length;i++){
            for(int j = 0;j<A5[i].length;j++){
             
                System.out.print(A5[i][j]+"\t");
            }
            System.out.println("");
        }
    }
    
}