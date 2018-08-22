/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rs.ac.bg.fon.silab.AppKons.entities;

import java.io.Serializable;
import java.math.BigInteger;
import java.util.Date;
import javax.persistence.Column;
import javax.persistence.DiscriminatorColumn;
import javax.persistence.DiscriminatorType;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Inheritance;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author Dane
 */
@Entity
@Inheritance
@DiscriminatorColumn(name = "ID_TIPA_DOGADJAJA", discriminatorType = DiscriminatorType.INTEGER)
@Table(name = "DOGADJAJ")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Dogadjaj.findAll", query = "SELECT d FROM Dogadjaj d"),
    @NamedQuery(name = "Dogadjaj.findByIdKalendara", query = "SELECT d FROM Dogadjaj d WHERE d.dogadjajPK.idKalendara = :idKalendara"),
    @NamedQuery(name = "Dogadjaj.findByIdDogadjaja", query = "SELECT d FROM Dogadjaj d WHERE d.dogadjajPK.idDogadjaja = :idDogadjaja"),
    @NamedQuery(name = "Dogadjaj.findByDatumIVremePocetka", query = "SELECT d FROM Dogadjaj d WHERE d.datumIVremePocetka = :datumIVremePocetka"),
    @NamedQuery(name = "Dogadjaj.findByDatumIVremeZavrsetka", query = "SELECT d FROM Dogadjaj d WHERE d.datumIVremeZavrsetka = :datumIVremeZavrsetka"),
    @NamedQuery(name = "Dogadjaj.findByMestoOdrzavanja", query = "SELECT d FROM Dogadjaj d WHERE d.mestoOdrzavanja = :mestoOdrzavanja")})
public class Dogadjaj implements Serializable {

    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected DogadjajPK dogadjajPK;
    @Column(name = "DATUM_I_VREME_POCETKA")
    @Temporal(TemporalType.TIMESTAMP)
    private Date datumIVremePocetka;
    @Column(name = "DATUM_I_VREME_ZAVRSETKA")
    @Temporal(TemporalType.TIMESTAMP)
    private Date datumIVremeZavrsetka;
    @Column(name = "MESTO_ODRZAVANJA")
    private String mestoOdrzavanja;
    @JoinColumn(name = "ID_KALENDARA", referencedColumnName = "ID_KALENDARA", insertable = false, updatable = false)
    @ManyToOne(optional = false)
    private Kalendar kalendar;
    @JoinColumn(name = "ID_TIPA_DOGADJAJA", referencedColumnName = "ID_TIPA_DOGADJAJA", insertable = false,updatable = false)
    @ManyToOne
    private TipDogadjaja idTipaDogadjaja;

    public Dogadjaj() {
    }

    public Dogadjaj(DogadjajPK dogadjajPK) {
        this.dogadjajPK = dogadjajPK;
    }

    public Dogadjaj(BigInteger idKalendara, BigInteger idDogadjaja) {
        this.dogadjajPK = new DogadjajPK(idKalendara, idDogadjaja);
    }

    public DogadjajPK getDogadjajPK() {
        return dogadjajPK;
    }

    public void setDogadjajPK(DogadjajPK dogadjajPK) {
        this.dogadjajPK = dogadjajPK;
    }

    public Date getDatumIVremePocetka(){
        return datumIVremePocetka;
    }

    public void setDatumIVremePocetka(Date datumVremePocetka) {
        this.datumIVremePocetka = datumVremePocetka;
    }

    public Date getDatumIVremeZavrsetka() {
        return datumIVremeZavrsetka;
    }

    public void setDatumIVremeZavrsetka(Date datumIVremeZavrsetka) {
        this.datumIVremeZavrsetka = datumIVremeZavrsetka;
    }

    public String getMestoOdrzavanja() {
        return mestoOdrzavanja;
    }

    public void setMestoOdrzavanja(String mestoOdrzavanja) {
        this.mestoOdrzavanja = mestoOdrzavanja;
    }

    public Kalendar getKalendar() {
        return kalendar;
    }

    public void setKalendar(Kalendar kalendar) {
        this.kalendar = kalendar;
    }

    public TipDogadjaja getIdTipaDogadjaja() {
        return idTipaDogadjaja;
    }

    public void setIdTipaDogadjaja(TipDogadjaja idTipaDogadjaja) {
        this.idTipaDogadjaja = idTipaDogadjaja;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (dogadjajPK != null ? dogadjajPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Dogadjaj)) {
            return false;
        }
        Dogadjaj other = (Dogadjaj) object;
        if ((this.dogadjajPK == null && other.dogadjajPK != null) || (this.dogadjajPK != null && !this.dogadjajPK.equals(other.dogadjajPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.diplomski.classes.Dogadjaj[ dogadjajPK=" + dogadjajPK + " ]";
    }

}
