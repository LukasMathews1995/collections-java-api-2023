package Contato;

import java.util.HashMap;
import java.util.Map;

public class AgendaContatosMap {
    private Map<String,Integer> agendaContatoMap;

    public AgendaContatosMap() {
        agendaContatoMap = new HashMap<>();
    }
    public void adicionaContato(String nome, Integer telefone) {
        agendaContatoMap.put(nome,telefone);
    }
    public void removerContato(String nome) {
        if(!agendaContatoMap.isEmpty()){
        agendaContatoMap.remove(nome);}
    }
    public void exibirContatos() {
        System.out.println(agendaContatoMap);
    }
    public Integer pequisarPorNome(String nome) {
        Integer numeroPorNome= null;

        if(!agendaContatoMap.isEmpty()){
         numeroPorNome = agendaContatoMap.get(nome);
    }
        return numeroPorNome;
}
}
