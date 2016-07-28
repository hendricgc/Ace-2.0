package Model;


import java.util.LinkedList;
import java.util.List;

public class Campeonato {

    private int idCampeonato;
    private String nome;
    private String organizador;
    private LinkedList<Equipe> equipes;
    private LinkedList<Jogo> jogos = new LinkedList();
    private boolean ativo;
    private LinkedList<ClassificacaoEquipe> classificacao = new LinkedList();

    public Campeonato(int id_campeonato, String Nome, String Organizador, LinkedList<Equipe> Times) {
        this.idCampeonato = id_campeonato;
        this.nome = Nome;
        this.organizador = Organizador;
        this.equipes = Times;
        this.ativo = true;
    }
    
    
    public int getIdCampeonato() {
        return idCampeonato;
    }

    public void setIdCampeonato(int idCampeonato) {
        this.idCampeonato = idCampeonato;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String Nome) {
        this.nome = Nome;
    }

    public String getOrganizador() {
        return organizador;
    }

    public void setOrganizador(String Organizador) {
        this.organizador = Organizador;
    }

    public LinkedList<Equipe> getEquipes() {
        return equipes;
    }

    public void setEquipes(LinkedList<Equipe> Times) {
        this.equipes = Times;
    }

    public LinkedList<Jogo> getJogos() {
        return jogos;
    }

    public void setJogos(LinkedList<Jogo> jogos) {
        this.jogos = jogos;
    }

    public LinkedList<ClassificacaoEquipe> getClassificacao() {
        return classificacao;
    }

    public void setClassificacao(LinkedList<ClassificacaoEquipe> classificacao) {
        this.classificacao = classificacao;
    }
    
    public int getIndiceClassificacao(Equipe e){
        return this.getEquipes().indexOf(e);
    }

    public boolean isAtivo() {
        return ativo;
    }

    public void setAtivo(boolean ativo) {
        this.ativo = ativo;
    }
        
    @Override
    public String toString() {
        return String.format("%d  - %s %30s %15s", idCampeonato, nome, organizador, ativo);
    }

    public int getNovoIdJogo() {
        if(jogos.isEmpty())
            return 0;
        return jogos.indexOf(jogos.getLast()) + 1;
    }
    
    public Jogo getJogoPorId(int idJogo){
        for(int i = 0; i < this.jogos.size(); i++){
            if(this.jogos.get(i).getIdJogo() == idJogo)
                return jogos.get(i);
        }
        return null;
    }
}