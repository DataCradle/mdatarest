package com.mlink.mdatarest.service;

import com.mlink.mdatarest.data.Clinic;
import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.Optional;

/**
 * @author David Yanovsky
 */

public interface ClinicRepository extends MongoRepository<Clinic, String> {
    Clinic findByName(String name);
    Clinic findByCity(String name);
    long countClinicsByCityExists();
}
