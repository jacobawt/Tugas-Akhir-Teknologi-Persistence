/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package connection;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

/**
 *
 * @author Markus
 */
public class Connection {
 private static EntityManagerFactory emf=null;
    public static EntityManager GetEntityManager()
    {
        EntityManager em = null;
        
        try {
            emf=Persistence.createEntityManagerFactory("rentalmobilPU");
            em=emf.createEntityManager();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return em;
    }   
}
