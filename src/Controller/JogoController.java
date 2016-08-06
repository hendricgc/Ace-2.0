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
 * @author Hendric, Murillo
 */
public class JogoController {
    
    protected DAOFactory dao = null;
    
    /**
     * 
     * @param dao ponteiro pro banco de dados
     */
    public JogoController(DAOFactory dao){
        this.dao = dao;
    }
    
    /**
     * Insere um jogo em um campeonato
     * @param a objeto equipe mandante
     * @param b objeto equipe visitante
     * @param camp objeto campeonato
     * @return true se o jogo foi inserido com sucesso e false caso contrario
     * @throws SQLException exception
     */
    public boolean inserirJogo(Equipe a, Equipe b, Campeonato camp) throws SQLException{
        if(a != null && b != null && camp != null){
            if(dao.getJogoCampeonatoDAO().inserirJogo(a, b, camp)){
                return true;
            }
        }
        return false;
    }
}
