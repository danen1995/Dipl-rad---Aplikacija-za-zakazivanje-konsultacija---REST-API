/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rs.ac.bg.fon.silab.AppKons.service;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import rs.ac.bg.fon.silab.AppKons.dao.KalendarRepository;
import rs.ac.bg.fon.silab.AppKons.dao.KonsultacijeRepository;
import rs.ac.bg.fon.silab.AppKons.dto.KalendarDTO;
import rs.ac.bg.fon.silab.AppKons.dto.KonsultacijeDTO;
import rs.ac.bg.fon.silab.AppKons.entities.DogadjajPK;
import rs.ac.bg.fon.silab.AppKons.entities.Kalendar;
import rs.ac.bg.fon.silab.AppKons.entities.Konsultacije;
import rs.ac.bg.fon.silab.AppKons.mapper.GenericMapper;

/**
 *
 * @author Dane
 */
@Service
public class KalendarService {

    @Autowired
    GenericMapper mapper;
    @Autowired
    KalendarRepository repository;

   

    public List<KalendarDTO> vratiKalendareZaNastavnika(String JMBGNastavnika) {
        List<Kalendar> kons = repository.vratiKalendareZaNastavnika(JMBGNastavnika);
        List<KalendarDTO> konsDTO = new ArrayList<>();
        for (Kalendar k : kons) {
            konsDTO.add(mapper.kalendarToKalendarDTO(k));
        }
        return konsDTO;
    }

}
