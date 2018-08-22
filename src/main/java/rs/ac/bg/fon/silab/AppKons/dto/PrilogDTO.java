/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rs.ac.bg.fon.silab.AppKons.dto;

import java.io.Serializable;
import java.math.BigDecimal;

/**
 *
 * @author Dane
 */
public class PrilogDTO {

    private String naziv;
    private String lokacija;
    private StudentKonsultacijeDTO studentKonsultacije;

    public PrilogDTO() {
    }

    public PrilogDTO(BigDecimal idPriloga, String naziv, String lokacija, StudentKonsultacijeDTO studentKonsultacije) {
        this.naziv = naziv;
        this.lokacija = lokacija;
        this.studentKonsultacije = studentKonsultacije;
    }


    public String getNaziv() {
        return naziv;
    }

    public void setNaziv(String naziv) {
        this.naziv = naziv;
    }

    public String getLokacija() {
        return lokacija;
    }

    public void setLokacija(String lokacija) {
        this.lokacija = lokacija;
    }

    public StudentKonsultacijeDTO getStudentKonsultacije() {
        return studentKonsultacije;
    }

    public void setStudentKonsultacije(StudentKonsultacijeDTO studentKonsultacije) {
        this.studentKonsultacije = studentKonsultacije;
    }


}
