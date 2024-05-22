package Convidado;

import java.util.HashSet;
import java.util.Set;

public class ConjuntoConvidado {
    private Set<Convidado> convidadoSet;


    public ConjuntoConvidado() {
        this.convidadoSet = new HashSet<>();
    }
    public void addConvidado(String nome, int codigoConvite) {
        convidadoSet.add(new Convidado(nome, codigoConvite));
    }
    public void removerConvidadoPorCodigoDoConvite (int codigoConvite) {
        Convidado convidadoParaRemover = null;
        for (Convidado c  : convidadoSet) {
            if(c.getCodigoConvite() == codigoConvite) {
                convidadoParaRemover = c;
                break;
            }
            convidadoSet.remove(convidadoParaRemover);

        }
    }
    public int contarConvidados(){
        return convidadoSet.size();
    }
    public void exibirConvidados(){
        System.out.println(convidadoSet);
    }
}
