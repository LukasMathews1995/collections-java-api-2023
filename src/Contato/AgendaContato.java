package Contato;

import java.util.HashSet;
import java.util.Set;

public class AgendaContato {
    Set<Contato> contatosSet;

    public AgendaContato() {
        this.contatosSet = new HashSet<>();
    }

    public void adicionarContato(String nome , int numero) {
        this.contatosSet.add(new Contato(nome,numero));
    }
    public void exibirContatos() {
        System.out.println(contatosSet);
    }
    public Set<Contato> pesquisarPorNome(String nome) {
        Set<Contato> contatosPesquisa = new HashSet<>();
        for (Contato c : this.contatosSet) {
            if (c.getNome().startsWith(nome)) {
                contatosPesquisa.add(c);
            }

        }
    return contatosPesquisa;}

    public Contato atualizarContatos(String nome , int novoNumero) {
        Contato contatoAtualizado = null;
        for (Contato c : this.contatosSet) {
            if (c.getNome().equalsIgnoreCase(nome)) {
                c.setNumero(novoNumero);
                contatoAtualizado = c;
                break;
            }

        }

    return contatoAtualizado;}
}
