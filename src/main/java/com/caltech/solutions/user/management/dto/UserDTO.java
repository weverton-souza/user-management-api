package com.caltech.solutions.user.management.dto;

import caltech.data.mongo.utilities.abstracts.AbstractDataTransferObject;
import com.caltech.solutions.user.management.utility.PersonalDocument;

import java.util.Set;

/**
 * @author Weverton Souza.
 * Created on 25/01/2020
 */
public class UserDTO extends AbstractDataTransferObject {
    private String firstName;
    private String lastName;
    private String nickname;
    private Set<PersonalDocument> personalDocuments;
    private String email;
    private String phone;
    private String imageURL;
}
