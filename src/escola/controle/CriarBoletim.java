package escola.controle;

import escola.views.MensagemAluno;
import escola.views.MensagemMenu;
import escola.views.MensagemBoletim;
import escola.views.PrintBoletim;
import escola.repositorio.RepositorioAlunos;
import escola.repositorio.RepositorioDisciplinas;

import java.util.Scanner;

public class CriarBoletim {
    public static void criar(Scanner sc){

        MensagemAluno.escolhaCpf();

        int cpf = sc.nextInt();

        MensagemBoletim.boletimEscolha();

        int opcao = sc.nextInt();

        MenuBoletim.escolha(opcao);

        PrintBoletim.print(RepositorioDisciplinas.getListaDisciplinas(cpf), RepositorioAlunos.getAluno(cpf).nome);

    }
}
