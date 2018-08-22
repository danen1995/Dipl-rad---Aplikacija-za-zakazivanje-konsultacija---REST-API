/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rs.ac.bg.fon.silab.AppKons.entities;

import com.fasterxml.jackson.annotation.JsonBackReference;
import java.io.Serializable;
import java.math.BigInteger;
import java.util.Collection;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author Dane
 */
@Entity
@DiscriminatorValue("2")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Konsultacije.findByKapacitet", query = "SELECT d FROM Konsultacije d WHERE d.kapacitet = :kapacitet"),
    @NamedQuery(name = "Konsultacije.findByBrojZakazanih", query = "SELECT d FROM Konsultacije d WHERE d.brojZakazanih = :brojZakazanih")})
public class Konsultacije extends Dogadjaj implements Serializable {

    @Column(name = "KAPACITET")
    private BigInteger kapacitet;
    @Column(name = "BROJ_ZAKAZANIH")
    private BigInteger brojZakazanih;
    @JsonBackReference(value = "studentKonsultacijeCollection")
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "konsultacije")
    private Collection<StudentKonsultacije> studentKonsultacijeCollection;

    public Konsultacije() {
    }

    public Konsultacije(DogadjajPK dogadjajPK) {
        this.dogadjajPK = dogadjajPK;
    }

    public Konsultacije(BigInteger idKalendara, BigInteger idDogadjaja) {
        this.dogadjajPK = new DogadjajPK(idKalendara, idDogadjaja);
    }

    public DogadjajPK getDogadjajPK() {
        return dogadjajPK;
    }

    public void setDogadjajPK(DogadjajPK dogadjajPK) {
        this.dogadjajPK = dogadjajPK;
    }

    public BigInteger getKapacitet() {
        return kapacitet;
    }

    public void setKapacitet(BigInteger kapacitet) {
        this.kapacitet = kapacitet;
    }

    public BigInteger getBrojZakazanih() {
        return brojZakazanih;
    }

    public void setBrojZakazanih(BigInteger brojZakazanih) {
        this.brojZakazanih = brojZakazanih;
    }

    @XmlTransient
    public Collection<StudentKonsultacije> getStudentKonsultacijeCollection() {
        return studentKonsultacijeCollection;
    }

    public void setStudentKonsultacijeCollection(Collection<StudentKonsultacije> studentKonsultacijeCollection) {
        this.studentKonsultacijeCollection = studentKonsultacijeCollection;
    }

}
