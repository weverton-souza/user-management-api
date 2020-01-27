package com.caltech.solutions.user.management.domain;

import caltech.data.mongo.utilities.abstracts.AbstractDomain;
import org.springframework.data.mongodb.core.mapping.Document;

/**
 * @author Weverton Souza.
 * Created on 26/01/2020
 */
@Document
public class Address extends AbstractDomain {
    private Double latitude;
    private Double longitude;
    private String zipCode;
    private String address;
    private String addressNumber;
    private String addressComplement;
    private String neighborhood;
    private Long country;
    private Long county;

    public Address() { }

    
}
