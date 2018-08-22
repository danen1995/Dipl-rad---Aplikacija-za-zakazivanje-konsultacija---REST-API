package rs.ac.bg.fon.silab.AppKons.controller.rest;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import rs.ac.bg.fon.silab.AppKons.dto.KonsultacijeDTO;
import rs.ac.bg.fon.silab.AppKons.service.KonsultacijeService;

@RestController
@RequestMapping("/konsultacije")

public class KonsultacijeRestController {

    @Autowired
    KonsultacijeService service;

    @GetMapping("/sve")
    public @ResponseBody
    Object vratiSveKonsultacije() {
        List<KonsultacijeDTO> sveKons = service.findAll();
        return ResponseEntity.status(HttpStatus.OK).body(sveKons);
    }

    @GetMapping("/zaNastavnika")
    public @ResponseBody
    Object vratiKonsultacijeZaNastavnika(@RequestParam(value = "JMBGNastavnika") String JMBGNastavnika) {
        List<KonsultacijeDTO> konsZaNastavnika = service.vratiKonsultacijeZaNastavnika(JMBGNastavnika);
        return ResponseEntity.status(HttpStatus.OK).body(konsZaNastavnika);

    }

    @RequestMapping(value = "/add", method = RequestMethod.POST, consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.TEXT_PLAIN_VALUE)
    public @ResponseBody
    Object generisiKonsultacije(@RequestBody KonsultacijeDTO konsultacije) {
        try {
            return ResponseEntity.status(HttpStatus.OK).body(service.generisi(konsultacije));
        } catch (Exception ex) {
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body("Greska.");

        }
    }
}
