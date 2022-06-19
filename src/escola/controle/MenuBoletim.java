package escola.controle;

import escola.views.MensagemMenu;
import escola.views.MensagemBoletim;

import java.util.Scanner;


public class MenuBoletim {
    private static final Scanner sc = new Scanner(System.in);

public static void escolha(int opcao) {
    switch (opcao) {
        case 1:
            MensagemBoletim.enviarBoletimEmail();
            String email = sc.next();
            break;
        case 2:
            MensagemBoletim.enviarBoletimTelefone();
            int telefone = sc.nextInt();
            break;
        case 3:
            MensagemBoletim.imprimirBoletim();
            break;
        case 4:
            MenuPrincipal.run();
            break;
        default:
            MensagemMenu.escolhaInvalida();
            break;
    }
}
}
