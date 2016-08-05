package Model;

import java.util.HashMap;
import java.util.LinkedList;
/**
 * 
 * @author  Hendric, Murillo
 */
public class Equipe {
     
    private int idTime;
    private String nome;
    private String cor1;
    private String cor2;
    private int anoFundacao;
    private HashMap<Integer, String> titulos;
    private LinkedList<Atleta> atletas = new LinkedList();
    private LinkedList<Comissao> comissaoTecnica = new LinkedList();

    public Equipe(){};
    /**
     * 
     * @param id_time
     * @param Nome
     * @param Cor_1
     * @param Cor_2
     * @param Ano_fundacao 
     */
    public Equipe(int id_time, String Nome, String Cor_1, String Cor_2, int Ano_fundacao){
       this.idTime = id_time;
       this.nome = Nome;
       this.cor1 = Cor_1;
       this.cor2 = Cor_2;
       this.anoFundacao = Ano_fundacao;       
    }
    /**
     * 
     * @return retorna o id da equipe
     */
    public int getIdTime() {
        return idTime;
    }

    /**
     * 
     * @param idTime 
     */
    public void setIdTime(int idTime) {
        this.idTime = idTime;
    }

    /**
     * 
     * @return retorna o nome da equipe
     */
    public String getNome() {
        return nome;
    }

    /**
     * 
     * @param Nome 
     */
    public void setNome(String Nome) {
        this.nome = Nome;
    }

    /**
     * 
     * @return retorna a cor 1 da equipe
     */
    public String getCor1() {
        return cor1;
    }

    /**
     * 
     * @param cor1 
     */
    public void setCor1(String cor1) {
        this.cor1 = cor1;
    }
    
    /**
     * 
     * @return retorna a cor 3 da equipe
     */
    public String getCor2() {
        return cor2;
    }

    /**
     * 
     * @param cor2 
     */
    public void setCor2(String cor2) {
        this.cor2 = cor2;
    }

    /**
     * 
     * @return retorna o ano de fundacao da equipe
     */
    public int getAnoFundacao() {
        return anoFundacao;
    }

    /**
     * 
     * @param anoFundacao 
     */
    public void setAnoFundacao(int anoFundacao) {
        this.anoFundacao = anoFundacao;
    }

    /**
     * 
     * @return retorna um Hashmap com os titulos da equipe
     */
    public HashMap<Integer, String> getTitulos() {
        return titulos;
    }
    
    
    /**
     * 
     * @param titulos 
     */
    public void setTitulos(HashMap<Integer, String> titulos) {
        this.titulos = titulos;
    }

    /**
     * 
     * @return retorna uma lista com os atletas ad equipe
     */
    public LinkedList<Atleta> getAtletas() {
        return atletas;
    }

    /**
     * 
     * @param atletas 
     */
    public void setAtletas(LinkedList<Atleta> atletas) {
        this.atletas = atletas;
    }

    /**
     * 
     * @return retorna um alista com os membros da comissao tecnica da equipe
     */
    public LinkedList<Comissao> getComissaoTecnica() {
        return comissaoTecnica;
    }

    /**
     * 
     * @param comissaoTecnica 
     */
    public void setComissaoTecnica(LinkedList<Comissao> comissaoTecnica) {
        this.comissaoTecnica = comissaoTecnica;
    }
     
    /**
     * 
     * @return metodo toString
     */
    @Override
    public String toString() {
        return String.format("%d - %-20s %-20s %-20s %-20s", idTime, nome, cor1, cor2, anoFundacao);
    }


}
