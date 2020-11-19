package com.mlink.mdatarest.service;

import com.mlink.mdatarest.data.Clinic;
import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;

/**
 * @author David Yanovsky
 */

public interface ClinicRepository extends MongoRepository<Clinic, String> {
    //Clinic findById (String id);
    Clinic findByName(String name);
    Clinic findByCity(String name);
    long countClinicsByCityExists();
}
