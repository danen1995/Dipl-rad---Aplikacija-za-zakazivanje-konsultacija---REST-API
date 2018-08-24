/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rs.ac.bg.fon.silab.AppKons.service;

import java.util.ArrayList;
import java.util.List;
import org.apache.tomcat.util.codec.binary.Base64;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import rs.ac.bg.fon.silab.AppKons.dao.KorisnickiNalogRepository;
import rs.ac.bg.fon.silab.AppKons.dto.KorisnickiNalogDTO;
import rs.ac.bg.fon.silab.AppKons.entities.KorisnickiNalog;
import rs.ac.bg.fon.silab.AppKons.mapper.GenericMapper;

/**
 *
 * @author student
 */
@Service
public class KorisnickiNalogService {

    @Autowired
    private KorisnickiNalogRepository userDAO;
    @Autowired
    GenericMapper mapper;

    public KorisnickiNalogDTO login(String username, String password) {
        return mapper.korisnickiNalogToKorisnickiNalogDTO(userDAO.login(username, password));
    }

    public KorisnickiNalogDTO register(KorisnickiNalogDTO user) {
        KorisnickiNalog kor = mapper.korisnickiNalogDTOToKorisnickiNalog(user);
        return mapper.korisnickiNalogToKorisnickiNalogDTO(userDAO.save(kor));
    }

    public KorisnickiNalog findByKorisnickoIme(String korisnickoIme) {
        return userDAO.findByKorisnickoIme(korisnickoIme);
    }

    public String authenticate(KorisnickiNalogDTO user) throws Exception {
        KorisnickiNalog userDB = userDAO.login(user.getKorisnickoIme(), user.getLozinka());
        if (userDB == null) {
            throw new Exception("Unknown user.");
        }
//        String token = userDB.getKorisnickoIme();
//        return new String(Base64.encodeBase64(token.getBytes()));
        return userDB.getKorisnickoIme();
    }

    public List<KorisnickiNalogDTO> findAll() {
        List<KorisnickiNalog> nalozi = userDAO.findAll();
        List<KorisnickiNalogDTO> naloziDTO = new ArrayList<>();
        for (KorisnickiNalog nalog : nalozi) {
            naloziDTO.add(mapper.korisnickiNalogToKorisnickiNalogDTO(nalog));
        }
        return naloziDTO;

    }

}
