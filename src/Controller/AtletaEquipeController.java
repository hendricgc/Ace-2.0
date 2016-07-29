/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Factory.DAOFactory;
import Model.Atleta;
import Model.Equipe;

/**
 *
 * @author Hendric
 */
public class AtletaEquipeController {

    protected DAOFactory dao = null;
    
    public AtletaEquipeController(DAOFactory dao) {
        this.dao = dao;
    }
    
    public boolean inserirAtletaEquipe(Atleta a, Equipe e){
        
        
        return false;
    }
    
    
}
