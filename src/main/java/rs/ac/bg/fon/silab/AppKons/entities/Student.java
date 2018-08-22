/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rs.ac.bg.fon.silab.AppKons.entities;

import com.fasterxml.jackson.annotation.JsonBackReference;
import java.io.Serializable;
import java.util.Collection;
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
@Table(name = "STUDENT")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Student.findAll", query = "SELECT s FROM Student s"),
    @NamedQuery(name = "Student.findByBrojIndeksa", query = "SELECT s FROM Student s WHERE s.brojIndeksa = :brojIndeksa"),
    @NamedQuery(name = "Student.findByIme", query = "SELECT s FROM Student s WHERE s.ime = :ime"),
    @NamedQuery(name = "Student.findByPrezime", query = "SELECT s FROM Student s WHERE s.prezime = :prezime"),
    @NamedQuery(name = "Student.findByGodinaUpisa", query = "SELECT s FROM Student s WHERE s.godinaUpisa = :godinaUpisa"),
    @NamedQuery(name = "Student.findBySmer", query = "SELECT s FROM Student s WHERE s.smer = :smer"),
    @NamedQuery(name = "Student.findByBrojTelefona", query = "SELECT s FROM Student s WHERE s.brojTelefona = :brojTelefona"),
    @NamedQuery(name = "Student.findByEmail", query = "SELECT s FROM Student s WHERE s.email = :email")})
public class Student implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "BROJ_INDEKSA")
    private String brojIndeksa;
    @Column(name = "IME")
    private String ime;
    @Column(name = "PREZIME")
    private String prezime;
    @Column(name = "GODINA_UPISA")
    private Short godinaUpisa;
    @Column(name = "SMER")
    private String smer;
    @Column(name = "BROJ_TELEFONA")
    private String brojTelefona;
    @Column(name = "EMAIL")
    private String email;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "student")
    @JsonBackReference(value = "studentKonsultacijeCollection")
    private Collection<StudentKonsultacije> studentKonsultacijeCollection;
    @OneToMany(mappedBy = "student")
    @JsonBackReference(value = "korisnickiNalogCollection")
    private Collection<KorisnickiNalog> korisnickiNalogCollection;

    public Student() {
    }

    public Student(String brojIndeksa) {
        this.brojIndeksa = brojIndeksa;
    }

    public String getBrojIndeksa() {
        return brojIndeksa;
    }

    public void setBrojIndeksa(String brojIndeksa) {
        this.brojIndeksa = brojIndeksa;
    }

    public String getIme() {
        return ime;
    }

    public void setIme(String ime) {
        this.ime = ime;
    }

    public String getPrezime() {
        return prezime;
    }

    public void setPrezime(String prezime) {
        this.prezime = prezime;
    }

    public Short getGodinaUpisa() {
        return godinaUpisa;
    }

    public void setGodinaUpisa(Short godinaUpisa) {
        this.godinaUpisa = godinaUpisa;
    }

    public String getSmer() {
        return smer;
    }

    public void setSmer(String smer) {
        this.smer = smer;
    }

    public String getBrojTelefona() {
        return brojTelefona;
    }

    public void setBrojTelefona(String brojTelefona) {
        this.brojTelefona = brojTelefona;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @XmlTransient
    public Collection<StudentKonsultacije> getStudentKonsultacijeCollection() {
        return studentKonsultacijeCollection;
    }

    public void setStudentKonsultacijeCollection(Collection<StudentKonsultacije> studentKonsultacijeCollection) {
        this.studentKonsultacijeCollection = studentKonsultacijeCollection;
    }

    @XmlTransient
    public Collection<KorisnickiNalog> getKorisnickiNalogCollection() {
        return korisnickiNalogCollection;
    }

    public void setKorisnickiNalogCollection(Collection<KorisnickiNalog> korisnickiNalogCollection) {
        this.korisnickiNalogCollection = korisnickiNalogCollection;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (brojIndeksa != null ? brojIndeksa.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Student)) {
            return false;
        }
        Student other = (Student) object;
        if ((this.brojIndeksa == null && other.brojIndeksa != null) || (this.brojIndeksa != null && !this.brojIndeksa.equals(other.brojIndeksa))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.diplomski.classes.Student[ brojIndeksa=" + brojIndeksa + " ]";
    }

}
