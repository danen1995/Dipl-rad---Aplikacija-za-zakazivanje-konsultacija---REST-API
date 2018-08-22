/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rs.ac.bg.fon.silab.AppKons.entities;

import java.io.Serializable;
import java.math.BigInteger;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Embeddable;

/**
 *
 * @author Dane
 */
@Embeddable
public class StudentKonsultacijePK implements Serializable {

    @Basic(optional = false)
    @Column(name = "ID_KALENDARA")
    private BigInteger idKalendara;
    @Basic(optional = false)
    @Column(name = "ID_DOGADJAJA")
    private BigInteger idDogadjaja;
    @Basic(optional = false)
    @Column(name = "BROJ_INDEKSA_STUDENTA")
    private String brojIndeksaStudenta;

    public StudentKonsultacijePK() {
    }

    public StudentKonsultacijePK(BigInteger idKalendara, BigInteger idDogadjaja, String brojIndeksaStudenta) {
        this.idKalendara = idKalendara;
        this.idDogadjaja = idDogadjaja;
        this.brojIndeksaStudenta = brojIndeksaStudenta;
    }

    public BigInteger getIdKalendara() {
        return idKalendara;
    }

    public void setIdKalendara(BigInteger idKalendara) {
        this.idKalendara = idKalendara;
    }

    public BigInteger getIdDogadjaja() {
        return idDogadjaja;
    }

    public void setIdDogadjaja(BigInteger idDogadjaja) {
        this.idDogadjaja = idDogadjaja;
    }

    public String getBrojIndeksaStudenta() {
        return brojIndeksaStudenta;
    }

    public void setBrojIndeksaStudenta(String brojIndeksaStudenta) {
        this.brojIndeksaStudenta = brojIndeksaStudenta;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idKalendara != null ? idKalendara.hashCode() : 0);
        hash += (idDogadjaja != null ? idDogadjaja.hashCode() : 0);
        hash += (brojIndeksaStudenta != null ? brojIndeksaStudenta.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof StudentKonsultacijePK)) {
            return false;
        }
        StudentKonsultacijePK other = (StudentKonsultacijePK) object;
        if ((this.idKalendara == null && other.idKalendara != null) || (this.idKalendara != null && !this.idKalendara.equals(other.idKalendara))) {
            return false;
        }
        if ((this.idDogadjaja == null && other.idDogadjaja != null) || (this.idDogadjaja != null && !this.idDogadjaja.equals(other.idDogadjaja))) {
            return false;
        }
        if ((this.brojIndeksaStudenta == null && other.brojIndeksaStudenta != null) || (this.brojIndeksaStudenta != null && !this.brojIndeksaStudenta.equals(other.brojIndeksaStudenta))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.diplomski.classes.StudentKonsultacijePK[ idKalendara=" + idKalendara + ", idDogadjaja=" + idDogadjaja + ", brojIndeksaStudenta=" + brojIndeksaStudenta + " ]";
    }
    
}
