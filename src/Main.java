import Convidado.ConjuntoConvidado;
import Livro.CatalogoLivros;
import Ordenacao.OrdenacaoPessoa;

public class Main {
    public static void main (String[]args) {
        ConjuntoConvidado conjuntoConvidados = new ConjuntoConvidado();


        System.out.println("Existem " + conjuntoConvidados.contarConvidados() + " convidado(s) dentro do Set de Convidados");

        // Adicionando convidados ao conjunto
        conjuntoConvidados.addConvidado("Alice", 1234);
        conjuntoConvidados.addConvidado("Bob", 1235);
        conjuntoConvidados.addConvidado("Charlie", 1235);
        conjuntoConvidados.addConvidado("David", 1236);


        System.out.println("Convidados no conjunto:");
        conjuntoConvidados.exibirConvidados();


        System.out.println("Existem " + conjuntoConvidados.contarConvidados() + " convidado(s) dentro do Set de Convidados");


        conjuntoConvidados.removerConvidadoPorCodigoDoConvite(1236);
        System.out.println("Existem " + conjuntoConvidados.contarConvidados() + " convidado(s) dentro do Set de Convidados após a remoção");


        System.out.println("Convidados no conjunto após a remoção:");
        conjuntoConvidados.exibirConvidados();


    }
}