package com.mlink.mdatarest.restcontroller;

import com.mlink.mdatarest.data.Clinic;
import com.mlink.mdatarest.data.Treatment;
import com.mlink.mdatarest.service.clinic.ClinicsService;
import com.mlink.mdatarest.service.treatment.TreatmentsService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @author David Yanovsky
 */
@RequiredArgsConstructor
@RestController
@RequestMapping("/treatments")
public class TreatmentsRestController {
    private final TreatmentsService treatmentsService;

    @GetMapping
    public List<Treatment> getAllClinics() {
        return treatmentsService.findAll();
    }

}
