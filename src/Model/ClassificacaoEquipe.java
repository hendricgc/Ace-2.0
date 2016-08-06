/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

/**
 *
 * @author Hendric, Murillo
 * 
 */
public class ClassificacaoEquipe implements Comparable<ClassificacaoEquipe>{
    
    private int posicaoEquipe;
    private Equipe equipe;
    private int numPontos = 0;
    private int numVitorias = 0;
    private int numDerrotas = 0;
    private int numJogos = 0;
    private int numSetsGanhos = 0;  
    /**
     * metodo para definir a classificaçao de uma equipe
     * @param equipe objeto equipe
     */
    public ClassificacaoEquipe(Equipe equipe) {
        this.equipe = equipe;
    }
    
    /**
     * metodo para obter a posicao de uma equipe
     * @return retorna a posiçao de uma equipe em uma lista de classificação de um campeonato
     */
    public int getPosicaoEquipe() {
        return posicaoEquipe;
    }

    /**
     * metodo para definir a posicao de uma equipe
     * @param posicaoEquipe  posicao da equipe
     */
    public void setPosicaoEquipe(int posicaoEquipe) {
        this.posicaoEquipe = posicaoEquipe;
    }

    /**
     * metodo para obter uma equipe
     * @return retorna uma Equipe
     */
    public Equipe getEquipe() {
        return equipe;
    }

    /**
     * metodo para definir uma equipe
     * @param equipe objeto equipe
     */
    public void setEquipe(Equipe equipe) {
        this.equipe = equipe;
    }

    /**
     * metodo para obter o numero de pontos
     * @return retorna o numero de pontos de uma equipe
     */
    public int getNumPontos() {
        return numPontos;
    }

    /**
     * metodo para definir o numero de pontos
     * @param numPontos numero de pontos
     */
    public void setNumPontos(int numPontos) {
        this.numPontos = numPontos;
    }

    /**
     * metodo paraobter o numero de vitorias de uma equipe
     * @return retorna o numero de vitorias de uma equipe 
     */
    public int getNumVitorias() {
        return numVitorias;
    }

    /**
     * metodo para definir o numero de vitorias
     * @param numVitorias numero de vitorias
     */
    public void setNumVitorias(int numVitorias) {
        this.numVitorias = numVitorias;
    }

    /**
     * metodo para obter o numero de derrotas
     * @return retorna o numero de derrotas de uma equipe 
     */
    public int getNumDerrotas() {
        return numDerrotas;
    }

    
    /**
     * metodo para definir o numero de derrotas
     * @param numDerrotas numero de derrotas
     */
    public void setNumDerrotas(int numDerrotas) {
        this.numDerrotas = numDerrotas;
    }
    
    /**
     * metodo para obter o numero de jogos
     * @return retorna o numero de jogos de uma equipe
     */
    public int getNumJogos() {
        return numJogos;
    }

    /**
     * metodopara definir o numero de jogos
     * @param numJogos numero de jogos
     */
    public void setNumJogos(int numJogos) {
        this.numJogos = numJogos;
    }

    /**
     * metodo para obter o numero de sets ganhos
     * @return retorna o numero de sets ganhos pela equipe
     */
    public int getNumSetsGanhos() {
        return numSetsGanhos;
    }

    /**
     * metodo para definir o numero de sets ganhos
     * @param numSetsGanhos numero de sets ganhos
     */
    public void setNumSetsGanhos(int numSetsGanhos) {
        this.numSetsGanhos = numSetsGanhos;
    }

    /**
     * Compara o numero de pontos de entre duas
     * @param o objeto classificaçao
     * @return  retorna  a classificação
     */
    @Override
    public int compareTo(ClassificacaoEquipe o) {
        return Integer.valueOf(numPontos).compareTo(o.numPontos);
    }

    /**
     * metodo para conversoa para string
     * @return metodo toString
     */
    @Override
    public String toString() {
        return posicaoEquipe + "   " + equipe.getNome() + "   " + numPontos + "   " +  numVitorias + "   " + numJogos;
    }

}
