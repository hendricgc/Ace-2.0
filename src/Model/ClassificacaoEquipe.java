/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

/**
 *
 * @author Hendric, Murillo
 */
public class ClassificacaoEquipe implements Comparable<ClassificacaoEquipe>{
    
    private int posicaoEquipe;
    private Equipe equipe;
    private int numPontos = 0;
    private int numVitorias = 0;
    private int numDerrotas = 0;
    private int numJogos = 0;
    private int numSetsGanhos = 0;  

    public ClassificacaoEquipe(Equipe equipe) {
        this.equipe = equipe;
    }
    
    public int getPosicaoEquipe() {
        return posicaoEquipe;
    }

    public void setPosicaoEquipe(int posicaoEquipe) {
        this.posicaoEquipe = posicaoEquipe;
    }

    public Equipe getEquipe() {
        return equipe;
    }

    public void setEquipe(Equipe equipe) {
        this.equipe = equipe;
    }

    public int getNumPontos() {
        return numPontos;
    }

    public void setNumPontos(int numPontos) {
        this.numPontos = numPontos;
    }

    public int getNumVitorias() {
        return numVitorias;
    }

    public void setNumVitorias(int numVitorias) {
        this.numVitorias = numVitorias;
    }

    public int getNumDerrotas() {
        return numDerrotas;
    }

    public void setNumDerrotas(int numDerrotas) {
        this.numDerrotas = numDerrotas;
    }

    public int getNumJogos() {
        return numJogos;
    }

    public void setNumJogos(int numJogos) {
        this.numJogos = numJogos;
    }

    public int getNumSetsGanhos() {
        return numSetsGanhos;
    }

    public void setNumSetsGanhos(int numSetsGanhos) {
        this.numSetsGanhos = numSetsGanhos;
    }

    @Override
    public int compareTo(ClassificacaoEquipe o) {
        return Integer.valueOf(numPontos).compareTo(o.numPontos);
    }

    @Override
    public String toString() {
        return posicaoEquipe + "   " + equipe.getNome() + "   " + numPontos + "   " +  numVitorias + "   " + numJogos;
    }

}
