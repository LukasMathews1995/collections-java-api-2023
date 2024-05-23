import Ordenacao.Eventos.AgendaEventos;
import Pesquisa.EstoqueProduto;

import java.time.LocalDate;
import java.time.Month;

public class Main {
    public static void main (String[]args) {

        AgendaEventos eventos = new AgendaEventos();
        eventos.adicionarEvento(LocalDate.of(1995,8,7),"Nascimento", "Eu");
        eventos.adicionarEvento(LocalDate.of(2003,2,8),"Nascimento Irma", "Mariana");
        eventos.adicionarEvento(LocalDate.of(2022, Month.APRIL,17),"Evento 3 ", "50 cent");
        eventos.adicionarEvento(LocalDate.of(2024,Month.JUNE,1),"VR pagode","Dilsinho");
        eventos.adicionarEvento(LocalDate.of(2024,Month.JUNE,3),"VR pagode","Dilsinho e Ferrugem");
        eventos.exibirAgenda();
        eventos.obterProximoEvento();
    }
}