import Livro.CatalogoLivros;
import Ordenacao.OrdenacaoPessoa;

public class Main {
    public static void main (String[]args) {
        OrdenacaoPessoa pessoa = new OrdenacaoPessoa();
        pessoa.adicionarPessoa("Nome 1",19,1.95);
        pessoa.adicionarPessoa("Nome 2",50,1.95);
        pessoa.adicionarPessoa("Nome 3",11,1.97);
        System.out.println(pessoa.ordenarPorAltura());
        System.out.println(pessoa.ordenarPorIdade());
    }
}