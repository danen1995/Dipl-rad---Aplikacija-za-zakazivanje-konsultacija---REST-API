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
@Table(name = "SKOLSKA_GODINA")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "SkolskaGodina.findAll", query = "SELECT s FROM SkolskaGodina s"),
    @NamedQuery(name = "SkolskaGodina.findByIdSkolskeGodine", query = "SELECT s FROM SkolskaGodina s WHERE s.idSkolskeGodine = :idSkolskeGodine"),
    @NamedQuery(name = "SkolskaGodina.findBySkolskaGodina", query = "SELECT s FROM SkolskaGodina s WHERE s.skolskaGodina = :skolskaGodina"),
    @NamedQuery(name = "SkolskaGodina.findBySemestar", query = "SELECT s FROM SkolskaGodina s WHERE s.semestar = :semestar")})
public class SkolskaGodina implements Serializable {

    private static final long serialVersionUID = 1L;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Id
    @Basic(optional = false)
    @Column(name = "ID_SKOLSKE_GODINE")
    private BigDecimal idSkolskeGodine;
    @Column(name = "SKOLSKA_GODINA")
    private String skolskaGodina;
    @Column(name = "SEMESTAR")
    private String semestar;
    @OneToMany(mappedBy = "idSkolskeGodine")
    @JsonBackReference(value = "pokrivenostNastaveCollection")
    private Collection<PokrivenostNastave> pokrivenostNastaveCollection;
    @OneToMany(mappedBy = "idSkolskeGodine")
    @JsonBackReference(value = "kalendarCollection2")
    private Collection<Kalendar> kalendarCollection;

    public SkolskaGodina() {
    }

    public SkolskaGodina(BigDecimal idSkolskeGodine) {
        this.idSkolskeGodine = idSkolskeGodine;
    }

    public BigDecimal getIdSkolskeGodine() {
        return idSkolskeGodine;
    }

    public void setIdSkolskeGodine(BigDecimal idSkolskeGodine) {
        this.idSkolskeGodine = idSkolskeGodine;
    }

    public String getSkolskaGodina() {
        return skolskaGodina;
    }

    public void setSkolskaGodina(String skolskaGodina) {
        this.skolskaGodina = skolskaGodina;
    }

    public String getSemestar() {
        return semestar;
    }

    public void setSemestar(String semestar) {
        this.semestar = semestar;
    }

    @XmlTransient
    public Collection<PokrivenostNastave> getPokrivenostNastaveCollection() {
        return pokrivenostNastaveCollection;
    }

    public void setPokrivenostNastaveCollection(Collection<PokrivenostNastave> pokrivenostNastaveCollection) {
        this.pokrivenostNastaveCollection = pokrivenostNastaveCollection;
    }

    @XmlTransient
    public Collection<Kalendar> getKalendarCollection() {
        return kalendarCollection;
    }

    public void setKalendarCollection(Collection<Kalendar> kalendarCollection) {
        this.kalendarCollection = kalendarCollection;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idSkolskeGodine != null ? idSkolskeGodine.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof SkolskaGodina)) {
            return false;
        }
        SkolskaGodina other = (SkolskaGodina) object;
        if ((this.idSkolskeGodine == null && other.idSkolskeGodine != null) || (this.idSkolskeGodine != null && !this.idSkolskeGodine.equals(other.idSkolskeGodine))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.diplomski.classes.SkolskaGodina[ idSkolskeGodine=" + idSkolskeGodine + " ]";
    }

}
