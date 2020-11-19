package com.mlink.mdatarest.service;

import com.mlink.mdatarest.data.Clinic;
import org.bson.types.ObjectId;

import java.util.List;

/**
 * @author David Yanovsky
 */

public interface ClinicsService {
    List<Clinic> findAll();
    //List<Clinic> find
    Clinic findById(String id);
    Clinic findByName(String name);
    Clinic findByCity(String city);
    Clinic saveOrUpdateClinic(Clinic Clinic);
    void deleteStudentById(String id);
    long count();
}
