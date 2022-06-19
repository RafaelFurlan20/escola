package escola.controle;

import escola.cadastro.CadastrarDisciplinaNoAluno;
import escola.cadastro.CadastroAlunos;
import escola.views.MensagemMenu;
import java.util.Scanner;

public class MenuPrincipal {
    private static final Scanner sc = new Scanner(System.in);
    public static void run(){

        MensagemMenu.printarMenu();

        switch (sc.nextInt()) {
            case 1:
                CadastroAlunos.cadastrar(sc);
                break;
            case 2:
                CadastrarDisciplinaNoAluno.cadastro(sc);
                break;
            case 3:
                CriarBoletim.criar(sc);
                break;
            default:
                MensagemMenu.escolhaInvalida();
                break;
        }
        MenuPrincipal.run();
    }
   
}
