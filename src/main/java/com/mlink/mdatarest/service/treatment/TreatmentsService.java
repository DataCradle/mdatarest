package com.mlink.mdatarest.service.treatment;

import com.mlink.mdatarest.data.Clinic;
import com.mlink.mdatarest.data.Treatment;

import java.util.List;

/**
 * @author David Yanovsky
 */

public interface TreatmentsService {
    List<Treatment> findAll();
}
