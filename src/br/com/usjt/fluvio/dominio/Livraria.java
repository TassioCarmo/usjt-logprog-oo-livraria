package br.com.usjt.fluvio.dominio;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import java.util.*;

public class Livraria {
    // atributo
    private ArrayList<Livro> acervo;
    // construtor padrão
    public Livraria( )
    {
        acervo = new ArrayList<Livro>( );
    }
    /* Este método recebe, por parâmetros, os dados do livro, instancia um objeto
        livro e o armazena no ArrayList acervo */
    public void cadastrarLivro (String titulo, String autor, int paginas, double preco, int numeroDaEdicao, Date anoDePublicacao, String editora) {

        Livro livro = new Livro( autor, titulo, paginas,
                preco, numeroDaEdicao, anoDePublicacao, editora );
        acervo.add( livro );
    }
    /* Este método exibe um inventário, ou seja, todos os livros cadastrados no
    acervo da biblioteca. */
    public void exibirAcervo( )
    {
        Livro livro;
        String texto = "****** Livros do Acervo ******\n\n";
        for( int indice = 0; indice < acervo.size( ); indice++ )
        {
            livro = acervo.get( indice );
            texto += ""+ (indice + 1) + ") " + livro.dadosDoLivro( ) + "\n\n";
        }
        JOptionPane.showMessageDialog( null, texto, "Inventário", 1);
    }
    public int quantidadeDeLivros( ){
        return acervo.size();
    }
    public double valorDoAcervo( ){
        Livro livro;
        double valor = 0;
        int indice = 0;
        while(indice < acervo.size( )){
            livro = acervo.get( indice );
            valor +=livro.getPreco();
            indice++;
        }
        return valor;
    }
    public void removerLivro( int indice ) {

        if (indice <= acervo.size()) {
            acervo.remove(indice);
        } else
            System.out.println("Erro posi��o inexistente ou valor negativo");

    }

    public void removerLivro( String titulo ) {

        int posicao = 0;
        while(posicao < acervo.size())
        {
            if(titulo.equals(acervo.get(posicao).getTitulo())){
                acervo.remove(posicao);
            }

            posicao++;
        }

        Livro livro = new Livro();
        Usuario usuario = new Usuario();

        livro.imprimirDadosDoLivro();
        System.out.println("----------------------------------");
        usuario.toString();


    }
}
