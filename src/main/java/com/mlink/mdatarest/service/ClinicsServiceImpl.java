package com.mlink.mdatarest.service;

import com.mlink.mdatarest.data.Clinic;
import org.bson.types.ObjectId;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

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
    public Clinic saveOrUpdateClinic(Clinic Clinic) {
        return clinicRepository.save(Clinic);
    }

    @Override
    public void deleteStudentById(String id) {
        clinicRepository.deleteById(id);
    }

    @Override
    public long count() {
        return clinicRepository.countClinicsByCityExists();
    }
}
