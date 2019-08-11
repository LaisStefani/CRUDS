/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TESTES;

import FACTORY.ConnectionFactory;
import MODEL.Tbl_Ator;
import MODEL.Tbl_Filme;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

/**
 *
 * @author lalam
 */
public class Relacionamento {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        EntityManager em = new ConnectionFactory().getConnection();
        em.getTransaction().begin();

        //BUSCANDO AS INFORMAÇÕES DE ATORES NO BANCO
        Tbl_Ator relacao_ator1 = em.find(Tbl_Ator.class, 1);
        Tbl_Filme relacao_filme1 = em.find(Tbl_Filme.class, 1);

        Tbl_Ator relacao_ator2 = em.find(Tbl_Ator.class, 2);
        Tbl_Filme relacao_filme2 = em.find(Tbl_Filme.class, 2);

        //RELACIONANDO ATORES E FILMES
        //filme de ID1
        relacao_ator1.getList_filme().add(relacao_filme1);
        relacao_filme1.getList_ator().add(relacao_ator1);

        relacao_ator1.getList_filme().add(relacao_filme2);
        relacao_filme1.getList_ator().add(relacao_ator2);

        em.persist(relacao_filme1);
        em.persist(relacao_ator1);

        //Encerra a conexão
        em.getTransaction().commit();
        em.close();

    }
}
