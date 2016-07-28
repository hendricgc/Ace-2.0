/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import java.util.LinkedList;

/**
 *
 * @author Murillo Machado
 */
public class Banco {
    
    public LinkedList<Equipe> equipes = new LinkedList<>();
    public LinkedList<Campeonato> campeonatos = new LinkedList<>();
    public LinkedList<Atleta> atletas = new LinkedList<>();
    
    public Banco(){};
    
    public int getNovoIdEquipe(){
        if(equipes.isEmpty())
            return 0;
        return equipes.indexOf(equipes.getLast()) + 1;
    }
      
    public int getNovoIdAtleta(){
        if(atletas.isEmpty())
            return 0;
        return atletas.indexOf(atletas.getLast()) + 1;
    }
    
    public Equipe getEquipePorNome(String nome){
        for (Equipe equipe : equipes) {
            if (equipe.getNome().equals(nome)) {
                return equipe;
            }
        }
        return null;
    }
    
    public Atleta getAtletaPorNome(String nome){
        for(Atleta atleta : atletas){
            if(atleta.getNome().equals(nome))
                return atleta;
        }
        return null;
    }
    
    public Campeonato getCampeonatoPorNome(String nome){
        for(Campeonato campeonato : campeonatos){
            if(campeonato.getNome().equals(nome))
                return campeonato;
        }
        return null;        
    }
    public LinkedList<Equipe> getEquipes() {
        return equipes;
    }

    public LinkedList<Campeonato> getCampeonatos() {
        return campeonatos;
    }

    public LinkedList<Atleta> getAtletas() {
        return atletas;
    }
    
    
    
}
