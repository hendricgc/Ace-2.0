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
 * @author  Hendric, Murillo
 */
public class EquipeController extends Observable{
    
    protected DAOFactory dao = null;
    /**
     * 
     * @param dao ponteiro pro banco de dados
     */
    public EquipeController(DAOFactory dao){
        this.dao = dao;
    }
    
    /**
     *  Metodo para cadastrar uma equipe
     * @param a objeto equipe
     * @return retorna true em caso de sucesso no cadastro da equipe e false em caso de falha
     * @throws SQLException exception
     */
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
    
    /**
     * Metodo para listar todas as equipes 
     * @return retorna uma lista com todas as equipes cadastradas
     * @throws SQLException exception
     */
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

    /**
     * Metodo para procurar uma equipe pelo nome
     * @param nomeEquipe nome da equipe
     * @return retorna uma Equipe
     * @throws SQLException exception
     */
    public Equipe procurarEquipeNome(String nomeEquipe) throws SQLException {
        
        Equipe e = dao.getEquipeDAO().procurarNomeEquipe(nomeEquipe);
        if(e != null){
            setChanged();
            notifyObservers();
            return e;
        }
        return null;
    }
    
    /**
     * Metodo para listar os atletas de uma determinada equipe
     * @param e objeto equipe
     * @return retorna uma lista com os atletas de uma equipe
     * @throws SQLException exception
     */
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
    
    /**
     *  Metodo para listar os atletas nao associados a uma equipe
     * @return retorna uma lista com os atletas nao associados a uma equipe
     * @throws SQLException exception
     */
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
    
    /**
     * Metodo para conseguir o numero de atletas em uma equipe
     * @param e objeto equipe
     * @return retorna a quantidade de atletas em uma equipe
     * @throws SQLException exception
     */
    public int getQuantAletasEquipe(Equipe e) throws SQLException {
        if(e != null)
            return dao.getAtletaEquipeDAO().getQuantAtletasEquipe(e);
        return -1;
    }
}
