package OperacoesBasicas;

import org.w3c.dom.ls.LSOutput;

import java.util.ArrayList;
import java.util.List;

public class CarrinhoDeCompras {

   private List<Item> listaItens ;

    public CarrinhoDeCompras() {
        this.listaItens = new ArrayList<>();
    }
    public void adicionarItem(String nome, double preco, int quantidade) {
        listaItens.add(new Item(nome, preco, quantidade));
    }
    public void removerItem(String nome) {
        List<Item> listaRemover = new ArrayList<>();
        for(Item i : listaItens) {
            if(i.getNome().equalsIgnoreCase(nome)) {
                listaRemover.add(i);
            }
           listaItens.remove(listaRemover);
        }

    }
    public double calcularTotal(){
        double total = 0;
        for(Item i : listaItens) {
            total = i.getQuantidade() * i.getPreco();
        }

  return total;  }

    public void exibirItens(){
        for(Item i : listaItens) {
            System.out.printf("nome : %s\nquantidade : %d\npreço de cada : %.2f\n", i.getNome(), i.getQuantidade(),i.getPreco());
        }
    }
}
