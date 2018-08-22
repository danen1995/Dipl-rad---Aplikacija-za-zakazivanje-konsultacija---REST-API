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
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
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
@Table(name = "KALENDAR")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Kalendar.findAll", query = "SELECT k FROM Kalendar k"),
    @NamedQuery(name = "Kalendar.findByIdKalendara", query = "SELECT k FROM Kalendar k WHERE k.idKalendara = :idKalendara")})
public class Kalendar implements Serializable {

    private static final long serialVersionUID = 1L;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Id
    @Basic(optional = false)
    @Column(name = "ID_KALENDARA")
    private BigDecimal idKalendara;
    @JoinColumn(name = "JMBG_NASTAVNIKA", referencedColumnName = "JMBG")
    @ManyToOne
    private Nastavnik nastavnik;
    @JoinColumn(name = "ID_SKOLSKE_GODINE", referencedColumnName = "ID_SKOLSKE_GODINE")
    @ManyToOne
    private SkolskaGodina idSkolskeGodine;
    @JsonBackReference(value = "dogadjajCollection")
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "kalendar")
    private Collection<Dogadjaj> dogadjajCollection;

    public Kalendar() {
    }

    public Kalendar(BigDecimal idKalendara) {
        this.idKalendara = idKalendara;
    }

    public BigDecimal getIdKalendara() {
        return idKalendara;
    }

    public void setIdKalendara(BigDecimal idKalendara) {
        this.idKalendara = idKalendara;
    }

    public Nastavnik getNastavnik() {
        return nastavnik;
    }

    public void setNastavnik(Nastavnik nastavnik) {
        this.nastavnik = nastavnik;
    }

    public SkolskaGodina getIdSkolskeGodine() {
        return idSkolskeGodine;
    }

    public void setIdSkolskeGodine(SkolskaGodina idSkolskeGodine) {
        this.idSkolskeGodine = idSkolskeGodine;
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
        hash += (idKalendara != null ? idKalendara.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Kalendar)) {
            return false;
        }
        Kalendar other = (Kalendar) object;
        if ((this.idKalendara == null && other.idKalendara != null) || (this.idKalendara != null && !this.idKalendara.equals(other.idKalendara))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.diplomski.classes.Kalendar[ idKalendara=" + idKalendara + " ]";
    }

}
