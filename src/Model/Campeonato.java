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
     * @param id_campeonato id do campeonato
     * @param Nome nome do campeonato
     * @param Organizador organizador do campeonato
     * @param Times times do campeonato
     * @param anoCampeonato  ano do campeonato
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
     * metodo para obter o id de um campeonato
     * @return id do campeonato
     */
    public int getIdCampeonato() {
        return idCampeonato;
    }

    /**
     * metodo para definir o id de um campeonato
     * @param idCampeonato id de um campeonato
     */    
    public void setIdCampeonato(int idCampeonato) {
        this.idCampeonato = idCampeonato;
    }
    
    /**
     * metodo para obter o nome de um campeonato
     * @return nome do campeonato 
     */
    public String getNome() {
        return nome;
    }
    
    /**
     * metodo para definir o nome de um campeonato
     * @param Nome nome do campeonato
     */

    public void setNome(String Nome) {
        this.nome = Nome;
    }

    
    /**
     * metodo para obter o organizador do campeonato
     * @return organizador do campeonato 
     */
    public String getOrganizador() {
        return organizador;
    }

    /**
     * metodo para definir o organizador do campeonato
     * @param Organizador organizador do campeonato
     */    
    public void setOrganizador(String Organizador) {
        this.organizador = Organizador;
    }

    
    /**
     * metodo para obter as equipes associadas
     * @return lista de equipes participantes do campeonato
     */
    public LinkedList<Equipe> getEquipes() {
        return equipes;
    }

    /**
     * metodo para associar uma equipe ao campeonato
     * @param Times objeto time
     */    
    public void setEquipes(LinkedList<Equipe> Times) {
        this.equipes = Times;
    }

    /**
     * metodo para obter uma lista dos jogos do campeonato
     * @return lista de jogos do campeonato
     */
    public LinkedList<Jogo> getJogos() {
        return jogos;
    }

    /**
     * metodo para associar um jogo ao campeonato
     * @param jogos objeto jogo
     */
    public void setJogos(LinkedList<Jogo> jogos) {
        this.jogos = jogos;
    }

    /**
     * metodo para obter uma lista com a classificação dos times no campeonato
     * @return lista de classificação do campeonato
     */
    public LinkedList<ClassificacaoEquipe> getClassificacao() {
        return classificacao;
    }

    /**
     * metodo para definir a classificaçao
     * @param classificacao lista de classificaçao
     */
    public void setClassificacao(LinkedList<ClassificacaoEquipe> classificacao) {
        this.classificacao = classificacao;
    }
    
    /**
     * metodo para obter o indice da classificação de uma equipe
     * @param e objeto equipe
     * @return indice da classificação 
     */
    public int getIndiceClassificacao(Equipe e){
        return this.getEquipes().indexOf(e);
    }
    
    /**
     * metodo para obter o ano de um campeonato
     * @return ano do campeonato
     */
    public int getAnoCampeonato() {
        return anoCampeonato;
    }

    
    /**
     * metodo para definir o ano de um campenato
     * @param anoCampeonato ano do campeonato
     */
    public void setAnoCampeonato(int anoCampeonato) {
        this.anoCampeonato = anoCampeonato;
    }
    
    /**
     * metodo para conversao para string
     * @return retorna uma string
     */
    @Override
    public String toString() {
        return String.format("%d  - %s %30s", idCampeonato, nome, organizador);
    }

    /**
     * metodo para obter o proximo id que pode ser associado ao um jogo
     * @return retorna o id do proximo campeonato a ser cadastrado
     */
    public int getNovoIdJogo() {
        if(jogos.isEmpty())
            return 0;
        return jogos.indexOf(jogos.getLast()) + 1;
    }
    
    /**
     * metodo para obter um jogo atraves do id
     * @param idJogo id do jogo 
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
