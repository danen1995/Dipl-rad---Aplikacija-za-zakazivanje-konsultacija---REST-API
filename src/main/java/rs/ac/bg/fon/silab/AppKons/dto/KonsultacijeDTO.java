/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rs.ac.bg.fon.silab.AppKons.dto;

import java.math.BigInteger;
import java.util.Collection;
import java.util.Date;

/**
 *
 * @author Dane
 */
public class KonsultacijeDTO extends DogadjajDTO {

    private BigInteger kapacitet;
    private BigInteger brojZakazanih;
    private Collection<StudentKonsultacijeDTO> studentKonsultacijeCollection;

    public KonsultacijeDTO() {
    }

    public KonsultacijeDTO(BigInteger kapacitet, BigInteger brojZakazanih, Collection<StudentKonsultacijeDTO> studentKonsultacijeCollection, DogadjajPKDTO dogadjajPK, Date datumIVremePocetka, Date datumIVremeZavrsetka, String mestoOdrzavanja, KalendarDTO kalendar, TipDogadjajaDTO idTipaDogadjaja) {
        super(dogadjajPK, datumIVremePocetka, datumIVremeZavrsetka, mestoOdrzavanja, kalendar, idTipaDogadjaja);
        this.kapacitet = kapacitet;
        this.brojZakazanih = brojZakazanih;
        this.studentKonsultacijeCollection = studentKonsultacijeCollection;
    }

    public Collection<StudentKonsultacijeDTO> getStudentKonsultacijeCollection() {
        return studentKonsultacijeCollection;
    }

    public void setStudentKonsultacijeCollection(Collection<StudentKonsultacijeDTO> studentKonsultacijeCollection) {
        this.studentKonsultacijeCollection = studentKonsultacijeCollection;
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
}
