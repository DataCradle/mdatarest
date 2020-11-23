package com.mlink.mdatarest.service.treatment;

import com.mlink.mdatarest.data.Clinic;
import com.mlink.mdatarest.data.Treatment;
import com.mlink.mdatarest.service.clinic.ClinicRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author David Yanovsky
 */

@Service
public class TreatmentsServiceImpl implements TreatmentsService {

    @Autowired
    private TreatmentRepository treatmentRepository;

    @Override
    public List<Treatment> findAll() {
        return treatmentRepository.findAll();
    }
}
