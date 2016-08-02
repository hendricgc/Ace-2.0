package Model;

public class Ponto {

    private int idJogo;
    private int set;
    private int numPonto;
    private int idPessoa;
    private int idEquipe;
    private String descPonto;


    public Ponto(int idJogo, int set, int numPonto, int idPessoa, String tipo, int idEquipe) {
        this.idJogo = idJogo;
        this.set = set;
        this.idPessoa = idPessoa;
        this.descPonto = tipo;
        this.idEquipe = idEquipe;
        this.numPonto = numPonto;
    }
    
    public Ponto() {}

    public int getIdJogo() {
        return idJogo;
    }

    public void setIdJogo(int idJogo) {
        this.idJogo = idJogo;
    }

    public int getSet() {
        return set;
    }

    public void setSet(int set) {
        this.set = set;
    }

    public int getIdPessoa() {
        return idPessoa;
    }

    public void setIdPessoa(int idPessoa) {
        this.idPessoa = idPessoa;
    }

    public String getDescPonto() {
        return descPonto;
    }

    public void setDescPonto(String Tipo) {
        this.descPonto = Tipo;
    }

    public int getIdEquipe() {
        return idEquipe;
    }

    public void setIdEquipe(int idEquipe) {
        this.idEquipe = idEquipe;
    }

    public int getNumPonto() {
        return numPonto;
    }

    public void setNumPonto(int numPonto) {
        this.numPonto = numPonto;
    } 
}
