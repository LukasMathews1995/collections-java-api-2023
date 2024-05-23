package Ordenacao.Eventos;

import java.time.LocalDate;
import java.util.*;

public class AgendaEventos {

    Map<LocalDate,Eventos> eventosMap;


    public AgendaEventos() {
        this.eventosMap = new HashMap<>();
    }

    public void adicionarEvento(LocalDate data, String nomeEvento,String atracao) {
    eventosMap.put(data,new Eventos(nomeEvento,atracao));

    }
    public void exibirAgenda(){
       Map<LocalDate,Eventos> eventosTreeMap = new TreeMap<>(eventosMap);
        System.out.println(eventosTreeMap);
    }
    public void obterProximoEvento(){
        LocalDate data = LocalDate.now();
        Map<LocalDate,Eventos> eventosTreeMap = new TreeMap<>(eventosMap);
      for(Map.Entry<LocalDate,Eventos> entry : eventosTreeMap.entrySet()){
          if(entry.getKey().isEqual(data)||entry.getKey().isAfter(data)){
              System.out.println("O proximo evento " + entry.getValue() + " é " + entry.getKey());
              break;

          }

      }

    }
}
