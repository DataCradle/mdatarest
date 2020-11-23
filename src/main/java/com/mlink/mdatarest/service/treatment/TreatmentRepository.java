package com.mlink.mdatarest.service.treatment;

import com.mlink.mdatarest.data.Clinic;
import com.mlink.mdatarest.data.Treatment;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.List;

public interface TreatmentRepository extends MongoRepository<Treatment, String> {
    List<Treatment> findAll();
}
