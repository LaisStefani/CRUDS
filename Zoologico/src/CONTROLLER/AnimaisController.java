/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CONTROLLER;

import DAO.AnimaisDAO;
import MODEL.Animais;
import java.sql.SQLException;
import java.text.ParseException;
import java.util.List;

/**
 *
 * @author NIDE08
 */
public class AnimaisController {
      public void salvar (String classe, String nomeP, String nomeC, float peso,int idade, String habitat)throws
            SQLException, ParseException{ 
         
            new DAO.AnimaisDAO().inserir(classe,nomeP,nomeC,peso,idade,habitat);//inserir esta na DAO
                 
                 }
    public List<Animais> enviaDados(){
          AnimaisDAO animal = new AnimaisDAO();
          
          return animal.buscaDados();
          
                }
      
    public void excluir (int id){
         // pega o da DAO
       new  AnimaisDAO ().deletar(id);
     
                }
}
