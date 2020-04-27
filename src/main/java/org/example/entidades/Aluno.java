package org.example.entidades;

public class Aluno {
    private long tia;
    private String nome;
    private String curso;

    public Aluno(long tia, String nome, String curso) {
        this.tia = tia;
        this.nome = nome;
        this.curso = curso;
    }

    public Aluno(){}

    public long getTia() {
        return tia;
    }

    public void setTia(long tia) {
        this.tia = tia;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }
}
