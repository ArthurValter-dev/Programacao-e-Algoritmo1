/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package exercicio3;

/**
 *
 * @author Admin
 */
import javax.swing.JOptionPane;
public class Exercicio3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /* Crie um programa que percorra uma matriz retangular de 2 linhas e 3 colunas e calcule:
        1. A soma de todos os elementos;
        2. A média dos elementos;
        3. O maior elemento.*/
        
        int[][] A = new int[2][3];
        int media,soma = 0,maior = 0;
        for(int i = 0;i<A.length;i++){
            for(int j = 0;j <A[i].length;j++){
                A[i][j] = Integer.parseInt(JOptionPane.showInputDialog(null,"Digite um valor para a Matriz A ("+(i+1)+","+(j+1)+")"));
            }
        }
        
        
        
        // Apresentar valores
        System.out.println(" A: ");
        for(int i = 0;i<A.length;i++){
            for(int j = 0;j<A[i].length;j++){
             
                System.out.print(A[i][j]+"\t");
            }
            System.out.println("");
        }
        
        // Soma 
        for(int i = 0;i<A.length;i++){
            for(int j = 0;j<A[i].length;j++){
                soma += A[i][j];
            }
        }
        System.out.println("Soma dos valores:"+soma);
        
        //media
        media = soma /6;
        System.out.println("A media dos valores:"+media);
        
        for(int i = 0;i<A.length;i++){
            for(int j = 0;j<A[i].length;j++){
                if(maior < A[i][j]){
                    maior = A[i][j];
                }
            }
        }
        
        System.out.println("maior:"+maior);
    }
    
}
