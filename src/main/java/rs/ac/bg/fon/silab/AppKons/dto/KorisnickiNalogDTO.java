/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rs.ac.bg.fon.silab.AppKons.dto;

import java.math.BigDecimal;

/**
 *
 * @author Dane
 */
public class KorisnickiNalogDTO {

    private String korisnickoIme;
    private String lozinka;
    private NastavnikDTO nastavnik;
    private StudentDTO student;

    public KorisnickiNalogDTO() {
    }

    public KorisnickiNalogDTO(BigDecimal idKorisnickogNaloga, String korisnickoIme, String lozinka, NastavnikDTO nastavnik, StudentDTO student) {
        this.korisnickoIme = korisnickoIme;
        this.lozinka = lozinka;
        this.nastavnik = nastavnik;
        this.student = student;
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

    public NastavnikDTO getNastavnik() {
        return nastavnik;
    }

    public void setNastavnik(NastavnikDTO nastavnik) {
        this.nastavnik = nastavnik;
    }

    public StudentDTO getStudent() {
        return student;
    }

    public void setStudent(StudentDTO student) {
        this.student = student;
    }

}
