/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rs.ac.bg.fon.silab.AppKons.entities;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Set;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
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
@Table(name = "KORISNICKI_NALOG")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "KorisnickiNalog.findAll", query = "SELECT k FROM KorisnickiNalog k"),
    @NamedQuery(name = "KorisnickiNalog.findByIdKorisnickogNaloga", query = "SELECT k FROM KorisnickiNalog k WHERE k.idKorisnickogNaloga = :idKorisnickogNaloga"),
    @NamedQuery(name = "KorisnickiNalog.findByKorisnickoIme", query = "SELECT k FROM KorisnickiNalog k WHERE k.korisnickoIme = :korisnickoIme"),
    @NamedQuery(name = "KorisnickiNalog.findByLozinka", query = "SELECT k FROM KorisnickiNalog k WHERE k.lozinka = :lozinka")})
public class KorisnickiNalog implements Serializable {

    private static final long serialVersionUID = 1L;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Id
    @Basic(optional = false)
    @Column(name = "ID_KOR_NAL")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private BigDecimal idKorisnickogNaloga;
    @Column(name = "KORISNICKO_IME")
    private String korisnickoIme;
    @Column(name = "LOZINKA")
    private String lozinka;
    @JoinColumn(name = "JMBG_NASTAVNIKA", referencedColumnName = "JMBG")
    @ManyToOne(optional = false)
    private Nastavnik nastavnik;
    @JoinColumn(name = "BROJ_INDEKSA_STUDENTA", referencedColumnName = "BROJ_INDEKSA")
    @ManyToOne
    private Student student;
//    @ElementCollection(fetch = FetchType.EAGER, targetClass = UserRoleEnum.class)
//    @Enumerated(EnumType.STRING)
//    private Set<UserRoleEnum> roles;

    public KorisnickiNalog() {
    }

    public KorisnickiNalog(BigDecimal idKorisnickogNaloga) {
        this.idKorisnickogNaloga = idKorisnickogNaloga;
    }

    public BigDecimal getIdKorisnickogNaloga() {
        return idKorisnickogNaloga;
    }

    public void setIdKorisnickogNaloga(BigDecimal idKorisnickogNaloga) {
        this.idKorisnickogNaloga = idKorisnickogNaloga;
    }

    public String getKorisnickoIme() {
        return korisnickoIme;
    }

    public void setKorisnickoIme(String korisnickoIme) {
        this.korisnickoIme = korisnickoIme;
    }

    public String getLozinka() {
        return lozinka;
    }

    public void setLozinka(String lozinka) {
        this.lozinka = lozinka;
    }

    public Nastavnik getNastavnik() {
        return nastavnik;
    }

    public void setNastavnik(Nastavnik nastavnik) {
        this.nastavnik = nastavnik;
    }

    public Student getStudent() {
        return student;
    }

    public void setStudent(Student student) {
        this.student = student;
    }

//    public Set<UserRoleEnum> getRoles() {
//        return roles;
//    }
//
//    public void setRoles(Set<UserRoleEnum> roles) {
//        this.roles = roles;
//    }

    
    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idKorisnickogNaloga != null ? idKorisnickogNaloga.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof KorisnickiNalog)) {
            return false;
        }
        KorisnickiNalog other = (KorisnickiNalog) object;
        if ((this.idKorisnickogNaloga == null && other.idKorisnickogNaloga != null) || (this.idKorisnickogNaloga != null && !this.idKorisnickogNaloga.equals(other.idKorisnickogNaloga))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.diplomski.classes.KorisnickiNalog[ idKorisnickogNaloga=" + idKorisnickogNaloga + " ]";
    }

}
