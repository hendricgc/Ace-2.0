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
     * 
     * @param equipe 
     */
    public ClassificacaoEquipe(Equipe equipe) {
        this.equipe = equipe;
    }
    
    /**
     * 
     * @return retorna a posiçao de uma equipe em uma lista de classificação de um campeonato
     */
    public int getPosicaoEquipe() {
        return posicaoEquipe;
    }

    /**
     * 
     * @param posicaoEquipe 
     */
    public void setPosicaoEquipe(int posicaoEquipe) {
        this.posicaoEquipe = posicaoEquipe;
    }

    /**
     * 
     * @return retorna uma Equipe
     */
    public Equipe getEquipe() {
        return equipe;
    }

    /**
     * 
     * @param equipe 
     */
    public void setEquipe(Equipe equipe) {
        this.equipe = equipe;
    }

    /**
     * 
     * @return retorna o numero de pontos de uma equipe
     */
    public int getNumPontos() {
        return numPontos;
    }

    /**
     * 
     * @param numPontos 
     */
    public void setNumPontos(int numPontos) {
        this.numPontos = numPontos;
    }

    /**
     * 
     * @return retorna o numero de vitorias de uma equipe 
     */
    public int getNumVitorias() {
        return numVitorias;
    }

    /**
     * 
     * @param numVitorias 
     */
    public void setNumVitorias(int numVitorias) {
        this.numVitorias = numVitorias;
    }

    /**
     * 
     * @return retorna o numero de derrotas de uma equipe 
     */
    public int getNumDerrotas() {
        return numDerrotas;
    }

    
    /**
     * 
     * @param numDerrotas 
     */
    public void setNumDerrotas(int numDerrotas) {
        this.numDerrotas = numDerrotas;
    }
    
    /**
     * 
     * @return retorna o numero de jogos de uma equipe
     */
    public int getNumJogos() {
        return numJogos;
    }

    /**
     * 
     * @param numJogos 
     */
    public void setNumJogos(int numJogos) {
        this.numJogos = numJogos;
    }

    /**
     * 
     * @return retorna o numero de sets ganhos pela equipe
     */
    public int getNumSetsGanhos() {
        return numSetsGanhos;
    }

    /**
     * 
     * @param numSetsGanhos 
     */
    public void setNumSetsGanhos(int numSetsGanhos) {
        this.numSetsGanhos = numSetsGanhos;
    }

    /**
     * Compara o numero de pontos de entre duas
     * @param o
     * @return  retorna  a classificação
     */
    @Override
    public int compareTo(ClassificacaoEquipe o) {
        return Integer.valueOf(numPontos).compareTo(o.numPontos);
    }

    /**
     * 
     * @return metodo toString
     */
    @Override
    public String toString() {
        return posicaoEquipe + "   " + equipe.getNome() + "   " + numPontos + "   " +  numVitorias + "   " + numJogos;
    }

}
