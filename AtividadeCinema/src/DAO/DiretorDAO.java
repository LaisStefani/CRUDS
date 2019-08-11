/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import FACTORY.ConnectionFactory;
import MODEL.Tbl_Ator;
import MODEL.Tbl_Diretor;
import java.util.List;
import javax.persistence.EntityManager;

/**
 *
 * @author lalam
 */
public class DiretorDAO {

    public void inserir(MODEL.Tbl_Diretor cadastro) {
        EntityManager em = new ConnectionFactory().getConnection();

        em.getTransaction().begin();
        em.persist(cadastro);

        em.getTransaction().commit();
        em.close();
    }

    public List<Tbl_Diretor> buscaDados() {
        EntityManager em = new ConnectionFactory().getConnection();

        em.getTransaction().begin();
        List<Tbl_Diretor> diretores;

        diretores = em.createQuery("from Tbl_Diretor").getResultList();
        em.close();
        return diretores;
    }

    public void deletar(int id) {
        EntityManager em = new ConnectionFactory().getConnection();

        em.getTransaction().begin();
        Tbl_Diretor d1 = em.find(Tbl_Diretor.class, id);
        em.remove(d1);
        em.getTransaction().commit();
        em.close();
    }

    public void atualizar(int id, String nome, String nacionalidade, String dt_nascimento) {
        EntityManager em = new ConnectionFactory().getConnection();

        em.getTransaction().begin();
        Tbl_Diretor diretor1 = em.find(Tbl_Diretor.class, id);
        diretor1.setNome_diretor(nome);
        diretor1.setNome_diretor(nacionalidade);
//        diretor1.setNome_diretor(dt_nascimento);
        em.getTransaction().commit();
        em.close();
    }

}
