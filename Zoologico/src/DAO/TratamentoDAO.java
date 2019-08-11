/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import CONNECT.ConnectFactory;
import MODEL.Animais;
import MODEL.Tratamento;
import MODEL.Veterinario;
import java.util.List;
import javax.persistence.EntityManager;

/**
 *
 * @author EDUARDO
 */
public class TratamentoDAO {
       public void inserir (String procedimento, String descricao, int vet, int animal){// metodo inserir será usado na DAO
        EntityManager em = new ConnectFactory().getConnection();
        
        // objetos de genero e diretor 
                                  // nome da variavel no inserir  
       Veterinario v1 = em.find(Veterinario.class, vet);
       Animais a1 = em.find(Animais.class, animal);
        
        // emcapsula dentro de um objeto 
        // funciona deste jeito por que tenho o metodo contrutor na model
       Tratamento tratar = new Tratamento (procedimento,descricao,v1,a1);
        
         em.getTransaction().begin();
         em.persist(tratar);
          
          
          em.getTransaction().commit();
          em.close();
    
    }
      public List<Tratamento> buscaDados(){
          EntityManager em = new ConnectFactory().getConnection();
          
            em.getTransaction().begin();
            List<Tratamento> tratar;
            
          // esse select faz um select na base na tabela Diretor get result list transforma a query em list
          
          tratar = em.createQuery("From Tratamento").getResultList();
          em.close();
          
          // por não ser void ele tem que retornar um valor
          return tratar;
      }
      public void deletar (int id){
        EntityManager em = new ConnectFactory().getConnection();
        
        em.getTransaction().begin();
        
        Tratamento t1 = em.find(Tratamento.class, id);
        em.remove(t1);
        em.getTransaction().commit();
        em.close();

     
     }
}
