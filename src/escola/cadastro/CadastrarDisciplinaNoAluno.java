package escola.cadastro;

import escola.views.MensagemAluno;
import escola.views.MensagemMenu;
import escola.modelo.Aluno;
import escola.repositorio.RepositorioAlunos;
import escola.repositorio.RepositorioDisciplinas;

import java.util.Scanner;

public class CadastrarDisciplinaNoAluno {
    public static void cadastro(Scanner sc){

        MensagemAluno.escolhaCpf();

        int cpf = sc.nextInt();

        Aluno aluno = RepositorioAlunos.getAluno(cpf);

        if (aluno == null) {

            MensagemAluno.alunoNaoEncontrado();

            return;

        }

        RepositorioDisciplinas.salvar(aluno, CadastroDisciplina.run(sc));

    }
}
