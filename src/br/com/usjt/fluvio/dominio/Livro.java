package br.com.usjt.fluvio.dominio;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;
import javax.swing.JOptionPane;


public class Livro {

    private String titulo;
    private String autor;
    private int paginas;
    private double preco;
    private int numeroDaEdicao;
    private int emprestado;
    private Date anoDePublicacao;
    private String editora;

    public Livro(){

        titulo = "Sem titulo";
        autor = "Anônimo";
        paginas = 0;
        preco = 0.0;
        numeroDaEdicao = 0;
        emprestado = 0;
        editora ="Sem editora";

    }

    public Livro(String titulo, String autor, int paginas, double preco, int numeroDaEdicao, int emprestado, Date anoDePublicacao, String editora) {
        this.titulo = getTitulo();
        this.autor = getAutor();
        this.paginas = getPaginas();
        this.preco = getPreco();
        this.numeroDaEdicao = getNumeroDaEdicao();
        this.emprestado = getEmprestado();
        this.anoDePublicacao = getAnoDePublicacao();
        this.editora = getEditora();
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
        if (paginas < 0){
            System.out.println("Numero de paginas não pode ser negativo");
        }else {
            this.paginas = paginas;
        }
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        if (preco < 0){
            System.out.println("Preço não pode ser negativo");
        }else {
            this.preco = preco;
        }
    }

    public int getNumeroDaEdicao() {
        return numeroDaEdicao;
    }

    public void setNumeroDaEdicao(int numeroDaEdicao) {
        if(numeroDaEdicao < 0){
            System.out.println("Numero da Edição não pode ser negativo");
        }else {
            this.numeroDaEdicao = numeroDaEdicao;
        }
    }

    public int getEmprestado() {
        return emprestado;
    }

    public void setEmprestado() {
        this.emprestado++;
    }

    public Date getAnoDePublicacao() {
        return anoDePublicacao;
    }

    public void setAnoDePublicacao(Date anoDePublicacao) {
        this.anoDePublicacao = anoDePublicacao;
    }

    public String getEditora() {
        return editora;
    }

    public void setEditora(String editora) {
        this.editora = editora;
    }

    public void imprimirDadosDoLivro(){
        System.out.println(  "Livro{" +
                "titulo='" + titulo + '\'' +
                ", autor='" + autor + '\'' +
                ", paginas=" + paginas +
                ", preco=" + preco +
                ", numeroDaEdicao=" + numeroDaEdicao +
                ", emprestado=" + emprestado +
                ", anoDePublicacao=" + anoDePublicacao +
                '}' );
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
                ", anoDePublicacao=" + anoDePublicacao +
                '}';
    }

    public double precoComDesconto(int indiceDoUsuario){
        if (indiceDoUsuario == 1){
            return preco-(preco * 0.3);
        } else if (indiceDoUsuario == 2) {
            return preco-(preco * 0.2);
        }else
            return this.preco;
    }

    public double precoComDescontoNaSorte(){
        return preco-(preco * Math.random());
    }

    public void chamarMetodosDeAcesso( int indiceDoMetodo ){
        switch (indiceDoMetodo){
            case 1: getAutor() ;
                break;
            case 2: getTitulo() ;
                break;
            case 3: getNumeroDaEdicao() ;
                break;
            case 4: getPreco() ;
                break;
            case 5: getPaginas();
                break;
            case 6: getEmprestado() ;
                break;
            case 7: getAnoDePublicacao();
                break;
            case 8: getEditora() ;
                break;
            default: System.out.println("Operação inexistente");
        }
    }

    /*public void chamarMetodosDeAcesso(int indiceDoMetodo){
        if (indiceDoMetodo == 1){
            getAutor();
        }else if (indiceDoMetodo == 2){
            getTitulo();
        }else if (indiceDoMetodo == 3){
           getNumeroDaEdicao();
        }else if (indiceDoMetodo == 4){
            getPreco();
        }else if (indiceDoMetodo == 5){
            getPaginas();
        }else if (indiceDoMetodo == 6){
            getPaginas();
        }else if (indiceDoMetodo == 7){
            getAnoDePublicacao();
        }else if (indiceDoMetodo == 8){
            getEditora();
        }else {
            System.out.println("Operação inexistente");
        }


    }*/

    public void chamarModificadores( int indiceDoMetodo ) throws ParseException {
        switch (indiceDoMetodo){
            case 1: setAutor( JOptionPane.showInputDialog("Digite o nome do autor.") );
                break;
            case 2: setTitulo(JOptionPane.showInputDialog("Digite o nome do titulo.") ) ;
                break;
            case 3: setNumeroDaEdicao((Integer.parseInt(JOptionPane.showInputDialog("Digite o numero da edição.")) ));
                break;
            case 4: setPreco(Double.parseDouble(JOptionPane.showInputDialog("Digite o valor do preço.")) ) ;
                break;
            case 5: setPaginas(Integer.parseInt(JOptionPane.showInputDialog("Digite o numero de paginas.")) );
                break;
            case 6: setEmprestado() ;
                break;
            case 7:
                String retorno = JOptionPane.showInputDialog("Digite o ano de publicação.");
                Date date = new SimpleDateFormat("dd/MM/yyyy").parse(retorno);

                setAnoDePublicacao(date);
                break;
            case 8: setEditora(JOptionPane.showInputDialog("Digite o nome da editora.") ) ;

                break;
            default: System.out.println("Operação inexistente");
        }
    }

    /*public void chamarModificadores(int indiceDoMetodo){
        if (indiceDoMetodo == 1){
            getAutor();
        }else if (indiceDoMetodo == 2){
            getTitulo(JOptionPane.showMessageDialog("Digite o nome do autor.") ));
        }else if (indiceDoMetodo == 3){
           getNumeroDaEdicao(JOptionPane.showMessageDialog("Digite o nome do autor.") ));
        }else if (indiceDoMetodo == 4){
            getPreco(JOptionPane.showMessageDialog("Digite o nome do autor.") ));
        }else if (indiceDoMetodo == 5){
            getPaginas(JOptionPane.showMessageDialog("Digite o nome do autor.") ));
        }else if (indiceDoMetodo == 6){
            getPaginas(JOptionPane.showMessageDialog("Digite o nome do autor.") ));
        }else if (indiceDoMetodo == 7){
            getAnoDePublicacao(JOptionPane.showMessageDialog("Digite o nome do autor.") ));
        }else if (indiceDoMetodo == 8){
            getEditora(JOptionPane.showMessageDialog("Digite o nome do autor.") ));
        }else {
            System.out.println("Operação inexistente");
        }*/


}


