package Model;

public class Ponto {

    private int idJogo;

    private int idSet;

    private int idPessoa;

    private int tipo;

    private int idTimeContra;

    public Ponto(int idJogo, int idSet, int idPessoa, int tipo, int idTimeContra) {
        this.idJogo = idJogo;
        this.idSet = idSet;
        this.idPessoa = idPessoa;
        this.tipo = tipo;
        this.idTimeContra = idTimeContra;
    }

   public int getIdJogo() {
        return idJogo;
    }

    public void setIdJogo(int idJogo) {
        this.idJogo = idJogo;
    }

    public int getIdSet() {
        return idSet;
    }

    public void setIdSet(int idSet) {
        this.idSet = idSet;
    }

    public int getIdPessoa() {
        return idPessoa;
    }

    public void setIdPessoa(int idPessoa) {
        this.idPessoa = idPessoa;
    }

    public int getTipo() {
        return tipo;
    }

    public void setTipo(int Tipo) {
        this.tipo = Tipo;
    }

    public int getIdTimeContra() {
        return idTimeContra;
    }

    public void setIdTimeContra(int idTimeContra) {
        this.idTimeContra = idTimeContra;
    }

}
