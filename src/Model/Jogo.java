package Model;

import java.util.ArrayList;
import java.util.List;
/**
 * 
 * @author  Hendric, Murillo
 */
public class Jogo {
   
    private int idJogo;
    private int idCampeonato;
    private Equipe timeMandante;
    private Equipe timeVisitante;
    private ArrayList<Set> sets;
    private int placarMandante;
    private int placarVisitante;

    /**
     * 
     * @param id_jogo
     * @param Time_1
     * @param Time_2
     * @param id_campeonato 
     */
    public Jogo(int id_jogo, Equipe Time_1, Equipe Time_2, int id_campeonato){
        sets = new ArrayList<>();
        this.idJogo = id_jogo;
        this.timeMandante = Time_1;
        this.timeVisitante = Time_2;
        this.idCampeonato = id_campeonato;
    }

    public Jogo() {}
    
    /**
     * 
     * @return retorna o id do jogo
     */
    public int getIdJogo() {
        return idJogo;
    }

    /**
     * 
     * @param idJogo 
     */
    public void setIdJogo(int idJogo) {
        this.idJogo = idJogo;
    }

    /**
     * 
     * @return retorna o time mandante da partida
     */
    public Equipe getTimeMandante() {
        return timeMandante;
    }

    /**
     * 
     * @param timeMandante 
     */
    public void setTimeMandante(Equipe timeMandante) {
        this.timeMandante = timeMandante;
    }

    /**
     * 
     * @return retorna o time visitante da partida
     */
    public Equipe getTimeVisitante() {
        return timeVisitante;
    }

    /**
     * 
     * @param timeVisitante 
     */
    public void setTimeVisitante(Equipe timeVisitante) {
        this.timeVisitante = timeVisitante;
    }

    /**
     * 
     * @return retorna o id do campeonato
     */
    public int getIdCampeonato() {
        return idCampeonato;
    }

    /**
     * 
     * @param idCampeonato 
     */
    public void setIdCampeonato(int idCampeonato) {
        this.idCampeonato = idCampeonato;
    }

    /**
     * 
     * @return retorna uma lista com os sets da partida
     */
    public List<Set> getSets() {
        return sets;
    }

    /**
     * 
     * @param sets 
     */
    public void setSets(ArrayList<Set> sets) {
        this.sets = sets;
    }

    /**
     * 
     * @return retorna a pontuação do time mandante
     */
    public int getPlacarMandante() {
        return placarMandante;
    }

    /**
     * 
     * @param placarMandante 
     */
    public void setPlacarMandante(int placarMandante) {
        this.placarMandante = placarMandante;
    }

    /**
     * 
     * @return retorna o placar do time visitante
     */
    public int getPlacarVisitante() {
        return placarVisitante;
    }

    /**
     * 
     * @param placarVisitante 
     */
    public void setPlacarVisitante(int placarVisitante) {
        this.placarVisitante = placarVisitante;
    }
   
    /**
     * 
     * @return retorna o resultado final do jogo
     */
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

    /**
     * 
     * @return metodo toString
     */
    @Override
    public String toString() {
        return String.format("%d       - %d             - %s %30s %39s", idJogo, idCampeonato, timeMandante.getNome(), timeVisitante.getNome(), getResultado());
    }
    
}
