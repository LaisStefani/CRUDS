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
public class AtorDAO {

    public void inserir(MODEL.Tbl_Ator cadastro) {// metodo inserir será usado na DAO
        EntityManager em = new ConnectionFactory().getConnection();

        em.getTransaction().begin();
        em.persist(cadastro);

        em.getTransaction().commit();
        em.close();
    }
}

 /**   //salvar
    public Tbl_Ator inserir(Tbl_Ator ator) {

        EntityManager em = new ConnectionFactory().getConnection();

        try {
            em.getTransaction().begin();
            em.persist(ator);
            em.getTransaction().commit();
        } catch (Exception e) {
            em.getTransaction().rollback();
        } finally {
            em.close();
        }

        return ator;
    }

    //update 
    public Tbl_Ator update(Tbl_Ator ator) {

        EntityManager em = new ConnectionFactory().getConnection();

        try {
            em.getTransaction().begin();
            if (ator.getId_ator() == null) {
                em.persist(ator);
            } else {
                em.merge(ator);
            }
            em.getTransaction().commit();
        } catch (Exception e) {
            System.err.println(e);
            em.getTransaction().rollback();
        } finally {
            em.close();
        }

        return ator;
    }

    //Busca individual
    public Tbl_Ator findById(Integer id) {
        EntityManager em = new ConnectionFactory().getConnection();
        Tbl_Ator ator = null;

        try {
            ator = em.find(Tbl_Ator.class, id);
        } catch (Exception e) {
            System.err.println(e);
        } finally {
            em.close();
        }

        return ator;
    }

    //Buscando todos os registros
    public List<Tbl_Ator> findAll() {
        EntityManager em = new ConnectionFactory().getConnection();
        List<Tbl_Ator> ator = null;

        try {
            ator = em.createQuery("from Tbl_Ator c").getResultList();
        } catch (Exception e) {
            System.err.println(e);
        } finally {
            em.close();
        }
        return ator;
    }

    //Removendo os dados
    public Tbl_Ator remove(Integer id) {
        EntityManager em = new ConnectionFactory().getConnection();
        Tbl_Ator ator = null;
        
        try {
            ator = em.find(Tbl_Ator.class, id);
            
            em.getTransaction().begin();
            em.remove(ator);
            em.getTransaction().commit();
        
        } catch (Exception e) {
            System.err.println(e);
            em.getTransaction().rollback();
        } finally {
            em.close();
        }
        return ator;
    }

}
 */
