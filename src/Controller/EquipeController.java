/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Factory.DAOFactory;
import Model.Atleta;
import Model.Equipe;
import java.sql.SQLException;
import java.util.LinkedList;
import java.util.Observable;

/**
 *
 * @author Hendric
 */
public class EquipeController extends Observable{
    
    protected DAOFactory dao = null;
    
    public EquipeController(DAOFactory dao){
        this.dao = dao;
    }
    
    public boolean cadastrarEquipe(Equipe a) throws SQLException{
        if(a != null){
            if(dao.getEquipeDAO().inserirEquipe(a)){
                setChanged();
                notifyObservers();
            }
            return true;
        }
        return false;
    }
    
    public LinkedList<Equipe> listarTodasEquipes() throws SQLException{
        
        LinkedList<Equipe> equipes;
        equipes = dao.getEquipeDAO().listarTodasEquipes();
        
        if(equipes != null){
            setChanged();
            notifyObservers();
            return equipes;
        }
        return null;
    }

    public Equipe procurarEquipeNome(String nomeEquipe) throws SQLException {
        
        Equipe e = dao.getEquipeDAO().procurarNomeEquipe(nomeEquipe);
        if(e != null){
            setChanged();
            notifyObservers();
            return e;
        }
        return null;
    }
    
    public LinkedList<Atleta> getAtletasEquipe(Equipe e) throws SQLException {
        
        LinkedList<Atleta> atletas;
        atletas = dao.getAtletaEquipeDAO().getAtletasEquipe(e);
        if(atletas != null){
            setChanged();
            notifyObservers();
            return atletas;
        }
        return null;
    }
    
    public LinkedList<Atleta> getAtletasSemEquipe() throws SQLException {
        
        LinkedList<Atleta> atletas;
        atletas = dao.getAtletaEquipeDAO().getAtletasSemEquipe();
        if(atletas != null){
            setChanged();
            notifyObservers();
            return atletas;
        }
        return null;
    }
    
    public int getQuantAletasEquipe(Equipe e) throws SQLException {
        
        return dao.getAtletaEquipeDAO().getQuantAtletasEquipe(e);
    }
}
