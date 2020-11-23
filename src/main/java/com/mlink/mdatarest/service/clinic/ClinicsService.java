package com.mlink.mdatarest.service.clinic;

import com.mlink.mdatarest.data.Clinic;
import java.util.List;

/**
 * @author David Yanovsky
 */

public interface ClinicsService {
    List<Clinic> findAll();
    Clinic findById(String id);
    Clinic findByName(String name);
    List<Clinic> findClinicsByNameContaining(String name);
    List<Clinic> findClinicsByNameContains(String sname);
    Clinic findByCity(String city);
    Clinic saveOrUpdateClinic(Clinic Clinic);
    void deleteClinicById(String id);
}
