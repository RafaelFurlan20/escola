package escola.views;

import escola.modelo.Disciplina;

import java.util.List;

public class PrintBoletim {
    public static void print(List<Disciplina> lista, String nome){
        System.out.printf("Notas do(a) Aluno(a) %s %n",nome);
        for (Disciplina disciplina : lista) {
            System.out.printf("Nome da disciplina: %s  Nota na disciplina: %.2f  Carga Horária da disciplina: %.2f %n",
                    disciplina.nome, disciplina.nota, disciplina.cargaHoraria);
        }
    }
}
