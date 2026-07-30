/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pkg23ºexer;

/**
 *
 * @author Arthur V
 */

import javax.swing.JOptionPane;

public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /* algoritmo que calcule a quantidade de litros de combustível gastos
           em uma viagem, sabendo que o carro faz 12km com um litro. Deve-se fornecer ao
           usuário o tempo que será gasto na viagem a sua velocidade média, distância
           percorrida e a quantidade de litros utilizados para fazer a viagem.
           Fórmula: distância = tempo x velocidade. litros usados = distância / 12.
        */
        
        // Declarando variaveis
        
        double Vm; // Velocidade Média em Km/h
        double h; // Tempo em horas
        double dist; // Distância
        double com; // litros do combustivel
        
        // Entrada de dados
        
        Vm = Double.parseDouble(JOptionPane.showInputDialog(null,"Digite a velocidade média em Km/h:"));
        h = Double.parseDouble(JOptionPane.showInputDialog(null,"Digite o tempo gasto em horas"));
        
        // Usando as fórmulas
        
        //Distância do percorrida
        dist = h * Vm;
        
        // Litros gastos
        com = dist / 12;
        
        // Exibindo valores
        JOptionPane.showMessageDialog(null,
                "Uma distância de "+dist+"com uma velocidade média de "+Vm+
                        " em "+h+" horas foram gastos "+com+" litros de combustiveis");
    }
    
}
