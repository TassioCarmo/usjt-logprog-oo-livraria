package br.com.usjt.fluvio.dominio;
import java.util.*;
import javax.swing.JOptionPane;

public class Emprestimo {
    // atributos: notar que o tipo destes atributos são classes
    private Livro livro;
    private Usuario usuario;
    private Date dataDoEmprestimo;
    private Date dataDeDevolucao;

    // construtor: note que os parâmetros são objetos
    public Emprestimo( Livro livro, Usuario usuario ,Date date)
    {
        this.livro = livro;
        this.usuario = usuario;
        this.dataDoEmprestimo = date;
    }

    public Livro getLivro() {
        return livro;
    }

    public void setLivro(Livro livro) {
        this.livro = livro;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    public Date getDataDoEmprestimo() {
        return dataDoEmprestimo;
    }

    public void setDataDoEmprestimo(Date dataDoEmprestimo) {
        this.dataDoEmprestimo = dataDoEmprestimo;
    }

    public Date getDataDeDevolucao() {
        return dataDeDevolucao;
    }

    public void setDataDeDevolucao(Date dataDeDevolucao) {
        this.dataDeDevolucao = dataDeDevolucao;
    }

    // método que imprime a nota de empréstimo
    public void imprimirNotaDeEmprestimo() {
        // texto que será mostrado pelo método showMessageDialog
        String texto = "***** Nota de Empréstimo *****\n\n\n" +
                "Usuário: " + usuario.getNome() +
                "\nNúmero de Matrícula: " + usuario.getNumeroDeMatricula() +
                "\nCPF: " + usuario.getCpf() +
                "\nLivro emprestado: " + livro.getTitulo() +
                "\nAutor: " + livro.getAutor() +
                "\nData do emprestimo" + dataDoEmprestimo;
        // atualiza o atributo 'emprestado' do objeto livro
        livro.setEmprestado();
        // mostra o String da variável local 'texto'
        JOptionPane.showMessageDialog( null, texto, "Empréstimo", 1 );
    }

    public void imprimirNotaDeDevolucao() {
        // texto que será mostrado pelo método showMessageDialog
        String texto = "***** Nota de Empréstimo *****\n\n\n" +
                "Usuário: " + usuario.getNome() +
                "\nNúmero de Matrícula: " + usuario.getNumeroDeMatricula() +
                "\nCPF: " + usuario.getCpf() +
                "\nLivro emprestado: " + livro.getTitulo() +
                "\nAutor: " + livro.getAutor() +
                "\nData do emprestimo" + dataDoEmprestimo +
                "\nData da devolução" + dataDeDevolucao;

        // mostra o String da variável local 'texto'
        JOptionPane.showMessageDialog( null, texto, "Devolução", 1 );
    }


}
