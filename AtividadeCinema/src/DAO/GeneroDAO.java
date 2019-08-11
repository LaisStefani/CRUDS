/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import FACTORY.ConnectionFactory;
import javax.persistence.EntityManager;

/**
 *
 * @author lalam
 */
public class GeneroDAO {
    //salvar
    public void inserir(MODEL.Tbl_Genero cadastro) {
        EntityManager em = new ConnectionFactory().getConnection();

        em.getTransaction().begin();
        em.persist(cadastro);

        em.getTransaction().commit();
        em.close();
    }
}
