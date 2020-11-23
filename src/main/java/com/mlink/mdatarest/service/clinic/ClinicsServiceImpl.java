package com.mlink.mdatarest.service.clinic;

import com.mlink.mdatarest.data.Clinic;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ClinicsServiceImpl implements ClinicsService {

    @Autowired
    private ClinicRepository clinicRepository;

    @Override
    public List<Clinic> findAll() {
        return clinicRepository.findAll();
    }

    @Override
    public Clinic findById(String id) { return clinicRepository.findById(id).orElse(null); }

    @Override
    public Clinic findByName(String name) {
        return clinicRepository.findByName(name);
    }

    @Override
    public Clinic findByCity(String city) {
        return clinicRepository.findByCity(city);
    }

    @Override
    public List<Clinic> findClinicsByNameContaining (String name) {
        return clinicRepository.findClinicsByNameContaining(name);
    }

    @Override
    public List<Clinic> findClinicsByNameContains(String name) {
        return clinicRepository.findClinicsByNameContains(name);
    }

    @Override
    public Clinic saveOrUpdateClinic(Clinic Clinic) {
        return clinicRepository.save(Clinic);
    }

    @Override
    public void deleteClinicById(String id) {
        clinicRepository.deleteById(id);
    }

}
