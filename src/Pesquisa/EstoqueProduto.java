package Pesquisa;

import org.w3c.dom.ls.LSOutput;

import java.util.HashMap;
import java.util.Map;

public class EstoqueProduto {
    private Map<Long,Produto> produtoMap;

    public EstoqueProduto() {
        this.produtoMap = new HashMap<>();
    }
    public void adicionarProduto(long codigo,String nome, int quantidade,double preco) {
        produtoMap.put(codigo,new Produto(nome,preco,quantidade));
    }
    public void exibirProduto() {
        System.out.println(produtoMap);
    }
    public double calcularValorTotalDoEstoque() {
       double valorTotal = 0;
        if(!produtoMap.isEmpty()) {
        for(Produto produto : produtoMap.values()) {

         valorTotal += produto.getQuantidade()*produto.getPreco();;
    }
        }

        return valorTotal;
    }
    public Produto produtoMaisCaro(){
        Produto produtoMaisCaro = null;
        double maiorPreco  = Double.MIN_VALUE ;
        if(!produtoMap.isEmpty()) {
        for(Produto produto : produtoMap.values()) {
        if( produto.getPreco()>maiorPreco) {
            maiorPreco = produto.getPreco();
            produtoMaisCaro= produto;
        }
        }
    }
    return produtoMaisCaro;}
}
