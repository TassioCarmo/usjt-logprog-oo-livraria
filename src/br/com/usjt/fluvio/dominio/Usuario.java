package br.com.usjt.fluvio.dominio;

public class Usuario {

    private String nome;
    private int numeroDeMatricula;
    private int idade;
    private String cpf;

    public Usuario(){

        nome = "Usuario não definido";
        numeroDeMatricula = 0;
        idade = 0;
        cpf = "000.000.000-00";

    }

    public Usuario(String nome, int numeroDeMatricula, int idade, String cpf) {
        this.nome = nome;
        this.numeroDeMatricula = numeroDeMatricula;
        this.idade = idade;
        this.cpf = cpf;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getNumeroDeMatricula() {
        return numeroDeMatricula;
    }

    public void setNumeroDeMatricula(int numeroDeMatricula) {
        if (numeroDeMatricula < 0){
            System.out.println("Numero de Matricula não pode ser negativa");
        }else {
            this.numeroDeMatricula = numeroDeMatricula;
        }
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        if (idade < 0){
            System.out.println("Idade não pode ser negativa");
        }else {
            this.idade = idade;
        }
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    @Override
    public String toString() {
        return "Usuario{" +
                "nome='" + nome + '\'' +
                ", numeroDeMatricula=" + numeroDeMatricula +
                ", idade=" + idade +
                ", cpf='" + cpf + '\'' +
                '}';
    }
}
