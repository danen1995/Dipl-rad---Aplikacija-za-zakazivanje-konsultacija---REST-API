/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rs.ac.bg.fon.silab.AppKons.entities;

import java.io.Serializable;
import java.math.BigInteger;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author Dane
 */
@Entity
@Table(name = "POKRIVENOST_NASTAVE")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "PokrivenostNastave.findAll", query = "SELECT p FROM PokrivenostNastave p"),
    @NamedQuery(name = "PokrivenostNastave.findByJmbgNastavnika", query = "SELECT p FROM PokrivenostNastave p WHERE p.pokrivenostNastavePK.jmbgNastavnika = ?"),
    @NamedQuery(name = "PokrivenostNastave.findByIdPredmeta", query = "SELECT p FROM PokrivenostNastave p WHERE p.pokrivenostNastavePK.idPredmeta = :idPredmeta"),
    @NamedQuery(name = "PokrivenostNastave.findByUloga", query = "SELECT p FROM PokrivenostNastave p WHERE p.uloga = :uloga")})
public class PokrivenostNastave implements Serializable {

    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected PokrivenostNastavePK pokrivenostNastavePK;
    @Column(name = "ULOGA")
    private String uloga;
    @JoinColumn(name = "JMBG_NASTAVNIKA", referencedColumnName = "JMBG", insertable = false, updatable = false)
    @ManyToOne(optional = false)
    private Nastavnik nastavnik;
    @JoinColumn(name = "ID_PREDMETA", referencedColumnName = "ID_PREDMETA", insertable = false, updatable = false)
    @ManyToOne(optional = false)
    private Predmet predmet;
    @JoinColumn(name = "ID_SKOLSKE_GODINE", referencedColumnName = "ID_SKOLSKE_GODINE")
    @ManyToOne
    private SkolskaGodina idSkolskeGodine;

    public PokrivenostNastave() {
    }

    public PokrivenostNastave(PokrivenostNastavePK pokrivenostNastavePK) {
        this.pokrivenostNastavePK = pokrivenostNastavePK;
    }

    public PokrivenostNastave(String jmbgNastavnika, BigInteger idPredmeta) {
        this.pokrivenostNastavePK = new PokrivenostNastavePK(jmbgNastavnika, idPredmeta);
    }

    public PokrivenostNastavePK getPokrivenostNastavePK() {
        return pokrivenostNastavePK;
    }

    public void setPokrivenostNastavePK(PokrivenostNastavePK pokrivenostNastavePK) {
        this.pokrivenostNastavePK = pokrivenostNastavePK;
    }

    public String getUloga() {
        return uloga;
    }

    public void setUloga(String uloga) {
        this.uloga = uloga;
    }

    public Nastavnik getNastavnik() {
        return nastavnik;
    }

    public void setNastavnik(Nastavnik nastavnik) {
        this.nastavnik = nastavnik;
    }

    public Predmet getPredmet() {
        return predmet;
    }

    public void setPredmet(Predmet predmet) {
        this.predmet = predmet;
    }

    public SkolskaGodina getIdSkolskeGodine() {
        return idSkolskeGodine;
    }

    public void setIdSkolskeGodine(SkolskaGodina idSkolskeGodine) {
        this.idSkolskeGodine = idSkolskeGodine;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (pokrivenostNastavePK != null ? pokrivenostNastavePK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof PokrivenostNastave)) {
            return false;
        }
        PokrivenostNastave other = (PokrivenostNastave) object;
        if ((this.pokrivenostNastavePK == null && other.pokrivenostNastavePK != null) || (this.pokrivenostNastavePK != null && !this.pokrivenostNastavePK.equals(other.pokrivenostNastavePK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.diplomski.classes.PokrivenostNastave[ pokrivenostNastavePK=" + pokrivenostNastavePK + " ]";
    }
    
}
