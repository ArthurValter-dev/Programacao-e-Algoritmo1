/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package exercicio4;

/**
 *
 * @author Admin
 */

import javax.swing.JOptionPane;
public class Exercicio4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /*Dada duas matrizes retangular crie um programa em Java 
        que efetue multiplicação dessa matrizes*/
        
        int[][] A = new int[2][3];
        int[][] B = new int[3][2];
        
        int[][] C = new int[2][2];
        
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
        
        for(int i = 0;i<2;i++){
            for(int j = 0;j<2;j++){
                for(int k = 0;k<3;k++){
                    C[i][j] += (A[i][k]) * (B[k][j]);
                }
            }
        }
        
        
        System.out.println(" A: ");
        for(int i = 0;i<A.length;i++){
            for(int j = 0;j<A[i].length;j++){
             
                System.out.print(A[i][j]+"\t");
            }
            System.out.println("");
        }
        
        
        System.out.println(" B: ");
        for(int i = 0;i<B.length;i++){
            for(int j = 0;j<B[i].length;j++){
             
                System.out.print(B[i][j]+"\t");
            }
            System.out.println("");
        }
        
        System.out.println(" C: ");
        for(int i = 0;i<C.length;i++){
            for(int j = 0;j<C[i].length;j++){
             
                System.out.print(C[i][j]+"\t");
            }
            System.out.println("");
        }
    }
    
}
