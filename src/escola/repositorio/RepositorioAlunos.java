package escola.repositorio;

import escola.modelo.Aluno;

import java.util.*;

public class RepositorioAlunos {

    public static List<Aluno> alunos;

    public static void inicializar(){
        alunos = new ArrayList<>();
        alunos.add(new Aluno("teste",123));

    }

    public static void salvar(Aluno aluno) {

        alunos.add(aluno);

    }

    public static Aluno getAluno(int cpf) {
        for (Aluno aluno : alunos) {
            if (Objects.equals(aluno.cpf, cpf)) {
                return aluno;
            }
        }
        return null;
    }
}