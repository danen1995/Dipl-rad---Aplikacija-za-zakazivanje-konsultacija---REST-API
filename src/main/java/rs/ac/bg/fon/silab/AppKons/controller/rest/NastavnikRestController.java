package rs.ac.bg.fon.silab.AppKons.controller.rest;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import rs.ac.bg.fon.silab.AppKons.dto.KonsultacijeDTO;
import rs.ac.bg.fon.silab.AppKons.dto.NastavnikDTO;
import rs.ac.bg.fon.silab.AppKons.entities.Nastavnik;
import rs.ac.bg.fon.silab.AppKons.entities.Student;
import rs.ac.bg.fon.silab.AppKons.service.NastavnikService;
import rs.ac.bg.fon.silab.AppKons.serviceImpl.KonsultacijeServiceImpl;
import rs.ac.bg.fon.silab.AppKons.serviceImpl.NastavnikServiceImpl;

@RestController
@RequestMapping("/nastavnik")
@CrossOrigin
public class NastavnikRestController {

    @Autowired
    NastavnikService service;

    @GetMapping("/sve")
    public @ResponseBody
    Object vratiSveNastavnike() {
        List<NastavnikDTO> sviNas = service.findAll();
        return ResponseEntity.status(HttpStatus.OK).body(sviNas);
    }
    
    @GetMapping("/getNastavnik")
    public @ResponseBody
    NastavnikDTO vratiNastavnika(@RequestParam(value = "jmbg") String jmbg) {
        return service.vratiNastavnika(jmbg);
    }

}
