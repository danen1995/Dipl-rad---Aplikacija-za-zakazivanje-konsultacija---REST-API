package rs.ac.bg.fon.silab.AppKons.controller.rest;

import java.util.List;
import org.apache.tomcat.util.codec.binary.Base64;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import rs.ac.bg.fon.silab.AppKons.dto.KorisnickiNalogDTO;
import rs.ac.bg.fon.silab.AppKons.entities.KorisnickiNalog;
import rs.ac.bg.fon.silab.AppKons.service.KorisnickiNalogService;

@RestController

public class KorisnickiNalogRestController {

    @Autowired
    KorisnickiNalogService service;

    @RequestMapping(value = "/login", method = RequestMethod.POST, consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.TEXT_PLAIN_VALUE)
    public @ResponseBody
    Object login(@RequestBody KorisnickiNalogDTO user) {
        try {
            return ResponseEntity.status(HttpStatus.OK).body(service.authenticate(user));
        } catch (Exception ex) {
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body("Unknown user.");
        }
    }

    @RequestMapping(value = "/register", method = RequestMethod.POST, consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.TEXT_PLAIN_VALUE)
    public @ResponseBody
    Object register(@RequestBody KorisnickiNalogDTO user) {
        try {
            return ResponseEntity.status(HttpStatus.OK).body(service.register(user));
        } catch (Exception ex) {
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body("Greska. Ne postoji takav Student/Nastavnik.");

        }
    }

    @RequestMapping(value = "/sviNalozi", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
    public @ResponseBody
    Object findAll() {
        List<KorisnickiNalogDTO> nalozi = service.findAll();
        return ResponseEntity.status(HttpStatus.OK).body(nalozi);
    }
}
