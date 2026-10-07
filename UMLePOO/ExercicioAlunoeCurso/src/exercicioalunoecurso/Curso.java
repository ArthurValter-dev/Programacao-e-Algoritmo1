package exercicioalunoecurso;
import javax.swing.*;
public class Curso {
    
    
    private int codigo;
    private String nome;
    private int duracao;
    
    // Métodos

    public Curso(int codigo, String nome, int duracao) {
        this.codigo = codigo;
        this.nome = nome;
        this.duracao = duracao;
    }
    
    
    
    
    // Métodos acessores

    public int getCodigo() {
        return this.codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getDuracao() {
        return this.duracao;
    }

    public void setDuracao(int duracao) {
        this.duracao = duracao;
    }
    
    
}
