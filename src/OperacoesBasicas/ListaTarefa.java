package OperacoesBasicas;

import java.util.ArrayList;
import java.util.List;

public class ListaTarefa {
    private List<Tarefa> tarefaList;

    public ListaTarefa() {
        this.tarefaList = new ArrayList<>();
    }
    public void adicionarTarefa(String descricao) {
        this.tarefaList.add(new Tarefa(descricao));
    }
       public void RemoverTarefa(String descricao) {
        List<Tarefa> listaParaRemover = new ArrayList<>();
        for(Tarefa t : tarefaList){
            if(t.getDescricao().equalsIgnoreCase(descricao)){
                listaParaRemover.add(t);
            }
       }


        tarefaList.removeAll(listaParaRemover);
        }
        public int ObterTarefaNumero() {
       return tarefaList.size();
        }
        public void ObterDescricao() {
        for(Tarefa t : tarefaList) {
            System.out.println(t.getDescricao());
        }
        }

}
