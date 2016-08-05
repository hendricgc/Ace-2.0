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
     * 
     * @param pontos_time_1
     * @param Pontos_time_2
     * @param id_set 
     */
    public Set(int pontos_time_1,int Pontos_time_2, int id_set){
        informacoesPonto = new ArrayList<>();
        this.pontosTimeMandante = pontos_time_1;
        this.pontosTimeVisitante = Pontos_time_2;
        this.finalizado = true;
    }
    
    /**
     * 
     * @return retorna o numero de pontos do time mandante
     */
    public int getPontosTimeMandante() {
        return pontosTimeMandante;
    }

    /**
     * 
     * @param pontosTimeMandante 
     */
    public void setPontosTimeMandante(int pontosTimeMandante) {
        this.pontosTimeMandante = pontosTimeMandante;
    }

    /**
     * 
     * @return retorna o numero de pontos do time visitante
     */
    public int getPontosTimeVisitante() {
        return pontosTimeVisitante;
    }

    /**
     * 
     * @param pontosTimeVisitante 
     */
    public void setPontosTimeVisitante(int pontosTimeVisitante) {
        this.pontosTimeVisitante = pontosTimeVisitante;
    }
    

    /**
     * 
     * @return retorna o id do set
     */
    public int getIdSet() {
        return idSet;
    }

    /**
     * 
     * @param idSet 
     */
    public void setIdSet(int idSet) {
        this.idSet = idSet;
    }

    /**
     * 
     * @return retorna true se o set ja acabou
     */
    public boolean isFinalizado() {
        return finalizado;
    }

    /**
     * 
     * @param finalizado 
     */
    public void setFinalizado(boolean finalizado) {
        this.finalizado = finalizado;
    }

    /**
     * 
     * @return retorna uma lista com as informações do ponto
     */
    public List<Ponto> getInformacoesPonto() {
        return informacoesPonto;
    }

    /**
     * 
     * @param informacoesPonto 
     */
    public void setInformacoesPonto(List<Ponto> informacoesPonto) {
        this.informacoesPonto = informacoesPonto;
    }

    /**
     * 
     * @return metodo toString
     */
    @Override
    public String toString() {
        return pontosTimeMandante + " x " + pontosTimeVisitante + " - " + (isFinalizado() ? "Finalizado" : "Em andamento");
    }

    

}
