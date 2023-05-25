/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package turmasescolares;



/**
 *
 * @author 631610260
 */
public class TurmasEscolares {
    
    

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    }
    
    public static void menuP() {
        System.out.println("-- Menu Principal --");
        System.out.println("1 - Ger. Aluno");
        System.out.println("2 - Ger. Projeto");
        System.out.println("0 - Sair");
        System.out.print("Digite aqui: ");
    }
    
    public static void subMenu(int opM) {
        String subM = null;
        if (opM == 1) {
            subM = "Aluno";
        }
        if (opM == 2) {
            subM = "Projeto";
        }
        System.out.println("-- Ger. " + subM + " --");
        System.out.println("1 - Cadastrar " + subM);
        System.out.println("2 - Editar " + subM);
        System.out.println("3 - Listar " + subM + "s");
        System.out.println("4 - Deletar " + subM);
        System.out.println("0 - Voltar");
        System.out.print("Digite aqui: ");
    }
    
    
    
}
