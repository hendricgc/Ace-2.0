package Model;
import java.util.ArrayList;
import java.util.List;
/**
 * 
 * @author  Hendric, Murillo
 */
public class Set {

    private int pontosTimeMandante;
    private int pontosTimeVisitante;
    private int idSet;
    private boolean finalizado;
    
    private List<Ponto> informacoesPonto;
    
    /**
     * metodo para criar um set
     * @param pontos_time_1 pontos do time mandante
     * @param Pontos_time_2 pontos do time visitante
     * @param id_set id do set
     */
    public Set(int pontos_time_1,int Pontos_time_2, int id_set){
        informacoesPonto = new ArrayList<>();
        this.pontosTimeMandante = pontos_time_1;
        this.pontosTimeVisitante = Pontos_time_2;
        this.finalizado = true;
    }
    
    /**
     * metodo para obter os pontos do time mandante
     * @return retorna o numero de pontos do time mandante
     */
    public int getPontosTimeMandante() {
        return pontosTimeMandante;
    }

    /**
     * metodo para definir os pontos do time mandante
     * @param pontosTimeMandante pontos do time mandante
     */
    public void setPontosTimeMandante(int pontosTimeMandante) {
        this.pontosTimeMandante = pontosTimeMandante;
    }

    /**
     * metodo prada obter os pontos do time visitante
     * @return retorna o numero de pontos do time visitante
     */
    public int getPontosTimeVisitante() {
        return pontosTimeVisitante;
    }

    /**
     * metodo para definir os pontos do time visitante
     * @param pontosTimeVisitante pontos do time visitante
     */
    public void setPontosTimeVisitante(int pontosTimeVisitante) {
        this.pontosTimeVisitante = pontosTimeVisitante;
    }
    

    /**
     * metodo para obter o id do set
     * @return retorna o id do set
     */
    public int getIdSet() {
        return idSet;
    }

    /**
     * metodo para definir o id do set
     * @param idSet id do set
     */
    public void setIdSet(int idSet) {
        this.idSet = idSet;
    }

    /**
     * metodo para obter se o set ja acabou ou ainda esta acontecendo
     * @return retorna true se o set ja acabou
     */
    public boolean isFinalizado() {
        return finalizado;
    }

    /**
     * metodo para definir que o set foi finalizado
     * @param finalizado finalizado
     */
    public void setFinalizado(boolean finalizado) {
        this.finalizado = finalizado;
    }

    /**
     * metodo para obter as informações do ponto
     * @return retorna uma lista com as informações do ponto
     */
    public List<Ponto> getInformacoesPonto() {
        return informacoesPonto;
    }

    /**
     * metodo para definir as informações od ponto
     * @param informacoesPonto descriçao do ponto
     */
    public void setInformacoesPonto(List<Ponto> informacoesPonto) {
        this.informacoesPonto = informacoesPonto;
    }

    /**
     * metodo para conversao para string
     * @return metodo toString
     */
    @Override
    public String toString() {
        return pontosTimeMandante + " x " + pontosTimeVisitante + " - " + (isFinalizado() ? "Finalizado" : "Em andamento");
    }

    

}
