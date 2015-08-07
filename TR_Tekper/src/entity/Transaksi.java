/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package entity;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 *
 * @author Markus
 */
@Entity
public class Transaksi implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String id_transaksi;
    private String tanggal;
    private String plat_nomor;
    private String durasi;
    private String biaya;
    private String id_member;
    private String NIK;
    private String id_user;
    private String jam;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Transaksi)) {
            return false;
        }
        Transaksi other = (Transaksi) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entity.Transaksi[ id=" + id + " ]";
    }

    /**
     * @return the id_transaksi
     */
    public String getId_transaksi() {
        return id_transaksi;
    }

    /**
     * @param id_transaksi the id_transaksi to set
     */
    public void setId_transaksi(String id_transaksi) {
        this.id_transaksi = id_transaksi;
    }

    /**
     * @return the tanggal
     */
    public String getTanggal() {
        return tanggal;
    }

    /**
     * @param tanggal the tanggal to set
     */
    public void setTanggal(String tanggal) {
        this.tanggal = tanggal;
    }

    /**
     * @return the plat_nomor
     */
    public String getPlat_nomor() {
        return plat_nomor;
    }

    /**
     * @param plat_nomor the plat_nomor to set
     */
    public void setPlat_nomor(String plat_nomor) {
        this.plat_nomor = plat_nomor;
    }

    /**
     * @return the durasi
     */
    public String getDurasi() {
        return durasi;
    }

    /**
     * @param durasi the durasi to set
     */
    public void setDurasi(String durasi) {
        this.durasi = durasi;
    }

    /**
     * @return the biaya
     */
    public String getBiaya() {
        return biaya;
    }

    /**
     * @param biaya the biaya to set
     */
    public void setBiaya(String biaya) {
        this.biaya = biaya;
    }

    /**
     * @return the id_member
     */
    public String getId_member() {
        return id_member;
    }

    /**
     * @param id_member the id_member to set
     */
    public void setId_member(String id_member) {
        this.id_member = id_member;
    }

    /**
     * @return the NIK
     */
    public String getNIK() {
        return NIK;
    }

    /**
     * @param NIK the NIK to set
     */
    public void setNIK(String NIK) {
        this.NIK = NIK;
    }

    /**
     * @return the id_user
     */
    public String getId_user() {
        return id_user;
    }

    /**
     * @param id_user the id_user to set
     */
    public void setId_user(String id_user) {
        this.id_user = id_user;
    }

    /**
     * @return the jam
     */
    public String getJam() {
        return jam;
    }

    /**
     * @param jam the jam to set
     */
    public void setJam(String jam) {
        this.jam = jam;
    }
}
