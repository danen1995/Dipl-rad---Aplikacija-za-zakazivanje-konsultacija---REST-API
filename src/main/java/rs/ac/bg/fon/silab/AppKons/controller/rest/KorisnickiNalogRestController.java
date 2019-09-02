package rs.ac.bg.fon.silab.AppKons.controller.rest;

import java.math.BigDecimal;
import java.util.List;
import org.apache.tomcat.util.codec.binary.Base64;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import rs.ac.bg.fon.silab.AppKons.dto.KorisnickiNalogDTO;
import rs.ac.bg.fon.silab.AppKons.dto.NastavnikDTO;
import rs.ac.bg.fon.silab.AppKons.dto.UserDTO;
import rs.ac.bg.fon.silab.AppKons.entities.KorisnickiNalog;
import rs.ac.bg.fon.silab.AppKons.service.KorisnickiNalogService;
import rs.ac.bg.fon.silab.AppKons.serviceImpl.KorisnickiNalogServiceImpl;

@RestController
@CrossOrigin

public class KorisnickiNalogRestController {

    @Autowired
    KorisnickiNalogService service;

    @CrossOrigin
    @RequestMapping(value = "/login", method = RequestMethod.POST)
    public @ResponseBody
    Object login(@RequestBody KorisnickiNalogDTO user) {
        try {
            return ResponseEntity.status(HttpStatus.OK).body(service.authenticate(user));
        } catch (Exception ex) {
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body("Greska. Ne postoji takav Student/Nastavnik.");

        }
    }

    @CrossOrigin
    @RequestMapping(value = "/register", method = RequestMethod.POST)
    public @ResponseBody
    Object register(@RequestBody KorisnickiNalogDTO user) {
        try {
            return service.registrujSe(user);
        } catch (Exception ex) {
            System.out.println("Message" + ex.getMessage());
            if (ex.getMessage().contains("[DIPLOMSKI.KORISNICKI_NALOG_UK1]")) {
                return ResponseEntity.status(HttpStatus.NOT_FOUND).body("Došlo je do greške prilikom registracije. Korisnik sa tim korisnickim imenom vec postoji!");
            }
            if (ex.getMessage().contains("[DIPLOMSKI.KORISNICKI_NALOG_UK3]")) {
                return ResponseEntity.status(HttpStatus.NOT_FOUND).body("Došlo je do greške prilikom registracije. Korisnik sa ovim brojem indeksa je vec registrovan.");
            } else {
                return ResponseEntity.status(HttpStatus.NOT_FOUND).body("Došlo je do greške prilikom registracije. Nepoznata greska! Proverite konekciju.");

            }

        }
    }

    @RequestMapping(value = "/sviNalozi", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
    public @ResponseBody
    Object findAll() {
        List<KorisnickiNalogDTO> nalozi = service.findAll();
        return ResponseEntity.status(HttpStatus.OK).body(nalozi);
    }

    @RequestMapping(value = "/tipUsera", method = RequestMethod.GET)
    public String tipUsera(@RequestParam(value = "korID") BigDecimal korID) {
        return service.tipUsera(korID);
    }

}
