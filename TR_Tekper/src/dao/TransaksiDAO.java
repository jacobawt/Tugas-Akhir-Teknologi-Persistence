/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import connection.Connection;
import entity.Transaksi;
import java.util.List;
import javax.persistence.EntityManager;

public class TransaksiDAO {

    public static void insert(Transaksi t) {
        try {
            EntityManager em = Connection.GetEntityManager();
            em.getTransaction().begin();
            em.persist(t);
            em.getTransaction().commit();
        } catch (Exception e) {
        }
    }

    public static void update(Transaksi t) {
        try {
            EntityManager em = Connection.GetEntityManager();
            em.getTransaction().begin();
            em.merge(t);
            em.getTransaction().commit();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void delete(Transaksi t) {
        try {
            EntityManager em = Connection.GetEntityManager();
            em.getTransaction().begin();
            Transaksi temp = em.merge(t);
            em.remove(temp);
            em.getTransaction().commit();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static List<Transaksi> getTransaksi() {
        EntityManager em = Connection.GetEntityManager();
//        return em.createQuery("SELECT id_user p FROM users p WHERE p nama='markus' AND pasword='markus'" ).getResultList();
        return em.createQuery("SELECT p FROM Transaksi p").getResultList();
    }

}
