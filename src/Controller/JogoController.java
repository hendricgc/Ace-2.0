/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Factory.DAOFactory;
import Model.Campeonato;
import Model.Equipe;
import java.sql.SQLException;

/**
 *
 * @author Hendric
 */
public class JogoController {
    
    protected DAOFactory dao = null;
    
    public JogoController(DAOFactory dao){
        this.dao = dao;
    }
    
    public boolean inserirJogo(Equipe a, Equipe b, Campeonato camp) throws SQLException{
        if(a != null && b != null && camp != null){
            if(dao.getJogoCampeonatoDAO().inserirJogo(a, b, camp)){
                return true;
            }
        }
        return false;
    }
}
