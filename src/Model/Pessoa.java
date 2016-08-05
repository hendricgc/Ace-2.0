package Model;


import java.util.Date;
/**
 * 
 * @author  Hendric, Murillo
 */
public abstract class Pessoa {

    private int idPessoa;

    private String Nome;

    private Date dataNasc;

    private String RG;

    private String CPF;
    
    public Pessoa(){}
    
    /**
     * 
     * @param Nome
     * @param Data_nasc
     * @param RG
     * @param CPF 
     */
    public Pessoa(String Nome, Date Data_nasc, String RG, String CPF){
        this.RG = RG;
        this.CPF = CPF;
        this.Nome = Nome;
        this.dataNasc = Data_nasc;
    }
    /**
     * 
     * @return retorna o id de uma pessoa
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
     * @return retorna o nome de uma pessoa
     */
    public String getNome() {
        return Nome;
    }

    /**
     * 
     * @param Nome 
     */
    public void setNome(String Nome) {
        this.Nome = Nome;
    }

    /**
     * 
     * @return retorna a data de nascimento de uma pessoa
     */
    public Date getDataNasc() {
        return dataNasc;
    }

    /**
     * 
     * @param dataNasc 
     */
    public void setDataNasc(Date dataNasc) {
        this.dataNasc = dataNasc;
    }

    /**
     * 
     * @return retorna o RG de uma pessoa
     */
    public String getRG() {
        return RG;
    }

    /**
     * 
     * @param RG 
     */
    public void setRG(String RG) {
        this.RG = RG;
    }
     /**
     * 
     * @return retorna o CPF de uma pessoa
     */
    public String getCPF() {
        return CPF;
    }

    /**
     * 
     * @param CPF 
     */
    public void setCPF(String CPF) {
        this.CPF = CPF;
    }
}
