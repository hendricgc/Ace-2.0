package Model;

import java.util.ArrayList;
import java.util.List;

public class Set {

    private int pontosTimeMandante;
    private int pontosTimeVisitante;
    private int idSet;
    private boolean finalizado;
    
    private List<Ponto> informacoesPonto;
    
    public Set(int pontos_time_1,int Pontos_time_2, int id_set){
        informacoesPonto = new ArrayList<>();
        this.pontosTimeMandante = pontos_time_1;
        this.pontosTimeVisitante = Pontos_time_2;
        this.finalizado = true;
    }
    

    public int getPontosTimeMandante() {
        return pontosTimeMandante;
    }

    public void setPontosTimeMandante(int pontosTimeMandante) {
        this.pontosTimeMandante = pontosTimeMandante;
    }

    public int getPontosTimeVisitante() {
        return pontosTimeVisitante;
    }

    public void setPontosTimeVisitante(int pontosTimeVisitante) {
        this.pontosTimeVisitante = pontosTimeVisitante;
    }

    public int getIdSet() {
        return idSet;
    }

    public void setIdSet(int idSet) {
        this.idSet = idSet;
    }

    public boolean isFinalizado() {
        return finalizado;
    }

    public void setFinalizado(boolean finalizado) {
        this.finalizado = finalizado;
    }

    public List<Ponto> getInformacoesPonto() {
        return informacoesPonto;
    }

    public void setInformacoesPonto(List<Ponto> informacoesPonto) {
        this.informacoesPonto = informacoesPonto;
    }

    @Override
    public String toString() {
        return pontosTimeMandante + " x " + pontosTimeVisitante + " - " + (isFinalizado() ? "Finalizado" : "Em andamento");
    }

    

}
