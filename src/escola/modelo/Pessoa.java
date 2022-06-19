package escola.modelo;

abstract class Pessoa {

    public String nome;
    public int cpf;


    public Pessoa(String nome, int cpf) {
        this.nome = nome;
        this.cpf = cpf;
    }

    public int getCpf() {
        return cpf;
    }

}
