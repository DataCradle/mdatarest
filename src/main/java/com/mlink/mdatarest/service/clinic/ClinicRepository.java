package com.mlink.mdatarest.service.clinic;

import com.mlink.mdatarest.data.Clinic;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.List;

/**
 * @author David Yanovsky
 */

public interface ClinicRepository extends MongoRepository<Clinic, String> {
    List<Clinic> findAll();
    Clinic findByName(String name);
    Clinic findByCity(String name);
    List<Clinic> findClinicsByNameContaining(String name);
    List<Clinic> findClinicsByNameContains(String sname);
}
