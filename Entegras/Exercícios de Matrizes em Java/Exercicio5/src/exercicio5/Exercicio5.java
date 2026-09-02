/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package exercicio5;

/**
 *
 * @author Admin
 */
import javax.swing.JOptionPane;
public class Exercicio5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Crie um programa em Java que multiplique todos os elementos da matriz pelo número 3.
        
        int[][] A = new int[2][2];
        
        int[][] A3 = new int[2][2];
        
        
        for(int i = 0;i<A.length;i++){
            for(int j = 0;j <A[i].length;j++){
                A[i][j] = Integer.parseInt(JOptionPane.showInputDialog(null,"Digite um valor para a Matriz A ("+(i+1)+","+(j+1)+")"));
            }
        }
        
        for(int i = 0;i<A.length;i++){
            for(int j = 0;j<A[i].length;j++){
                A3[i][j] = 3*(A[i][j]);
            }
        }
        
         System.out.println(" A: ");
        for(int i = 0;i<A.length;i++){
            for(int j = 0;j<A[i].length;j++){
             
                System.out.print(A[i][j]+"\t");
            }
            System.out.println("");
        }
        
         System.out.println(" A X 3: ");
        for(int i = 0;i<A3.length;i++){
            for(int j = 0;j<A3[i].length;j++){
             
                System.out.print(A3[i][j]+"\t");
            }
            System.out.println("");
        }
    }
    
}
