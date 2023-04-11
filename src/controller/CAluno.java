/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import java.util.ArrayList;
import model.Aluno;
/**
 *
 * @author 631610260
 */
public class CAluno {
    
    ArrayList<Aluno> alunos = new ArrayList<>();
    int idAluno = 1;
    
    /**
     * Autoincrement idPessoa
     * @return 
     */
    public int geraID(){
        return this.idAluno++;
    }

    /**
     * Método addPessoa adiciona Pessoa no ArrayList pessoas
     *
     * @param a
     */
    public void addAluno(Aluno a) {
        this.alunos.add(a);
    }

    /**
     * Método removePessoa remove Pessoa do ArrayList pessoas
     *
     * @param a
     */
    public void removeAluno(Aluno a) {
        this.alunos.remove(a);
    }

    public ArrayList<Aluno> getAlunos() {
        return this.alunos;
    }

    
    
    public void mockAlunos(){
        Aluno a1 = new Aluno();
        a1.setIdAluno(idAluno);
        a1.setNome("Cleiton Vasconcelos");
        a1.setMatricula(idAluno);
        a1.setSerie(idAluno);
        a1.setTurma("1A");
        addAluno(a1);
        Aluno a2 = new Aluno();
        a2.setIdAluno(idAluno);
        a2.setNome("Cleiton Vasconcelos");
        a2.setMatricula(idAluno);
        a2.setSerie(idAluno);
        a2.setTurma("1A");
        addAluno(a2);
        
        
    }
    
}
