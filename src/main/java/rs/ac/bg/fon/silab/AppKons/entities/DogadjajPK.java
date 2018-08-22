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
public class DogadjajPK implements Serializable {

    @Basic(optional = false)
    @Column(name = "ID_KALENDARA")
    private BigInteger idKalendara;
    @Basic(optional = false)
    @Column(name = "ID_DOGADJAJA")
    private BigInteger idDogadjaja;

    public DogadjajPK() {
    }

    public DogadjajPK(BigInteger idKalendara, BigInteger idDogadjaja) {
        this.idKalendara = idKalendara;
        this.idDogadjaja = idDogadjaja;
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

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idKalendara != null ? idKalendara.hashCode() : 0);
        hash += (idDogadjaja != null ? idDogadjaja.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof DogadjajPK)) {
            return false;
        }
        DogadjajPK other = (DogadjajPK) object;
        if ((this.idKalendara == null && other.idKalendara != null) || (this.idKalendara != null && !this.idKalendara.equals(other.idKalendara))) {
            return false;
        }
        if ((this.idDogadjaja == null && other.idDogadjaja != null) || (this.idDogadjaja != null && !this.idDogadjaja.equals(other.idDogadjaja))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.diplomski.classes.DogadjajPK[ idKalendara=" + idKalendara + ", idDogadjaja=" + idDogadjaja + " ]";
    }
    
}
