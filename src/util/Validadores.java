/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package util;

import java.time.LocalDate;
import servicos.AlunoServicos;

/**
 *
 * @author 631610260
 */
public class Validadores {
    public static String matricula() {
        AlunoServicos as = new AlunoServicos();
        int anoA = LocalDate.now().getYear();
        int idAluno = as.getIdLast();
        return "" + anoA + (idAluno++);
    }
}
