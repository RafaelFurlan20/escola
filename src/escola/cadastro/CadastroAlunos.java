package escola.cadastro;

import escola.modelo.Aluno;
import escola.repositorio.RepositorioAlunos;

import java.util.Scanner;

public class CadastroAlunos {
    public static void cadastrar(Scanner sc) {
        System.out.println("Informe as seguintes informações");

        System.out.print("Informe o CPF do Aluno:");
        int cpf = sc.nextInt();

        System.out.print("Informe o nome do Aluno:");
        String nome = sc.next();

        RepositorioAlunos.salvar(new Aluno(nome,cpf));
    }
}