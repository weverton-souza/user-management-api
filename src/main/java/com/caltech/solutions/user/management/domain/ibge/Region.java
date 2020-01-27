package com.caltech.solutions.user.management.domain.ibge;

import com.google.gson.annotations.SerializedName;

public class Region  {
    private String id;
    @SerializedName(value = "sigla")
    private String initials;
    @SerializedName(value = "nome")
    private String name;

    public Region() {}

    public String getId() {
        return id;
    }

    public Region setId(final String id) {
        this.id = id;
        return this;
    }

    public String getInitials() {
        return initials;
    }

    public Region setInitials(final String initials) {
        this.initials = initials;
        return this;
    }

    public String getName() {
        return name;
    }

    public Region setName(final String name) {
        this.name = name;
        return this;
    }
}
