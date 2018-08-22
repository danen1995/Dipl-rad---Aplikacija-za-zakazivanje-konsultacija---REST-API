/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rs.ac.bg.fon.silab.AppKons.dto;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Collection;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author Dane
 */
public class SkolskaGodinaDTO  {

    private BigDecimal idSkolskeGodine;
    private String skolskaGodina;
    private String semestar;
//    private Collection<PokrivenostNastaveDTO> pokrivenostNastaveCollection;
//    private Collection<KalendarDTO> kalendarCollection;

    public SkolskaGodinaDTO() {
    }

    public SkolskaGodinaDTO(BigDecimal idSkolskeGodine, String skolskaGodina, String semestar, Collection<PokrivenostNastaveDTO> pokrivenostNastaveCollection, Collection<KalendarDTO> kalendarCollection) {
        this.idSkolskeGodine = idSkolskeGodine;
        this.skolskaGodina = skolskaGodina;
        this.semestar = semestar;
//        this.pokrivenostNastaveCollection = pokrivenostNastaveCollection;
//        this.kalendarCollection = kalendarCollection;
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

//    public Collection<PokrivenostNastaveDTO> getPokrivenostNastaveCollection() {
//        return pokrivenostNastaveCollection;
//    }
//
//    public void setPokrivenostNastaveCollection(Collection<PokrivenostNastaveDTO> pokrivenostNastaveCollection) {
//        this.pokrivenostNastaveCollection = pokrivenostNastaveCollection;
//    }
//
//    public Collection<KalendarDTO> getKalendarCollection() {
//        return kalendarCollection;
//    }
//
//    public void setKalendarCollection(Collection<KalendarDTO> kalendarCollection) {
//        this.kalendarCollection = kalendarCollection;
//    }


}
