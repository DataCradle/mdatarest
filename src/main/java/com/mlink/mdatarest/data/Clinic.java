package com.mlink.mdatarest.data;

import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.List;

import lombok.Getter;
import lombok.Setter;

/**
 * @author David Yanovsky
 */
@Getter
@Setter
@Document(collection = "clinics")
public class Clinic {
    @Id
    private String id;
    private String url;
    private String name;
    private String information;
    private String address;
    private String city;
    private String country;
    private String phone;
    private String email;
    private String website;
}
