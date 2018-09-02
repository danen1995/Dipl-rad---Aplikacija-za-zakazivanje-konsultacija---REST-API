package rs.ac.bg.fon.silab.AppKons.controller.rest;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import rs.ac.bg.fon.silab.AppKons.dto.PrilogDTO;
import rs.ac.bg.fon.silab.AppKons.service.PrilogService;

@RestController
@RequestMapping("/prilog")
@CrossOrigin
public class PrilogRestController {

    @Autowired
    PrilogService service;

    @RequestMapping(value = "/add", method = RequestMethod.POST)
    @CrossOrigin
    public @ResponseBody
    Object dodajPrilog(@RequestBody PrilogDTO prilog) {
        try {
            return ResponseEntity.status(HttpStatus.OK).body(service.dodajPrilog(prilog));
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body("Greska.");
        }
    }

    @GetMapping("/sve")
    public @ResponseBody
    Object sviPrilozi() {
        List<PrilogDTO> sviPrilozi = service.findAll();
        return ResponseEntity.status(HttpStatus.OK).body(sviPrilozi);
    }

}
