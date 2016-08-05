package Model;
/**
 * 
 * @author  Hendric, Murillo
 */
public class Ponto {

    private int idJogo;
    private int set;
    private int numPonto;
    private int idPessoa;
    private int idEquipe;
    private String descPonto;

/**
 * 
 * @param idJogo
 * @param set
 * @param numPonto
 * @param idPessoa
 * @param tipo
 * @param idEquipe 
 */
    public Ponto(int idJogo, int set, int numPonto, int idPessoa, String tipo, int idEquipe) {
        this.idJogo = idJogo;
        this.set = set;
        this.idPessoa = idPessoa;
        this.descPonto = tipo;
        this.idEquipe = idEquipe;
        this.numPonto = numPonto;
    }

    public Ponto() {}

    /**
     * 
     * @return retorna o id da partida
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
      * @return retorna o set da partida
      */
    public int getSet() {
        return set;
    }

    /**
     * 
     * @param set 
     */
    public void setSet(int set) {
        this.set = set;
    }

    /**
     * 
     * @return retorna o id do jogador que pontuou
     */
    public int getIdPessoa() {
        return idPessoa;
    }

    /**
     * 
     * @param idPessoa 
     */
    public void setIdPessoa(int idPessoa) {
        this.idPessoa = idPessoa;
    }

    /**
     * 
     * @return retorna a descrição do ponto
     */
    public String getDescPonto() {
        return descPonto;
    }

    /**
     * 
     * @param Tipo 
     */
    public void setDescPonto(String Tipo) {
        this.descPonto = Tipo;
    }

    /**
     * 
     * @return retorna o Id da equipe que pontuou
     */
    public int getIdEquipe() {
        return idEquipe;
    }

    /**
     * 
     * @param idEquipe 
     */
    public void setIdEquipe(int idEquipe) {
        this.idEquipe = idEquipe;
    }

    /**
     * 
     * @return retorna o numero do ponto
     */
    public int getNumPonto() {
        return numPonto;
    }

    /**
     * 
     * @param numPonto 
     */
    public void setNumPonto(int numPonto) {
        this.numPonto = numPonto;
    } 
}
