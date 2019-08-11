/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import FACTORY.ConnectionFactory;
import MODEL.Tbl_Diretor;
import MODEL.Tbl_Filme;
import MODEL.Tbl_Genero;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

/**
 *
 * @author lalam
 */
public class FilmeDAO {
    //salvar

    public void inserir(String nome_filmePT, String nome_filmeEN, String ano_lancamento, int duração, int diretor, int genero) {
       
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("AtividadeCinema");
      
        EntityManager em = emf.createEntityManager();
        
        
        Tbl_Genero g1 = em.find(Tbl_Genero.class,genero);
        Tbl_Diretor d1 = em.find(Tbl_Diretor.class,diretor);
        
        Tbl_Filme cadastro = new Tbl_Filme(nome_filmePT, nome_filmeEN,ano_lancamento,duração,g1,d1);
        
        em.getTransaction().begin();
        em.persist(cadastro);

        em.getTransaction().commit();
        em.close();
        
    }
}
