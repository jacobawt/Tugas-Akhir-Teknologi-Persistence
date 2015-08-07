/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import connection.Connection;
import entity.Users;
import java.util.List;
import javax.persistence.EntityManager;

/**
 *
 * @author Markus
 */
public class UserDAO {

    public static void insert(Users p) {
        try {
            EntityManager em = Connection.GetEntityManager();
            em.getTransaction().begin();
            em.persist(p);
            em.getTransaction().commit();
        } catch (Exception e) {
            e.printStackTrace();

        }
    }

    public static void update(Users p) {
        try {
            EntityManager em = Connection.GetEntityManager();
            em.getTransaction().begin();
            em.merge(p);
            em.getTransaction().commit();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void delete(Users p) {
        try {
            EntityManager em = Connection.GetEntityManager();
            em.getTransaction().begin();
            Users temp = em.merge(p);
            em.remove(temp);
            em.getTransaction().commit();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static List<Users> getPersons() {
        EntityManager em = Connection.GetEntityManager();
//        return em.createQuery("SELECT id_user p FROM users p WHERE p nama='markus' AND pasword='markus'" ).getResultList();
        return em.createQuery("SELECT p FROM Users p").getResultList();
    }
}
