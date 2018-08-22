/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rs.ac.bg.fon.silab.AppKons.dto;

import java.io.Serializable;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Collection;
import java.util.List;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author Dane
 */
public class PredmetDTO {

    private String naziv;
    private BigInteger espbBodovi;
    private String godinaStudija;
//    private List<PokrivenostNastaveDTO> pokrivenostNastaveCollection;
//    private Collection<NastavaDTO> nastavaCollection;

    public PredmetDTO() {
    }

    public PredmetDTO(BigDecimal idPredmeta, String naziv, BigInteger espbBodovi, String godinaStudija, List<PokrivenostNastaveDTO> pokrivenostNastaveCollection, Collection<NastavaDTO> nastavaCollection) {
        this.naziv = naziv;
        this.espbBodovi = espbBodovi;
        this.godinaStudija = godinaStudija;
//        this.pokrivenostNastaveCollection = pokrivenostNastaveCollection;
//        this.nastavaCollection = nastavaCollection;
    }

    public String getNaziv() {
        return naziv;
    }

    public void setNaziv(String naziv) {
        this.naziv = naziv;
    }

    public BigInteger getEspbBodovi() {
        return espbBodovi;
    }

    public void setEspbBodovi(BigInteger espbBodovi) {
        this.espbBodovi = espbBodovi;
    }

    public String getGodinaStudija() {
        return godinaStudija;
    }

    public void setGodinaStudija(String godinaStudija) {
        this.godinaStudija = godinaStudija;
    }

//    public Collection<PokrivenostNastaveDTO> getPokrivenostNastaveCollection() {
//        return pokrivenostNastaveCollection;
//    }
//
//    public void setPokrivenostNastaveCollection(List<PokrivenostNastaveDTO> pokrivenostNastaveCollection) {
//        this.pokrivenostNastaveCollection = pokrivenostNastaveCollection;
//    }
//
//    public Collection<NastavaDTO> getDogadjajCollection() {
//        return nastavaCollection;
//    }
//
//    public void setDogadjajCollection(Collection<NastavaDTO> dogadjajCollection) {
//        this.nastavaCollection = dogadjajCollection;
//    }
}
