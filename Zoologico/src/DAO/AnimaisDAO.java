/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import CONNECT.ConnectFactory;
import MODEL.Animais;
import MODEL.Habitat;
import java.util.List;
import javax.persistence.EntityManager;

/**
 *
 * @author EDUARDO
 */
public class AnimaisDAO {
    public void inserir (String classe,String nomeC, String nomeP, float peso, int idade, String habitat){// metodo inserir será usado na Controller
        EntityManager em = new ConnectFactory().getConnection();
        
         Habitat h1 = em.find(Habitat.class, habitat);
         
         Animais animal = new Animais(classe,nomeC,nomeP,peso,idade,h1);
        
          em.getTransaction().begin();
          em.persist(animal);
          
          em.getTransaction().commit();
          em.close();
    
    }
       public List<Animais>buscaDados(){
           EntityManager em = new ConnectFactory().getConnection();
         
         em.getTransaction().begin();
         List<Animais> animal;
         
       // esse select faz um select na base na tabela Diretor get result list transforma a query em list
       // query é uma consulta no banco
       //from Animais é = a select * from
         animal =  em.createQuery("From Animais").getResultList();
         em.close();
          
          // por não ser void ele tem que retornar um valor o valor é oselect no meu banco
          return animal;
      }
      public void deletar (int id){
        EntityManager em = new ConnectFactory().getConnection();
        
        em.getTransaction().begin();
        
        Animais a1 = em.find(Animais.class, id);
        em.remove(a1);
        em.getTransaction().commit();
        em.close();

     
     }
}
