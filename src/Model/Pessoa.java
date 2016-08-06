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
     * metodo para criar uma pessoa
     * @param Nome nome da pessoa
     * @param Data_nasc data de nascimento
     * @param RG RG da pessoa
     * @param CPF  CPF da pessoa
     */
    public Pessoa(String Nome, Date Data_nasc, String RG, String CPF){
        this.RG = RG;
        this.CPF = CPF;
        this.Nome = Nome;
        this.dataNasc = Data_nasc;
    }
    /**
     * metodo para obter o id de uma pessoa
     * @return retorna o id de uma pessoa
     */
    public int getIdPessoa() {
        return idPessoa;
    }

    /**
     * metodo prada defnir o id de uma pessoa
     * @param idPessoa  id da pessoa
     */
    public void setIdPessoa(int idPessoa) {
        this.idPessoa = idPessoa;
    }
    
    /**
     * metodo para obter o nome de uma pessoa
     * @return retorna o nome de uma pessoa
     */
    public String getNome() {
        return Nome;
    }

    /**
     * metodo para definir o nome de uma pessoa
     * @param Nome  nome da pessoa
     */
    public void setNome(String Nome) {
        this.Nome = Nome;
    }

    /**
     * metodo para obter a data de nascimento
     * @return retorna a data de nascimento de uma pessoa
     */
    public Date getDataNasc() {
        return dataNasc;
    }

    /**
     * metodo para definir a data de nascimento
     * @param dataNasc data de nascimento
     */
    public void setDataNasc(Date dataNasc) {
        this.dataNasc = dataNasc;
    }

    /**
     * metodo para obter o RG
     * @return retorna o RG de uma pessoa
     */
    public String getRG() {
        return RG;
    }

    /**
     * metodo para definir o rg
     * @param RG RG
     */
    public void setRG(String RG) {
        this.RG = RG;
    }
     /**
     * metodo para obter o CPF
     * @return retorna o CPF de uma pessoa
     */
    public String getCPF() {
        return CPF;
    }

    /**
     * metodo para definir o cpf
     * @param CPF CPF
     */
    public void setCPF(String CPF) {
        this.CPF = CPF;
    }
}
