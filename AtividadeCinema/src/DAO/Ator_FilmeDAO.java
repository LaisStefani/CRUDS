/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import FACTORY.ConnectionFactory;
import MODEL.Tbl_Ator;
import MODEL.Tbl_Filme;
import javax.persistence.EntityManager;


/**
 *
 * @author lalam
 */
public class Ator_FilmeDAO {
    public void inserir(int id_ator, int id_filme){    

        EntityManager em = new ConnectionFactory().getConnection();
        
        Tbl_Ator a1 = em.find(Tbl_Ator.class, id_ator);
        Tbl_Filme f1 = em.find(Tbl_Filme.class, id_filme);
        
        em.getTransaction().begin();
        a1.getList_filme().add(f1);
        f1.getList_ator().add(a1);
        em.getTransaction().commit();
    }
}