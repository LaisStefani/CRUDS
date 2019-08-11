/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CONTROLLER;

import DAO.HabitatDAO;
import java.sql.SQLException;
import java.text.ParseException;
import MODEL.Habitat;
import java.util.List;

/**
 *
 * @author NIDE08
 */
public class HabitatController {
    public void salvar (String habitat)throws
        SQLException, ParseException{ 
        MODEL.Habitat local = new MODEL.Habitat();
            
        local.setHabitat(habitat);
          // pega o da DAO que é o deletar
        new DAO.HabitatDAO().inserir(local);
    }
      
    public List<Habitat> enviaDados(){
      
        HabitatDAO local = new HabitatDAO();
          
        return local.buscaDados();
    }
    
     public void excluir (int id){
         // pega o da DAO que é o deletar
       new  HabitatDAO ().deletar(id);
     
                }
      
}

