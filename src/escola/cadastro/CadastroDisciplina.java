package escola.cadastro;

import escola.modelo.Disciplina;

import java.util.Scanner;

public class CadastroDisciplina {
    public static Disciplina run(Scanner sc) {
        System.out.println("Informe as seguintes informações");

        System.out.print("Informe o nome da disciplina: ");
        String nome = sc.next();

        System.out.print("Informe a nota do aluno na disciplina: ");
        int nota = sc.nextInt();

        System.out.print("Informe a carga horária da disciplina: ");
        int cargaHoraria = sc.nextInt();

        return new Disciplina(nome,nota,cargaHoraria);
    }
}
