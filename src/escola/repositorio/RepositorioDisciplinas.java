package escola.repositorio;

import escola.modelo.Aluno;
import escola.modelo.Disciplina;

import java.util.*;

public class RepositorioDisciplinas {

    private static Map<Integer, List<Disciplina>> indentificadorDiciplinas;

    public static void inicializar(){

    indentificadorDiciplinas = new TreeMap<>();
    List<Disciplina> todasMaterias = new ArrayList<>();
    todasMaterias.add(new Disciplina("teste",123,36));
    indentificadorDiciplinas.put(0,todasMaterias);

    }

    public static void salvar(Aluno aluno, Disciplina disciplina) {

        List<Disciplina> listaDisciplinas = Objects.isNull(getListaDisciplinas(aluno.getCpf())) ?
                new ArrayList<>() : getListaDisciplinas(aluno.getCpf());
        listaDisciplinas.add(disciplina);
        indentificadorDiciplinas.put(aluno.getCpf(), listaDisciplinas);

    }
    public static List<Disciplina> getListaDisciplinas(int cpf) {

        return indentificadorDiciplinas.get(cpf);

    }

}
