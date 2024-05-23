import Contato.AgendaContato;
import Convidado.ConjuntoConvidado;
import Livro.CatalogoLivros;
import Ordenacao.CadastroProduto;
import Ordenacao.OrdenacaoPessoa;

public class Main {
    public static void main (String[]args) {
        CadastroProduto cadastroProduto = new CadastroProduto();
        cadastroProduto.adicionarProduto(1L, "Produto 5",15d,5);
        cadastroProduto.adicionarProduto(2L, "Produto 0",20d,10);
        cadastroProduto.adicionarProduto(1L, "Produto 3",10d,2);
        cadastroProduto.adicionarProduto(9L, "Produto 9",2d,2);
        cadastroProduto.exibirProdutos();
        System.out.println(cadastroProduto.exibirProdutosPorNome());
        System.out.println(cadastroProduto.exibirProdutosPorPreco());

    }
}