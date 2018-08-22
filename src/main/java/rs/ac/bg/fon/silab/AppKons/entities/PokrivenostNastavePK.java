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
public class PokrivenostNastavePK implements Serializable {

    @Basic(optional = false)
    @Column(name = "JMBG_NASTAVNIKA")
    private String jmbgNastavnika;
    @Basic(optional = false)
    @Column(name = "ID_PREDMETA")
    private BigInteger idPredmeta;

    public PokrivenostNastavePK() {
    }

    public PokrivenostNastavePK(String jmbgNastavnika, BigInteger idPredmeta) {
        this.jmbgNastavnika = jmbgNastavnika;
        this.idPredmeta = idPredmeta;
    }

    public String getJmbgNastavnika() {
        return jmbgNastavnika;
    }

    public void setJmbgNastavnika(String jmbgNastavnika) {
        this.jmbgNastavnika = jmbgNastavnika;
    }

    public BigInteger getIdPredmeta() {
        return idPredmeta;
    }

    public void setIdPredmeta(BigInteger idPredmeta) {
        this.idPredmeta = idPredmeta;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (jmbgNastavnika != null ? jmbgNastavnika.hashCode() : 0);
        hash += (idPredmeta != null ? idPredmeta.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof PokrivenostNastavePK)) {
            return false;
        }
        PokrivenostNastavePK other = (PokrivenostNastavePK) object;
        if ((this.jmbgNastavnika == null && other.jmbgNastavnika != null) || (this.jmbgNastavnika != null && !this.jmbgNastavnika.equals(other.jmbgNastavnika))) {
            return false;
        }
        if ((this.idPredmeta == null && other.idPredmeta != null) || (this.idPredmeta != null && !this.idPredmeta.equals(other.idPredmeta))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.diplomski.classes.PokrivenostNastavePK[ jmbgNastavnika=" + jmbgNastavnika + ", idPredmeta=" + idPredmeta + " ]";
    }
    
}
