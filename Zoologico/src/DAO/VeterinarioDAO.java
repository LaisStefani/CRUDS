/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import CONNECT.ConnectFactory;
import MODEL.Veterinario;
import java.util.List;
import javax.persistence.EntityManager;

/**
 *
 * @author EDUARDO
 */
public class VeterinarioDAO {
    
    public void inserir (MODEL.Veterinario cadastro){// metodo inserir será usado na Controler
        EntityManager em = new ConnectFactory().getConnection();
        
          em.getTransaction().begin();
          em.persist(cadastro);
          
          em.getTransaction().commit();
          em.close();
    
    }
       public List<Veterinario> buscaDados(){
           EntityManager em = new ConnectFactory().getConnection();
         
         em.getTransaction().begin();
         List<Veterinario> vet;
         
       // esse select faz um select na base na tabela Diretor get result list transforma a query em list
       // query é uma consulta no banco
       //from Animais é = a select * from
         vet =  em.createQuery("From Veterinario").getResultList();
         em.close();
          
          // por não ser void ele tem que retornar um valor o valor é oselect no meu banco
          return vet;
      }
      public void deletar (int id){
        EntityManager em = new ConnectFactory().getConnection();
        
        em.getTransaction().begin();
        
        Veterinario v1 = em.find(Veterinario.class, id);
        em.remove(v1);
        em.getTransaction().commit();
        em.close();

     
     }
}
