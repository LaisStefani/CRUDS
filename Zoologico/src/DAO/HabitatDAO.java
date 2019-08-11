/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import CONNECT.ConnectFactory;
import MODEL.Habitat;
import javax.persistence.EntityManager;
import java.util.List;


/**
 *
 * @author EDUARDO
 */
public class HabitatDAO {
    
     public void inserir (MODEL.Habitat cadastro){// metodo inserir será usado na Controler
        EntityManager em = new ConnectFactory().getConnection();
        
          em.getTransaction().begin();
          em.persist(cadastro);
          
          em.getTransaction().commit();
          em.close();
    
    }
     public List<Habitat> buscaDados(){
         EntityManager em = new ConnectFactory().getConnection();
         
         em.getTransaction().begin();
         List<Habitat> resinto;
         
       // esse select faz um select na base na tabela Diretor get result list transforma a query em list
       // query é uma consulta no banco
       //from Habitat é = a select * from
         resinto =  em.createQuery("From Habitat").getResultList();
         em.close();
          
          // por não ser void ele tem que retornar um valor o valor é oselect no meu banco
          return resinto;
     
     }
     public void deletar (int id){
        EntityManager em = new ConnectFactory().getConnection();
        
        em.getTransaction().begin();
        
        Habitat h1 = em.find(Habitat.class, id);
        em.remove(h1);
        em.getTransaction().commit();
        em.close();

     
     }
}
