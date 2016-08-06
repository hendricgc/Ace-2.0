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
     * metodo para criar um jogo
     * @param id_jogo id do jogo
     * @param Time_1 time mandante
     * @param Time_2 time visitante
     * @param id_campeonato  id do campeonato
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
     * metodo para obter o ide de um jogo
     * @return retorna o id do jogo
     */
    public int getIdJogo() {
        return idJogo;
    }

    /**
     * metodo para definir o id de um jogo
     * @param idJogo id do jogo
     */
    public void setIdJogo(int idJogo) {
        this.idJogo = idJogo;
    }

    /**
     * metodo para obter o time mandante
     * @return retorna o time mandante da partida
     */
    public Equipe getTimeMandante() {
        return timeMandante;
    }

    /**
     * metodo para definir o time mandante
     * @param timeMandante  time mandante
     */
    public void setTimeMandante(Equipe timeMandante) {
        this.timeMandante = timeMandante;
    }

    /**
     * metodo para obter o time visitante
     * @return retorna o time visitante da partida
     */
    public Equipe getTimeVisitante() {
        return timeVisitante;
    }

    /**
     * metood para definir o time visitante
     * @param timeVisitante  time visitante
     */
    public void setTimeVisitante(Equipe timeVisitante) {
        this.timeVisitante = timeVisitante;
    }

    /**
     * metodo para obter o id de um campeonato
     * @return retorna o id do campeonato
     */
    public int getIdCampeonato() {
        return idCampeonato;
    }

    /**
     * metodo para definir o id de um campeonato
     * @param idCampeonato id de um campeonato
     */
    public void setIdCampeonato(int idCampeonato) {
        this.idCampeonato = idCampeonato;
    }

    /**
     * metodo para obter a lisa de sets do jogo
     * @return retorna uma lista com os sets da partida
     */
    public List<Set> getSets() {
        return sets;
    }

    /**
     * metodo para definir o set de um jogo
     * @param sets set do jogo
     */
    public void setSets(ArrayList<Set> sets) {
        this.sets = sets;
    }

    /**
     * metodo para obter o placar do time mandante
     * @return retorna a pontuação do time mandante
     */
    public int getPlacarMandante() {
        return placarMandante;
    }

    /**
     * metodo para definir o placar do time mandante
     * @param placarMandante pontuaçao do time mandante
     */
    public void setPlacarMandante(int placarMandante) {
        this.placarMandante = placarMandante;
    }

    /**
     * metdo para obter o placar do time visitante
     * @return retorna o placar do time visitante
     */
    public int getPlacarVisitante() {
        return placarVisitante;
    }

    /**
     * metodo para definir o placar do time visitante
     * @param placarVisitante pontuaçao do time visitante
     */
    public void setPlacarVisitante(int placarVisitante) {
        this.placarVisitante = placarVisitante;
    }
   
    /**
     * metodo para obte ro resutado do jogo
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
     * metodo para conversao para string
     * @return metodo toString
     */
    @Override
    public String toString() {
        return String.format("%d       - %d             - %s %30s %39s", idJogo, idCampeonato, timeMandante.getNome(), timeVisitante.getNome(), getResultado());
    }
    
}
