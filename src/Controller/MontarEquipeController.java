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
 * @author Hendric
 */
public class MontarEquipeController {

    protected DAOFactory dao = null;
    
    public MontarEquipeController(DAOFactory dao) {
        this.dao = dao;
    }
    
    public boolean inserirAtletaEquipe(Atleta a, Equipe e) throws SQLException{
            if(a != null && e != null){
            if(dao.getAtletaEquipeDAO().inserirAtletaEquipe(a, e)){
                return true;
            }         
        }
        return false;       
    }
    
    public boolean inserirComissaoTime(Comissao comissao, Equipe e){
        
        
        return false;
    }
    
    
}
