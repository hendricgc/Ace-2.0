package Model;


import java.util.Date;

public abstract class Pessoa {

    private int idPessoa;

    private String Nome;

    private Date dataNasc;

    private String RG;

    private String CPF;
    
    public Pessoa(){}
    
    public Pessoa(String Nome, Date Data_nasc, String RG, String CPF){
        this.RG = RG;
        this.CPF = CPF;
        this.Nome = Nome;
        this.dataNasc = Data_nasc;
    }
    
    public int getIdPessoa() {
        return idPessoa;
    }

    public void setIdPessoa(int idPessoa) {
        this.idPessoa = idPessoa;
    }

    public String getNome() {
        return Nome;
    }

    public void setNome(String Nome) {
        this.Nome = Nome;
    }

    public Date getDataNasc() {
        return dataNasc;
    }

    public void setDataNasc(Date dataNasc) {
        this.dataNasc = dataNasc;
    }

    public String getRG() {
        return RG;
    }

    public void setRG(String RG) {
        this.RG = RG;
    }

    public String getCPF() {
        return CPF;
    }

    public void setCPF(String CPF) {
        this.CPF = CPF;
    }
}
