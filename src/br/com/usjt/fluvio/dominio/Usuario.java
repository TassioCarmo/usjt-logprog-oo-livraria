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
        this.nome = getNome();
        this.numeroDeMatricula = getNumeroDeMatricula();
        this.idade = getIdade();
        this.cpf = getCpf();
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

    public String maiorOuMenor(){
        if(idade >= 18){
            return "Maior de idade";
        }else
            return "Menor de idade";
    }

    public boolean ehPar(){
        if(numeroDeMatricula % 2 == 0){
            return true;
        }else
            return false;
    }

    public  String classificarUsuario(){
        if(numeroDeMatricula < 1000 && idade > 25){
            return "Usuário Sênior";
        } else if (numeroDeMatricula >= 1001 && numeroDeMatricula < 10000 && idade >= 18 && idade <= 24) {
            return "Usuário Júnior";
        }else
            return "Usuário Calouros";
    }

    public  String geraLogin(){
        return nome.substring(0,4) + idade;


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
