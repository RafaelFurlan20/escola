package escola.views;

public class MensagemBoletim {
    public static void boletimEscolha(){
        System.out.println("Deseja enviar o seguinte boletim, por qual plataforma:\n1- Email\n2- Telefone\n3- Imprimir" +
                "\n4- Voltar para o menu principal");
    }
    public static void enviarBoletimTelefone(){
        System.out.println("Digite o número de telefone:");
    }
    public static void enviarBoletimEmail(){
        System.out.println("Digite o email");
    }
    public static void imprimirBoletim(){
        System.out.println("Imprimindo...");
    }
}
