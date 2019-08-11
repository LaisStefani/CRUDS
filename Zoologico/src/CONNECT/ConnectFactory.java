/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CONNECT;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
/**
 *
 * @author NIDE08
 */
public class ConnectFactory {
     public static EntityManagerFactory emf = Persistence.createEntityManagerFactory("zoo");
    
    public EntityManager getConnection(){
    
        return emf.createEntityManager();
    }

}
