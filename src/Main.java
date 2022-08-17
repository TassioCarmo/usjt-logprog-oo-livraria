import br.com.usjt.fluvio.dominio.Emprestimo;
import br.com.usjt.fluvio.dominio.Livraria;
import br.com.usjt.fluvio.dominio.Livro;
import br.com.usjt.fluvio.dominio.Usuario;

public class Main {
    public static void main(String[] args) {

        Livraria livraria = new Livraria();

        /*ivraria.cadastrarLivro("Harry Poter","Dani", 700, 89.90, 99, 1994,"abril");
        livraria.cadastrarLivro("King","Dani", 800, 89.90, 99, 1894,"2k");
        livraria.cadastrarLivro("Ring","RR", 2700, 89.90, 99, 1794,"Boss");
        */
        livraria.exibirAcervo();

        //System.out.println(biblioteca.valorDoAcervo());
        System.out.println(livraria.quantidadeDeLivros());

        livraria.removerLivro("King");

        System.out.println(livraria.quantidadeDeLivros());


    }
}