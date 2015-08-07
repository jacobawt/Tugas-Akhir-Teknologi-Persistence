/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import connection.Connection;
import entity.Users;
import entity.listmobil;
import java.util.List;
import javax.persistence.EntityManager;


/**
 *
 * @author Markus
 */
public class list_mobil {
    
    public static void insert(listmobil p) {
        try {
            EntityManager em = Connection.GetEntityManager();
            em.getTransaction().begin();
            em.persist(p);
            em.getTransaction().commit();
        } catch (Exception e) {
            e.printStackTrace();

        }
    }

    public static void update(listmobil p) {
        try {
            EntityManager em = Connection.GetEntityManager();
            em.getTransaction().begin();
            em.merge(p);
            em.getTransaction().commit();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void delete(listmobil p) {
        try {
            EntityManager em = Connection.GetEntityManager();
            em.getTransaction().begin();
            listmobil temp = em.merge(p);
            em.remove(temp);
            em.getTransaction().commit();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static List<listmobil> GetlistMobil() {
        EntityManager em = Connection.GetEntityManager();
//        return em.createQuery("SELECT id_user p FROM users p WHERE p nama='markus' AND pasword='markus'" ).getResultList();
        return em.createQuery("SELECT p FROM listmobil p").getResultList();
    }

}
