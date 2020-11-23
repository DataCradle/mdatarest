package com.mlink.mdatarest.data;

import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.List;

/**
 * @author David Yanovsky
 */
@Getter
@Setter
@Document(collection = "treatments")
public class Treatment {
    @Id
    private String id;
    private String url;
    private String name;
    private String explanation;
    private List<String> destinations;
    private String providers;
    private String facilitators;
}
