/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Factory.DAOFactory;
import Model.Comissao;
import java.sql.SQLException;
import java.util.Observable;

/**
 *
 * @author Hendric
 */
public class ComissaoController extends Observable{
    
    protected DAOFactory dao = null;
    
    public ComissaoController(DAOFactory dao){
        this.dao = dao;
    }
    
    public boolean cadastrarComissao(Comissao a) throws SQLException{
        if(a != null){
            if(dao.getComissaoDAO().inserirComissao(a)){
                setChanged();
                notifyObservers();
                return true;
            }
        }
        return false;
    }
}
