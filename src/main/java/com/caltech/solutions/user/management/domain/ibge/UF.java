package com.caltech.solutions.user.management.domain.ibge;

import com.google.gson.annotations.SerializedName;

public class UF {
    private String id;
    @SerializedName(value = "nome")
    private String name;
    @SerializedName(value = "sigla")
    private String initials;
    @SerializedName(value = "regiao")
    private Region region;

    public UF() {}

    public String getId() {
        return id;
    }

    public UF setId(final String id) {
        this.id = id;
        return this;
    }

    public String getName() {
        return name;
    }

    public UF setName(final String name) {
        this.name = name;
        return this;
    }

    public String getInitials() {
        return initials;
    }

    public UF setInitials(final String initials) {
        this.initials = initials;
        return this;
    }

    public Region getRegion() {
        return region;
    }

    public UF setRegion(final Region region) {
        this.region = region;
        return this;
    }
}
