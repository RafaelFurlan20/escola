package escola;

import escola.controle.MenuPrincipal;
import escola.repositorio.RepositorioAlunos;
import escola.repositorio.RepositorioDisciplinas;

public class App {
    public static void main(String[] args) {
        RepositorioAlunos.inicializar();
        RepositorioDisciplinas.inicializar();
        MenuPrincipal.run();
    }
}
