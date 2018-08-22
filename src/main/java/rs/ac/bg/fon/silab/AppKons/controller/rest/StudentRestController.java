package rs.ac.bg.fon.silab.AppKons.controller.rest;

import java.math.BigDecimal;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import rs.ac.bg.fon.silab.AppKons.dao.StudentRepository;

import rs.ac.bg.fon.silab.AppKons.entities.Student;
import rs.ac.bg.fon.silab.AppKons.service.StudentService;

@RestController
@RequestMapping("/student")

public class StudentRestController {

    @Autowired
    StudentService service;

    @GetMapping("/all")
    public @ResponseBody
    List<Student> vratiSveStudente() {
        return service.findAll();
    }

    @GetMapping("/getStudent")
    public @ResponseBody
    Student vratiStudenta(@RequestParam(value = "brojIndeksa") String brojIndeksa) {
        return service.vratiStudenta(brojIndeksa);
    }

}