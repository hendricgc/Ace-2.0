/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Factory.DAOFactory;
import Model.Atleta;
import Model.Comissao;
import Model.Equipe;
import java.sql.SQLException;

/**
 *
 * @author  Hendric, Murillo
 */
public class MontarEquipeController {

    protected DAOFactory dao = null;
    /**
     * 
     * @param dao 
     */
    public MontarEquipeController(DAOFactory dao) {
        this.dao = dao;
    }
    
    /**
     * 
     * @param a
     * @param e
     * @return retorna true se o atleta fo iassociado a equipe com sucesso e false em caso de falha
     * @throws SQLException 
     */
    public boolean inserirAtletaEquipe(Atleta a, Equipe e) throws SQLException{
            if(a != null && e != null){
            if(dao.getAtletaEquipeDAO().inserirAtletaEquipe(a, e)){
                return true;
            }         
        }
        return false;       
    }
    
    /**
     * 
     * @param comissao
     * @param e
     * @return retorna true se inseriu com sucesso o membro da comição a uma equipe e falso em caso de falha
     * @throws SQLException 
     */

    public boolean inserirComissaoTime(Comissao comissao, Equipe e) throws SQLException{
        if(comissao != null && e != null){
            //if(dao.getComissaoDAO().inserirComissaoTime(comissao, e)){
                    return true;
            //}
        }
            return false;
     }
    
    public boolean removerAtletaEquipe(Atleta a) throws SQLException{
        
        return dao.getAtletaEquipeDAO().removerAtletaEquipe(a);
    }
    
    
}
