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
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.JoinColumns;
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
@Table(name = "STUDENT_KONSULTACIJE")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "StudentKonsultacije.findAll", query = "SELECT s FROM StudentKonsultacije s"),
    @NamedQuery(name = "StudentKonsultacije.findByIdKalendara", query = "SELECT s FROM StudentKonsultacije s WHERE s.studentKonsultacijePK.idKalendara = :idKalendara"),
    @NamedQuery(name = "StudentKonsultacije.findByIdDogadjaja", query = "SELECT s FROM StudentKonsultacije s WHERE s.studentKonsultacijePK.idDogadjaja = :idDogadjaja"),
    @NamedQuery(name = "StudentKonsultacije.findByBrojIndeksaStudenta", query = "SELECT s FROM StudentKonsultacije s WHERE s.studentKonsultacijePK.brojIndeksaStudenta = ?"),
    @NamedQuery(name = "StudentKonsultacije.findByStatus", query = "SELECT s FROM StudentKonsultacije s WHERE s.status = :status"),
    @NamedQuery(name = "StudentKonsultacije.findByNaslov", query = "SELECT s FROM StudentKonsultacije s WHERE s.naslov = :naslov"),
    @NamedQuery(name = "StudentKonsultacije.findByOpis", query = "SELECT s FROM StudentKonsultacije s WHERE s.opis = :opis")})
public class StudentKonsultacije implements Serializable {

    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected StudentKonsultacijePK studentKonsultacijePK;
    @Column(name = "STATUS")
    private String status;
    @Column(name = "NASLOV")
    private String naslov;
    @Column(name = "OPIS")
    private String opis;
    @OneToMany(mappedBy = "studentKonsultacije")
    @JsonBackReference(value = "prilogCollection")
    private Collection<Prilog> prilogCollection;
    @JoinColumns({
        @JoinColumn(name = "ID_KALENDARA", referencedColumnName = "ID_KALENDARA", insertable = false, updatable = false),
        @JoinColumn(name = "ID_DOGADJAJA", referencedColumnName = "ID_DOGADJAJA", insertable = false, updatable = false)})
    @ManyToOne(optional = false)
    private Konsultacije konsultacije;
    @JoinColumn(name = "BROJ_INDEKSA_STUDENTA", referencedColumnName = "BROJ_INDEKSA", insertable = false, updatable = false)
    @ManyToOne(optional = false)
    private Student student;

    public StudentKonsultacije() {
    }

    public StudentKonsultacije(StudentKonsultacijePK studentKonsultacijePK) {
        this.studentKonsultacijePK = studentKonsultacijePK;
    }

    public StudentKonsultacije(BigInteger idKalendara, BigInteger idDogadjaja, String brojIndeksaStudenta) {
        this.studentKonsultacijePK = new StudentKonsultacijePK(idKalendara, idDogadjaja, brojIndeksaStudenta);
    }

    public StudentKonsultacijePK getStudentKonsultacijePK() {
        return studentKonsultacijePK;
    }

    public void setStudentKonsultacijePK(StudentKonsultacijePK studentKonsultacijePK) {
        this.studentKonsultacijePK = studentKonsultacijePK;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getNaslov() {
        return naslov;
    }

    public void setNaslov(String naslov) {
        this.naslov = naslov;
    }

    public String getOpis() {
        return opis;
    }

    public void setOpis(String opis) {
        this.opis = opis;
    }

    @XmlTransient
    public Collection<Prilog> getPrilogCollection() {
        return prilogCollection;
    }

    public void setPrilogCollection(Collection<Prilog> prilogCollection) {
        this.prilogCollection = prilogCollection;
    }

    public Konsultacije getKonsultacije() {
        return konsultacije;
    }

    public void setKonsultacije(Konsultacije konsultacije) {
        this.konsultacije = konsultacije;
    }

    public Student getStudent() {
        return student;
    }

    public void setStudent(Student student) {
        this.student = student;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (studentKonsultacijePK != null ? studentKonsultacijePK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof StudentKonsultacije)) {
            return false;
        }
        StudentKonsultacije other = (StudentKonsultacije) object;
        if ((this.studentKonsultacijePK == null && other.studentKonsultacijePK != null) || (this.studentKonsultacijePK != null && !this.studentKonsultacijePK.equals(other.studentKonsultacijePK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.diplomski.classes.StudentKonsultacije[ studentKonsultacijePK=" + studentKonsultacijePK + " ]";
    }

}
