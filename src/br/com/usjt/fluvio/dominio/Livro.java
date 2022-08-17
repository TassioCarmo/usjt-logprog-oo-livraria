package br.com.usjt.fluvio.dominio;

public class Livro {

    private String titulo;
    private String autor;
    private int paginas;
    private double preco;
    private int numeroDaEdicao;
    private int emprestado;

    public Livro(){

        titulo = "Sem titulo";
        autor = "Anônimo";
        paginas = 0;
        preco = 0.0;
        numeroDaEdicao = 0;
        emprestado = 0;

    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getPaginas() {
        return paginas;
    }

    public void setPaginas(int paginas) {
        this.paginas = paginas;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public int getNumeroDaEdicao() {
        return numeroDaEdicao;
    }

    public void setNumeroDaEdicao(int numeroDaEdicao) {
        this.numeroDaEdicao = numeroDaEdicao;
    }

    public int getEmprestado() {
        return emprestado;
    }

    public void setEmprestado() {
        this.emprestado++;
    }

    public void imprimirDadosDoLivro(){
        System.out.println(  "Livro{" +
                "titulo='" + titulo + '\'' +
                ", autor='" + autor + '\'' +
                ", paginas=" + paginas +
                ", preco=" + preco +
                ", numeroDaEdicao=" + numeroDaEdicao +
                ", emprestado=" + emprestado +
                '}');
    }

    @Override
    public String toString() {
        return "Livro{" +
                "titulo='" + titulo + '\'' +
                ", autor='" + autor + '\'' +
                ", paginas=" + paginas +
                ", preco=" + preco +
                ", numeroDaEdicao=" + numeroDaEdicao +
                ", emprestado=" + emprestado +
                '}';
    }
}