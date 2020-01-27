package com.caltech.solutions.user.management.utility;

import com.caltech.solutions.user.management.enumeration.DocumentType;

/**
 * @author Weverton Souza.
 * Created on 25/01/2020
 */
public class PersonalDocument {
    private String documentNumber;
    private DocumentType type;

    public PersonalDocument() {}

    public String getDocumentNumber() {
        return documentNumber;
    }

    public PersonalDocument setDocumentNumber(final String documentNumber) {
        this.documentNumber = documentNumber;
        return this;
    }

    public DocumentType getType() {
        return type;
    }

    public PersonalDocument setType(final DocumentType type) {
        this.type = type;
        return this;
    }
}
