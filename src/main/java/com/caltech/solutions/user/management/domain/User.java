package com.caltech.solutions.user.management.domain;

import caltech.data.mongo.utilities.abstracts.AbstractDomain;
import com.caltech.solutions.user.management.utility.PersonalDocument;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.Date;
import java.util.Set;

/**
 * @author Weverton Souza.
 * Created on 25/01/2020
 */
@Document
public class User extends AbstractDomain {
    private String firstName;
    private String lastName;
    private String nickname;
    private Set<PersonalDocument> personalDocuments;
    private String email;
    private String phone;
    private String imageURL;
    private Short age;
    private String gender;
    @DBRef
    private Address address;
    private Integer nationality;
    private boolean active;
    private Date birthday;
    private String placeOfBirth;

    public User() {}

    public String getFirstName() {
        return firstName;
    }

    public User setFirstName(final String firstName) {
        this.firstName = firstName;
        return this;
    }

    public String getLastName() {
        return lastName;
    }

    public User setLastName(final String lastName) {
        this.lastName = lastName;
        return this;
    }

    public String getNickname() {
        return nickname;
    }

    public User setNickname(final String nickname) {
        this.nickname = nickname;
        return this;
    }

    public Set<PersonalDocument> getPersonalDocuments() {
        return personalDocuments;
    }

    public User setPersonalDocuments(final Set<PersonalDocument> personalDocuments) {
        this.personalDocuments = personalDocuments;
        return this;
    }

    public String getEmail() {
        return email;
    }

    public User setEmail(final String email) {
        this.email = email;
        return this;
    }

    public String getPhone() {
        return phone;
    }

    public User setPhone(final String phone) {
        this.phone = phone;
        return this;
    }

    public String getImageURL() {
        return imageURL;
    }

    public User setImageURL(final String imageURL) {
        this.imageURL = imageURL;
        return this;
    }

    public Short getAge() {
        return age;
    }

    public User setAge(final Short age) {
        this.age = age;
        return this;
    }

    public String getGender() {
        return gender;
    }

    public User setGender(final String gender) {
        this.gender = gender;
        return this;
    }

    public Address getAddress() {
        return address;
    }

    public User setAddress(final Address address) {
        this.address = address;
        return this;
    }

    public Integer getNationality() {
        return nationality;
    }

    public User setNationality(final Integer nationality) {
        this.nationality = nationality;
        return this;
    }

    public boolean isActive() {
        return active;
    }

    public User setActive(final boolean active) {
        this.active = active;
        return this;
    }

    public Date getBirthday() {
        return birthday;
    }

    public User setBirthday(final Date birthday) {
        this.birthday = birthday;
        return this;
    }

    public String getPlaceOfBirth() {
        return placeOfBirth;
    }

    public User setPlaceOfBirth(final String placeOfBirth) {
        this.placeOfBirth = placeOfBirth;
        return this;
    }
}
