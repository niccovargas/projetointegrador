/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package servicos;

import dao.DAOFactory;
import dao.AlunoDAO;
import java.util.ArrayList;
import model.Aluno;
/**
 *
 * @author 631610260
 */
public class AlunoServicos {
    public void cadastroAluno(Aluno pVO){
        AlunoDAO aDAO = DAOFactory.getAlunoDAO();
        aDAO.cadastrarAlunoDAO(pVO);
    }
    
    public ArrayList<Aluno> getAlunos(){
        AlunoDAO aDAO = DAOFactory.getAlunoDAO();
        return aDAO.getAlunos();
    }
    
    public Aluno getAlunoByDoc(String matricula){
        AlunoDAO aDAO = DAOFactory.getAlunoDAO();
        return aDAO.getAlunoByDoc(matricula);
    }
    
    public void atualizarAluno(Aluno pVO){
        AlunoDAO aDAO = DAOFactory.getAlunoDAO();
        aDAO.atualizarAlunoDAO(pVO);
    }
    
    public void deletarAluno(String matricula){
        AlunoDAO aDAO = DAOFactory.getAlunoDAO();
        aDAO.deletarAlunoDAO(matricula);
    }
}
 