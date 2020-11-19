package com.mlink.mdatarest.restcontroller;

import com.mlink.mdatarest.service.ClinicsService;
import com.mlink.mdatarest.data.Clinic;
import lombok.RequiredArgsConstructor;
import org.bson.types.ObjectId;
import org.springframework.beans.factory.annotation.Autowired;
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

    @GetMapping(value = "/count")
    public long count() {
        return clinicsService.count();
    }
    @GetMapping(value = "/name/{name}")
    public Clinic getClinicByName(@PathVariable("name") String name) {
        return clinicsService.findByName(name);
    }
}
