/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Factory;

import DAO.AtletaDAO;
import DAO.AtletaEquipeDAO;
import DAO.ComissaoDAO;
import DAO.EquipeDAO;

/**
 *
 * @author Hendric
 */
public class DAOFactory {
    
    private static AtletaDAO atletaDAO;
    private static ComissaoDAO comissaoDAO;
    private static EquipeDAO equipeDAO;
    private static AtletaEquipeDAO atletaEquipeDAO;
       
    public AtletaDAO getAtletaDAO(){
        if(atletaDAO == null)
            atletaDAO = new AtletaDAO();
        return atletaDAO;        
    }
    
    public ComissaoDAO getComissaoDAO(){
        if(comissaoDAO == null)
            comissaoDAO = new ComissaoDAO();
        return comissaoDAO;        
    }
    
    public EquipeDAO getEquipeDAO(){
        if(equipeDAO == null)
            equipeDAO = new EquipeDAO();
        return equipeDAO;        
    }
    
    public AtletaEquipeDAO getAtletaEquipeDAO(){
        if(atletaEquipeDAO == null)
            atletaEquipeDAO = new AtletaEquipeDAO();
        return atletaEquipeDAO;        
    }
}
