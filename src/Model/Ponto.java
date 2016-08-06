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
 * metodo para criar um ponto
 * @param idJogo id do jogo ao qual o ponto pertence
 * @param set set em que o ponto pertence
 * @param numPonto numero do ponto
 * @param idPessoa id da pessoa que pontuou
 * @param tipo tipo do ponto
 * @param idEquipe  id da equipe que pontuou
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
     * metodo para obter o id do jogo
     * @return retorna o id da partida
     */
    public int getIdJogo() {
        return idJogo;
    }

    /**
     * metodo para definir o id do jogo 
     * @param idJogo id do jogo
     */
    public void setIdJogo(int idJogo) {
        this.idJogo = idJogo;
    }

     /**
      * metodo para obter o set
      * @return retorna o set da partida
      */
    public int getSet() {
        return set;
    }

    /**
     * metodo para definir o set
     * @param set set
     */
    public void setSet(int set) {
        this.set = set;
    }

    /**
     * metodo para obter o id da pessoa
     * @return retorna o id do jogador que pontuou
     */
    public int getIdPessoa() {
        return idPessoa;
    }

    /**
     * metodo para definir o id da pessoa
     * @param idPessoa id da pessoa
     */
    public void setIdPessoa(int idPessoa) {
        this.idPessoa = idPessoa;
    }

    /**
     * metodo para obter a descricao do ponto
     * @return retorna a descrição do ponto
     */
    public String getDescPonto() {
        return descPonto;
    }

    /**
     * metodo para definir a descricao do ponto
     * @param Tipo descricao do ponto
     */
    public void setDescPonto(String Tipo) {
        this.descPonto = Tipo;
    }

    /**
     * metodo para obter o id dda equipe
     * @return retorna o Id da equipe que pontuou
     */
    public int getIdEquipe() {
        return idEquipe;
    }

    /**
     * metodo para definir o id da equipe
     * @param idEquipe id equipe
     */
    public void setIdEquipe(int idEquipe) {
        this.idEquipe = idEquipe;
    }

    /**
     * metodo para obter o numero do ponto
     * @return retorna o numero do ponto
     */
    public int getNumPonto() {
        return numPonto;
    }

    /**
     *metodo para definir o numero do ponto 
     * @param numPonto numero do ponto
     */
    public void setNumPonto(int numPonto) {
        this.numPonto = numPonto;
    } 
}
