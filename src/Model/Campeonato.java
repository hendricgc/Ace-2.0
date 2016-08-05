package Model;

/**
 *@author Hendric, Murillo
 */
import java.util.LinkedList;

public class Campeonato {

    private int idCampeonato;
    private String nome;
    private String organizador;
    private LinkedList<Equipe> equipes;
    private LinkedList<Jogo> jogos = new LinkedList();
    private LinkedList<ClassificacaoEquipe> classificacao = new LinkedList();
    private int anoCampeonato;

    /**
     * Define um campeonato
     * @param id_campeonato
     * @param Nome
     * @param Organizador
     * @param Times
     * @param anoCampeonato 
     */
    public Campeonato(int id_campeonato, String Nome, String Organizador, LinkedList<Equipe> Times, int anoCampeonato) {
        this.idCampeonato = id_campeonato;
        this.nome = Nome;
        this.organizador = Organizador;
        this.equipes = Times;
        this.anoCampeonato = anoCampeonato;
    }

    public Campeonato(){}
    
    /**
     * 
     * @return id do campeonato
     */
    public int getIdCampeonato() {
        return idCampeonato;
    }

    /**
     * 
     * @param idCampeonato 
     */    
    public void setIdCampeonato(int idCampeonato) {
        this.idCampeonato = idCampeonato;
    }
    
    /**
     * 
     * @return nome do campeonato 
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
     * @return organizador do campeonato 
     */
    public String getOrganizador() {
        return organizador;
    }

    /**
     * 
     * @param Organizador 
     */    
    public void setOrganizador(String Organizador) {
        this.organizador = Organizador;
    }

    
    /**
     * 
     * @return lista de equipes participantes do campeonato
     */
    public LinkedList<Equipe> getEquipes() {
        return equipes;
    }

    /**
     * 
     * @param Times 
     */    
    public void setEquipes(LinkedList<Equipe> Times) {
        this.equipes = Times;
    }

    /**
     * 
     * @return lista de jogos do campeonato
     */
    public LinkedList<Jogo> getJogos() {
        return jogos;
    }

    /**
     * 
     * @param jogos 
     */
    public void setJogos(LinkedList<Jogo> jogos) {
        this.jogos = jogos;
    }

    /**
     * 
     * @return lista de classificação do campeonato
     */
    public LinkedList<ClassificacaoEquipe> getClassificacao() {
        return classificacao;
    }

    /**
     * 
     * @param classificacao 
     */
    public void setClassificacao(LinkedList<ClassificacaoEquipe> classificacao) {
        this.classificacao = classificacao;
    }
    
    /**
     * 
     * @param e
     * @return indice da classificação 
     */
    public int getIndiceClassificacao(Equipe e){
        return this.getEquipes().indexOf(e);
    }
    
    /**
     * 
     * @return ano do campeonato
     */
    public int getAnoCampeonato() {
        return anoCampeonato;
    }

    
    /**
     * 
     * @param anoCampeonato 
     */
    public void setAnoCampeonato(int anoCampeonato) {
        this.anoCampeonato = anoCampeonato;
    }
    
    /**
     * 
     * @return 
     */
    @Override
    public String toString() {
        return String.format("%d  - %s %30s", idCampeonato, nome, organizador);
    }

    /**
     * 
     * @return retorna o id do proximo campeonato a ser cadastrado
     */
    public int getNovoIdJogo() {
        if(jogos.isEmpty())
            return 0;
        return jogos.indexOf(jogos.getLast()) + 1;
    }
    
    /**
     * 
     * @param idJogo
     * @return retorna o jogo a partir do idJogo
     */
    public Jogo getJogoPorId(int idJogo){
        for(int i = 0; i < this.jogos.size(); i++){
            if(this.jogos.get(i).getIdJogo() == idJogo)
                return jogos.get(i);
        }
        return null;
    }
}
