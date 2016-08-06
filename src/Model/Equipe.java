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
     * metodo para criar uma equipe
     * @param id_time id do time
     * @param Nome nome do time
     * @param Cor_1 primeira cor do time
     * @param Cor_2 segunda cor do time
     * @param Ano_fundacao  ano de fundação do time
     */
    public Equipe(int id_time, String Nome, String Cor_1, String Cor_2, int Ano_fundacao){
       this.idTime = id_time;
       this.nome = Nome;
       this.cor1 = Cor_1;
       this.cor2 = Cor_2;
       this.anoFundacao = Ano_fundacao;       
    }
    /**
     * metodo para obter o id do time
     * @return retorna o id da equipe
     */
    public int getIdTime() {
        return idTime;
    }

    /**
     * metodo para definir o id do time
     * @param idTime id do time
     */
    public void setIdTime(int idTime) {
        this.idTime = idTime;
    }

    /**
     * metodo para obter o nome do time
     * @return retorna o nome da equipe
     */
    public String getNome() {
        return nome;
    }

    /**
     * metodo para definir o nome do time
     * @param Nome nome do time
     */
    public void setNome(String Nome) {
        this.nome = Nome;
    }

    /**
     * metodo para obter a primeira cor do time
     * @return retorna a primeira cor da equipe
     */
    public String getCor1() {
        return cor1;
    }

    /**
     * metodo para definir  primeira cor do time
     * @param cor1 primeira cor do time
     */
    public void setCor1(String cor1) {
        this.cor1 = cor1;
    }
    
    /**
     * metodo para obter a segunda cor do time
     * @return retorna a segunda cor da equipe
     */
    public String getCor2() {
        return cor2;
    }

    /**
     * metodo para definir a segunda cor do time
     * @param cor2 segunda cor do time
     */
    public void setCor2(String cor2) {
        this.cor2 = cor2;
    }

    /**
     * metodo para obter o ano de fundacao do time
     * @return retorna o ano de fundacao da equipe
     */
    public int getAnoFundacao() {
        return anoFundacao;
    }

    /**
     * metodo para definir o ano de fundacao do time
     * @param anoFundacao ano de fundacao 
     */
    public void setAnoFundacao(int anoFundacao) {
        this.anoFundacao = anoFundacao;
    }

    /**
     * metodo para obter os titulos d eum time
     * @return retorna um Hashmap com os titulos da equipe
     */
    public HashMap<Integer, String> getTitulos() {
        return titulos;
    }
    
    
    /**
     * metodo para definir os titulos de um time
     * @param titulos titulos
     */
    public void setTitulos(HashMap<Integer, String> titulos) {
        this.titulos = titulos;
    }

    /**
     * metodo para obte ros atletas de um time
     * @return retorna uma lista com os atletas ad equipe
     */
    public LinkedList<Atleta> getAtletas() {
        return atletas;
    }

    /**
     * metodo para definir os atletas de um time
     * @param atletas atletas
     */
    public void setAtletas(LinkedList<Atleta> atletas) {
        this.atletas = atletas;
    }

    /**
     * metdo para obter a lista de membros da comissao tecnica de um time
     * @return retorna um alista com os membros da comissao tecnica da equipe
     */
    public LinkedList<Comissao> getComissaoTecnica() {
        return comissaoTecnica;
    }

    /**
     * metodo para definir a comissao tecnica de um time
     * @param comissaoTecnica comissao tecnica
     */
    public void setComissaoTecnica(LinkedList<Comissao> comissaoTecnica) {
        this.comissaoTecnica = comissaoTecnica;
    }
     
    /**
     * metodo para conversao para string
     * @return metodo toString
     */
    @Override
    public String toString() {
        return String.format("%d - %-20s %-20s %-20s %-20s", idTime, nome, cor1, cor2, anoFundacao);
    }


}
