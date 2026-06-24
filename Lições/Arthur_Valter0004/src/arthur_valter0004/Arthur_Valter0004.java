/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package arthur_valter0004;

/**
 *
 * @author Admin
 */
public class Arthur_Valter0004 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    double A= 1, B= -5, C=6, D, X1, X2;
    System.out.println("O valor de X1 e X2");
       D=(B*B)- (4*A*C);
       double raD = Math.sqrt(D);
 
       X1=-B+ raD/(2*A);
       X2=-B- raD/(2*A);
    System.out.println(X1);
    System.out.println(X2);
    }
    
}
