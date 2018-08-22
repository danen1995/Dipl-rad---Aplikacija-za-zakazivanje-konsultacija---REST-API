/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rs.ac.bg.fon.silab.AppKons.entities;

import java.io.Serializable;
import java.math.BigInteger;
import java.util.Collection;
import java.util.Date;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.DiscriminatorColumn;
import javax.persistence.DiscriminatorType;
import javax.persistence.DiscriminatorValue;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Inheritance;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author Dane
 */
@Entity
@DiscriminatorValue("3")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Nastava.findByUlogaNastave", query = "SELECT d FROM Nastava d WHERE d.ulogaNastave = :ulogaNastave")})
public class Nastava extends Dogadjaj implements Serializable {

    @Column(name = "ULOGA_NASTAVE")
    private String ulogaNastave;
    @JoinColumn(name = "ID_PREDMETA", referencedColumnName = "ID_PREDMETA")
    @ManyToOne
    private Predmet idPredmeta;

    public String getUlogaNastave() {
        return ulogaNastave;
    }

    public void setUlogaNastave(String ulogaNastave) {
        this.ulogaNastave = ulogaNastave;
    }

    public Predmet getIdPredmeta() {
        return idPredmeta;
    }

    public void setIdPredmeta(Predmet idPredmeta) {
        this.idPredmeta = idPredmeta;
    }
}
