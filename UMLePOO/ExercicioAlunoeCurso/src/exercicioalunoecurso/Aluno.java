/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exercicioalunoecurso;

import javax.swing.JOptionPane;

public class Aluno {
    
    
    private  int matricula;
    private String nome;
    private int idade;
    private Curso curso;


    // Construtor

    public Aluno(
            int matricula,
            String nome,
            int idade,
            String nomeCurso,
            int duracao,
            int codigo) {
        this.matricula = matricula;
        this.nome = nome;
        this.idade = idade;
        this.setCurso(codigo,nomeCurso,duracao);
    }
    
    // Métodos
    
    public void exibirDados(){
        
        JOptionPane.showMessageDialog(null,
                "Aluno "+
                "\nNome do Aluno: "+this.getNome()+
                "\nMatricula: "+this.getMatricula()+
                "\nIdade: "+this.getIdade()+
                "\n\nCurso: "+
                "\nCódigo  "+this.curso.getCodigo()+
                "\nNome do Curso: "+this.curso.getNome()+
                "\nDuração: "+this.curso.getDuracao()+ " semestre");
    }
    
    // Métodos acessores 
    
    public int getMatricula() {
        return this.matricula;
    }

    public void setMarticula(int matricula) {
        this.matricula = matricula;
    }

    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return this.idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }
    
    public void setCurso(int c,String nc,int d){
        this.curso = new Curso(c,nc,d);
    }
}
