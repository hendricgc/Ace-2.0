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
     * @param dao ponteiro pro banco de dados
     */
    public MontarEquipeController(DAOFactory dao) {
        this.dao = dao;
    }
    
    /**
     *  Insere um atleta na equipe
     * @param a objeto atleta
     * @param e objeto equipe
     * @return retorna true se o atleta fo iassociado a equipe com sucesso e false em caso de falha
     * @throws SQLException exception
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
     *  insere um membro da comissao em uma equipe
     * @param comissao objeto comissao
     * @param e objeto equipe
     * @return retorna true se inseriu com sucesso o membro da comição a uma equipe e falso em caso de falha
     * @throws SQLException exception
     */

    public boolean inserirComissaoTime(Comissao comissao, Equipe e) throws SQLException{
        if(comissao != null && e != null){
            //if(dao.getComissaoDAO().inserirComissaoTime(comissao, e)){
                    return true;
            //}
        }
            return false;
     }
    
    /**
     * remove atleta de uma equipe
     * @param a objeto atleta
     * @return retorna true se removeu o atleta da equipe com sucesso e falso caso contrario
     * @throws SQLException exception
     */
    public boolean removerAtletaEquipe(Atleta a) throws SQLException{
        
        return dao.getAtletaEquipeDAO().removerAtletaEquipe(a);
    }
    
    
}
