package com.mlink.mdatarest.restcontroller;

import com.mlink.mdatarest.service.ClinicsService;
import com.mlink.mdatarest.data.Clinic;
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
@RestController
@RequestMapping("/clinics")
public class ClinicsRestController {

    @Autowired
    private ClinicsService clinicsService;

    @GetMapping(value = "/")
    public List<Clinic> getAllClinics() {
        return clinicsService.findAll();
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
