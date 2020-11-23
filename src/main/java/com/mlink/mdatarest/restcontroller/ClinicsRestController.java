package com.mlink.mdatarest.restcontroller;

import com.mlink.mdatarest.data.Clinic;
import com.mlink.mdatarest.service.clinic.ClinicsService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @author David Yanovsky
 */
@RequiredArgsConstructor
@RestController
@RequestMapping("/clinics")
public class ClinicsRestController {

    private final ClinicsService clinicsService;

    @GetMapping
    public List<Clinic> getAllClinics() {
        return clinicsService.findAll();
    }

    @GetMapping("/{id}")
    public Clinic getClinic(@PathVariable("id") String id) {
        return clinicsService.findById(id);
    }

    @GetMapping(value = "/name/{name}")
    public Clinic getClinicByName(@PathVariable("name") String name) {
        return clinicsService.findByName(name);
    }

    @GetMapping(value = "/name/search1/{name}")
    public List<Clinic> search1ClinicByName(@PathVariable("name") String name) {
        return clinicsService.findClinicsByNameContaining(name);
    }

    @GetMapping(value = "/name/search/{name}")
    public List<Clinic> searchClinicByName(@PathVariable("name") String name) {
        return clinicsService.findClinicsByNameContains(name);
    }
}
