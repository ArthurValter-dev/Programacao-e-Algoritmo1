/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package exercicios1;

/**
 *
 * @author Admin
 */
import javax.swing.JOptionPane;
public class Exercicios1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /*Crie um programa em Java que receba duas matrizes quadradas 2×2,
        realize a soma entre elas e apresente a matriz resultante*/
        
        int[][] A = new int [2][2];
        
        int[][] B = new int [2][2];
        
        int[][] C = new int [2][2];
        
        for(int i = 0;i<A.length;i++){
            for(int j = 0;j <A[i].length;j++){
                A[i][j] = Integer.parseInt(JOptionPane.showInputDialog(null,"Digite um valor para a Matriz A ("+(i+1)+","+(j+1)+")"));
            }
        }
        
        for(int i = 0;i<B.length;i++){
            for(int j = 0;j <B[i].length;j++){
                B[i][j] = Integer.parseInt(JOptionPane.showInputDialog(null,"Digite um valor para a Matriz B ("+(i+1)+","+(j+1)+")"));
            }
        }
        
        for(int i = 0;i<C.length;i++){
            for(int j = 0;j<C[i].length;j++){
                C[i][j] = (A[i][j]) + (B[i][j]);
            }
        }
        for(int i = 0;i<C.length;i++){
            for(int j = 0;j<C[i].length;j++){
             
                System.out.print(C[i][j]+"\t");
            }
            System.out.println("");
        }
    }
    
}
