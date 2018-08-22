/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rs.ac.bg.fon.silab.AppKons.dto;

import rs.ac.bg.fon.silab.AppKons.entities.*;
import java.math.BigInteger;

/**
 *
 * @author Dane
 */
public class PokrivenostNastaveDTO {

    private PokrivenostNastavePKDTO pokrivenostNastavePK;

    private String uloga;
    private NastavnikDTO nastavnik;
    private PredmetDTO predmet;
    private SkolskaGodinaDTO idSkolskeGodine;

    public PokrivenostNastaveDTO() {
    }

    public PokrivenostNastaveDTO(PokrivenostNastavePK pokrivenostNastavePK, String uloga, NastavnikDTO nastavnik, PredmetDTO predmet, SkolskaGodinaDTO idSkolskeGodine) {
        this.uloga = uloga;
        this.nastavnik = nastavnik;
        this.predmet = predmet;
        this.idSkolskeGodine = idSkolskeGodine;
    }

    public String getUloga() {
        return uloga;
    }

    public void setUloga(String uloga) {
        this.uloga = uloga;
    }

    public NastavnikDTO getNastavnik() {
        return nastavnik;
    }

    public void setNastavnik(NastavnikDTO nastavnik) {
        this.nastavnik = nastavnik;
    }

    public PredmetDTO getPredmet() {
        return predmet;
    }

    public void setPredmet(PredmetDTO predmet) {
        this.predmet = predmet;
    }

    public SkolskaGodinaDTO getIdSkolskeGodine() {
        return idSkolskeGodine;
    }

    public void setIdSkolskeGodine(SkolskaGodinaDTO idSkolskeGodine) {
        this.idSkolskeGodine = idSkolskeGodine;
    }

}
