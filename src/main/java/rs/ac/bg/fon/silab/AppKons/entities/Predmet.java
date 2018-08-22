/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rs.ac.bg.fon.silab.AppKons.entities;

import com.fasterxml.jackson.annotation.JsonBackReference;
import java.io.Serializable;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Collection;
import java.util.List;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author Dane
 */
@Entity
@Table(name = "PREDMET")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Predmet.findAll", query = "SELECT p FROM Predmet p"),
    @NamedQuery(name = "Predmet.findByIdPredmeta", query = "SELECT p FROM Predmet p WHERE p.idPredmeta = :idPredmeta"),
    @NamedQuery(name = "Predmet.findByNaziv", query = "SELECT p FROM Predmet p WHERE p.naziv = :naziv"),
    @NamedQuery(name = "Predmet.findByEspbBodovi", query = "SELECT p FROM Predmet p WHERE p.espbBodovi = :espbBodovi"),
    @NamedQuery(name = "Predmet.findByGodinaStudija", query = "SELECT p FROM Predmet p WHERE p.godinaStudija = :godinaStudija")})
public class Predmet implements Serializable {

    private static final long serialVersionUID = 1L;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Id
    @Basic(optional = false)
    @Column(name = "ID_PREDMETA")
    private BigDecimal idPredmeta;
    @Column(name = "NAZIV")
    private String naziv;
    @Column(name = "ESPB_BODOVI")
    private BigInteger espbBodovi;
    @Column(name = "GODINA_STUDIJA")
    private String godinaStudija;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "predmet")
    @JsonBackReference(value = "pokrivenostNastaveCollection")
    private List<PokrivenostNastave> pokrivenostNastaveCollection;
    @OneToMany(mappedBy = "idPredmeta")
    @JsonBackReference(value = "nastavaCollection")
    private Collection<Nastava> nastavaCollection;

    public Predmet() {
    }

    public Predmet(BigDecimal idPredmeta) {
        this.idPredmeta = idPredmeta;
    }

    public BigDecimal getIdPredmeta() {
        return idPredmeta;
    }

    public void setIdPredmeta(BigDecimal idPredmeta) {
        this.idPredmeta = idPredmeta;
    }

    public String getNaziv() {
        return naziv;
    }

    public void setNaziv(String naziv) {
        this.naziv = naziv;
    }

    public BigInteger getEspbBodovi() {
        return espbBodovi;
    }

    public void setEspbBodovi(BigInteger espbBodovi) {
        this.espbBodovi = espbBodovi;
    }

    public String getGodinaStudija() {
        return godinaStudija;
    }

    public void setGodinaStudija(String godinaStudija) {
        this.godinaStudija = godinaStudija;
    }

    @XmlTransient
    public Collection<PokrivenostNastave> getPokrivenostNastaveCollection() {
        return pokrivenostNastaveCollection;
    }

    public void setPokrivenostNastaveCollection(List<PokrivenostNastave> pokrivenostNastaveCollection) {
        this.pokrivenostNastaveCollection = pokrivenostNastaveCollection;
    }

    @XmlTransient
    public Collection<Nastava> getDogadjajCollection() {
        return nastavaCollection;
    }

    public void setDogadjajCollection(Collection<Nastava> dogadjajCollection) {
        this.nastavaCollection = dogadjajCollection;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idPredmeta != null ? idPredmeta.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Predmet)) {
            return false;
        }
        Predmet other = (Predmet) object;
        if ((this.idPredmeta == null && other.idPredmeta != null) || (this.idPredmeta != null && !this.idPredmeta.equals(other.idPredmeta))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.diplomski.classes.Predmet[ idPredmeta=" + idPredmeta + " ]";
    }

}
