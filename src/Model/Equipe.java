package Model;

import java.util.HashMap;
import java.util.LinkedList;

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
    
    public Equipe(int id_time, String Nome, String Cor_1, String Cor_2, int Ano_fundacao){
       this.idTime = id_time;
       this.nome = Nome;
       this.cor1 = Cor_1;
       this.cor2 = Cor_2;
       this.anoFundacao = Ano_fundacao;       
    }
    
    public int getIdTime() {
        return idTime;
    }

    public void setIdTime(int idTime) {
        this.idTime = idTime;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String Nome) {
        this.nome = Nome;
    }

    public String getCor1() {
        return cor1;
    }

    public void setCor1(String cor1) {
        this.cor1 = cor1;
    }

    public String getCor2() {
        return cor2;
    }

    public void setCor2(String cor2) {
        this.cor2 = cor2;
    }

    public int getAnoFundacao() {
        return anoFundacao;
    }

    public void setAnoFundacao(int anoFundacao) {
        this.anoFundacao = anoFundacao;
    }

    public HashMap<Integer, String> getTitulos() {
        return titulos;
    }

    public void setTitulos(HashMap<Integer, String> titulos) {
        this.titulos = titulos;
    }

    public LinkedList<Atleta> getAtletas() {
        return atletas;
    }

    public void setAtletas(LinkedList<Atleta> atletas) {
        this.atletas = atletas;
    }

    public LinkedList<Comissao> getComissaoTecnica() {
        return comissaoTecnica;
    }

    public void setComissaoTecnica(LinkedList<Comissao> comissaoTecnica) {
        this.comissaoTecnica = comissaoTecnica;
    }
     
    @Override
    public String toString() {
        return String.format("%d - %-20s %-20s %-20s %-20s", idTime, nome, cor1, cor2, anoFundacao);
    }


}
