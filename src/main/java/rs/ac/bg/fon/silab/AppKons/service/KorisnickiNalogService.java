/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rs.ac.bg.fon.silab.AppKons.service;

import java.math.BigDecimal;
import java.util.List;
import rs.ac.bg.fon.silab.AppKons.dto.KorisnickiNalogDTO;
import rs.ac.bg.fon.silab.AppKons.entities.KorisnickiNalog;

/**
 *
 * @author student
 */
public interface KorisnickiNalogService {

    public KorisnickiNalogDTO login(String username, String password);

    public KorisnickiNalogDTO registrujSe(KorisnickiNalogDTO user);

    public KorisnickiNalog findByKorisnickoIme(String korisnickoIme);

    public Object authenticate(KorisnickiNalogDTO user) throws Exception;

    public List<KorisnickiNalogDTO> findAll();

    public String tipUsera(BigDecimal korID);

}
