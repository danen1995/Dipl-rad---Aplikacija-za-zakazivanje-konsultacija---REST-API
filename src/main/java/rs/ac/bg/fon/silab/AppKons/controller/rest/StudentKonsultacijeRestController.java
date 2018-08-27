package rs.ac.bg.fon.silab.AppKons.controller.rest;

import java.math.BigInteger;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import rs.ac.bg.fon.silab.AppKons.dto.StudentKonsultacijeDTO;
import rs.ac.bg.fon.silab.AppKons.entities.Konsultacije;
import rs.ac.bg.fon.silab.AppKons.entities.StudentKonsultacije;
import rs.ac.bg.fon.silab.AppKons.service.StudentKonsultacijeService;

@RestController
@RequestMapping("/zakazaneKonsultacije")
@CrossOrigin

public class StudentKonsultacijeRestController {

    @Autowired
    StudentKonsultacijeService service;

    @GetMapping("/zaStudenta")
    public @ResponseBody
    List<StudentKonsultacijeDTO> vratiZakazaneKonsultacijeZaStudenta(@RequestParam(value = "brojIndeksa") String brojIndeksa) {
        return service.findByBrojIndeksaStudenta(brojIndeksa);
    }

    @GetMapping("/zaNastavnika")
    public @ResponseBody
    List<StudentKonsultacijeDTO> vratiZakazaneKonsultacijeZaNastavnika(@RequestParam(value = "JMBGNastavnika") String JMBGNastavnika) {
        return service.findByJMBGNastavnika(JMBGNastavnika);
    }

    @RequestMapping(value = "izbrisi", method = RequestMethod.DELETE)
    public void izbrisiStudentKonsultacije(@RequestParam BigInteger idKalendara, @RequestParam BigInteger idDogadjaja, @RequestParam String brojIndeksaStudenta) {
        service.izbrisiStudentKonsultacije(idKalendara, idDogadjaja, brojIndeksaStudenta);
    }

    @RequestMapping(value = "/add", method = RequestMethod.POST)
    public @ResponseBody
    Object zakaziKonsultacije(@RequestBody StudentKonsultacijeDTO konsultacije) {
        try {
            return ResponseEntity.status(HttpStatus.OK).body(service.zakazi(konsultacije));
        } catch (Exception ex) {
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body("Greska. Ne postoji takav Student/Nastavnik.");

        }
    }
}
