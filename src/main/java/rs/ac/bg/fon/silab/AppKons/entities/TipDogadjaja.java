/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rs.ac.bg.fon.silab.AppKons.entities;

import com.fasterxml.jackson.annotation.JsonBackReference;
import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Collection;
import javax.persistence.Basic;
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
@Table(name = "TIP_DOGADJAJA")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "TipDogadjaja.findAll", query = "SELECT t FROM TipDogadjaja t"),
    @NamedQuery(name = "TipDogadjaja.findByIdTipaDogadjaja", query = "SELECT t FROM TipDogadjaja t WHERE t.idTipaDogadjaja = :idTipaDogadjaja"),
    @NamedQuery(name = "TipDogadjaja.findByNazivTipaDogadjaja", query = "SELECT t FROM TipDogadjaja t WHERE t.nazivTipaDogadjaja = :nazivTipaDogadjaja")})
public class TipDogadjaja implements Serializable {

    private static final long serialVersionUID = 1L;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Id
    @Basic(optional = false)
    @Column(name = "ID_TIPA_DOGADJAJA")
    private BigDecimal idTipaDogadjaja;
    @Column(name = "NAZIV_TIPA_DOGADJAJA")
    private String nazivTipaDogadjaja;
    @OneToMany(mappedBy = "idTipaDogadjaja")
    @JsonBackReference(value = "dogadjajCollection")

    private Collection<Dogadjaj> dogadjajCollection;

    public TipDogadjaja() {
    }

    public TipDogadjaja(BigDecimal idTipaDogadjaja) {
        this.idTipaDogadjaja = idTipaDogadjaja;
    }

    public BigDecimal getIdTipaDogadjaja() {
        return idTipaDogadjaja;
    }

    public void setIdTipaDogadjaja(BigDecimal idTipaDogadjaja) {
        this.idTipaDogadjaja = idTipaDogadjaja;
    }

    public String getNazivTipaDogadjaja() {
        return nazivTipaDogadjaja;
    }

    public void setNazivTipaDogadjaja(String nazivTipaDogadjaja) {
        this.nazivTipaDogadjaja = nazivTipaDogadjaja;
    }

    @XmlTransient
    public Collection<Dogadjaj> getDogadjajCollection() {
        return dogadjajCollection;
    }

    public void setDogadjajCollection(Collection<Dogadjaj> dogadjajCollection) {
        this.dogadjajCollection = dogadjajCollection;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idTipaDogadjaja != null ? idTipaDogadjaja.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof TipDogadjaja)) {
            return false;
        }
        TipDogadjaja other = (TipDogadjaja) object;
        if ((this.idTipaDogadjaja == null && other.idTipaDogadjaja != null) || (this.idTipaDogadjaja != null && !this.idTipaDogadjaja.equals(other.idTipaDogadjaja))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.diplomski.classes.TipDogadjaja[ idTipaDogadjaja=" + idTipaDogadjaja + " ]";
    }

}
