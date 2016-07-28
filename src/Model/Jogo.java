package Model;

import java.util.ArrayList;
import java.util.List;

public class Jogo {
   
    private int idJogo;
    private int idCampeonato;
    private Equipe timeMandante;
    private Equipe timeVisitante;
    private ArrayList<Set> sets;
    private int placarMandante;
    private int placarVisitante;

    public Jogo(int id_jogo, Equipe Time_1, Equipe Time_2, int id_campeonato){
        sets = new ArrayList<>();
        this.idJogo = id_jogo;
        this.timeMandante = Time_1;
        this.timeVisitante = Time_2;
        this.idCampeonato = id_campeonato;
    }
    
    public int getIdJogo() {
        return idJogo;
    }

    public void setIdJogo(int idJogo) {
        this.idJogo = idJogo;
    }

    public Equipe getTimeMandante() {
        return timeMandante;
    }

    public void setTimeMandante(Equipe timeMandante) {
        this.timeMandante = timeMandante;
    }

    public Equipe getTimeVisitante() {
        return timeVisitante;
    }

    public void setTimeVisitante(Equipe timeVisitante) {
        this.timeVisitante = timeVisitante;
    }

    public int getIdCampeonato() {
        return idCampeonato;
    }

    public void setIdCampeonato(int idCampeonato) {
        this.idCampeonato = idCampeonato;
    }

    public List<Set> getSets() {
        return sets;
    }

    public void setSets(ArrayList<Set> sets) {
        this.sets = sets;
    }

    public int getPlacarMandante() {
        return placarMandante;
    }

    public void setPlacarMandante(int placarMandante) {
        this.placarMandante = placarMandante;
    }

    public int getPlacarVisitante() {
        return placarVisitante;
    }

    public void setPlacarVisitante(int placarVisitante) {
        this.placarVisitante = placarVisitante;
    }
        
    public String getResultado(){
        if(this.sets.isEmpty())
            return "Jogo não iniciado";
        for(int i = 0; i < this.sets.size(); i++){
            if((this.sets.get(i).getPontosTimeMandante() > this.sets.get(i).getPontosTimeVisitante()) && this.sets.get(i).isFinalizado())
                placarMandante++;
            else if(this.sets.get(i).getPontosTimeMandante() < this.sets.get(i).getPontosTimeVisitante() && this.sets.get(i).isFinalizado())
                placarVisitante++;
        }
        return placarMandante + " x " + placarVisitante;        
    }

    @Override
    public String toString() {
        return String.format("%d       - %d             - %s %30s %39s", idJogo, idCampeonato, timeMandante.getNome(), timeVisitante.getNome(), getResultado());
    }
    
}
