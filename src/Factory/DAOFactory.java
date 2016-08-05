/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Factory;

import DAO.AtletaDAO;
import DAO.AtletaEquipeDAO;
import DAO.CampeonatoDAO;
import DAO.ComissaoDAO;
import DAO.EquipeCampeonatoDAO;
import DAO.EquipeDAO;
import DAO.JogoCampeonatoDAO;

/**
 *
 * @author Hendric
 */
public class DAOFactory {
    
    private static AtletaDAO atletaDAO;
    private static ComissaoDAO comissaoDAO;
    private static EquipeDAO equipeDAO;
    private static AtletaEquipeDAO atletaEquipeDAO;
    private static CampeonatoDAO campeonatoDAO;
    private static EquipeCampeonatoDAO equipeCampeonatoDAO;
    private static JogoCampeonatoDAO jogoCampeonatoDAO;
       
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
    
    public CampeonatoDAO getCampeonatoDAO(){
        if(campeonatoDAO == null)
            campeonatoDAO= new CampeonatoDAO();
        return campeonatoDAO;        
    }
    
    public EquipeCampeonatoDAO getEquipeCampeonatoDAO(){
        if(equipeCampeonatoDAO == null)
            equipeCampeonatoDAO = new EquipeCampeonatoDAO();
        return equipeCampeonatoDAO;  
    }
    
    public JogoCampeonatoDAO getJogoCampeonatoDAO(){
        if(jogoCampeonatoDAO == null)
            jogoCampeonatoDAO = new JogoCampeonatoDAO();
        return jogoCampeonatoDAO;  
    }
}
