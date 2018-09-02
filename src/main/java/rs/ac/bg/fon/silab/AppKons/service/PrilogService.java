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
import rs.ac.bg.fon.silab.AppKons.dao.KonsultacijeRepository;
import rs.ac.bg.fon.silab.AppKons.dao.PrilogRepository;
import rs.ac.bg.fon.silab.AppKons.dto.KonsultacijeDTO;
import rs.ac.bg.fon.silab.AppKons.dto.PrilogDTO;
import rs.ac.bg.fon.silab.AppKons.entities.DogadjajPK;
import rs.ac.bg.fon.silab.AppKons.entities.Konsultacije;
import rs.ac.bg.fon.silab.AppKons.entities.Prilog;
import rs.ac.bg.fon.silab.AppKons.mapper.GenericMapper;

/**
 *
 * @author Dane
 */
@Service
public class PrilogService {

    @Autowired
    GenericMapper mapper;
    @Autowired
    PrilogRepository repository;

    public PrilogDTO dodajPrilog(PrilogDTO prilogDTO) {
        Prilog prilog = mapper.prilogDTOToPrilog(prilogDTO);
        return mapper.prilogToPrilogDTO(repository.save(prilog));
    }

    public List<PrilogDTO> findAll() {
        List<Prilog> prilozi = repository.findAll();
        List<PrilogDTO> priloziDTO = new ArrayList<>();
        for (Prilog p : prilozi) {
            priloziDTO.add(mapper.prilogToPrilogDTO(p));
        }
        return priloziDTO;
    }

}
