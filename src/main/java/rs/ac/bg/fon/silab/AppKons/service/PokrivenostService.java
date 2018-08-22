/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rs.ac.bg.fon.silab.AppKons.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import rs.ac.bg.fon.silab.AppKons.dao.KonsultacijeRepository;
import rs.ac.bg.fon.silab.AppKons.dao.PokrivenostRepository;
import rs.ac.bg.fon.silab.AppKons.entities.Konsultacije;
import rs.ac.bg.fon.silab.AppKons.entities.PokrivenostNastave;

/**
 *
 * @author Dane
 */
@Service
public class PokrivenostService {

    @Autowired
    PokrivenostRepository repository;

    public List<PokrivenostNastave> findAll() {
        return repository.findAll();
    }

    public List<PokrivenostNastave> findByJmbgNastavnika(String JMBGNastavnika) {
        return repository.findByJmbgNastavnika(JMBGNastavnika);
    }
    
    

}
