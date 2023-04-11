/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author 631610260
 */
public class Aluno {
    
    private int idAluno;
    private String nome;
    private int matricula;
    private int serie;
    private String turma;
    
    
    public Aluno (){
        
    }

    public Aluno(String nome, int matricula, int serie, String turma, int idAluno) {
        this.nome = nome;
        this.matricula = matricula;
        this.serie = serie;
        this.turma = turma;
        this.idAluno = idAluno;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getMatricula() {
        return matricula;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

    public int getSerie() {
        return serie;
    }

    public void setSerie(int serie) {
        this.serie = serie;
    }

    public String getTurma() {
        return turma;
    }

    public void setTurma(String turma) {
        this.turma = turma;
    }

    public int getIdAluno() {
        return idAluno;
    }

    public void setIdAluno(int idAluno) {
        this.idAluno = idAluno;
    }

    @Override
    public String toString() {
        return "\n-- Aluno --" + "\nidAluno: \t" + idAluno + "\nNome: \t" + nome + "\nMatricula: \t" + matricula + "\nSerie: \t" + serie + "\nTurma: \t" + turma ;
    }

    
    
}
