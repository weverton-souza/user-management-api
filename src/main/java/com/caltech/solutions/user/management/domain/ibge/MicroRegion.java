package com.caltech.solutions.user.management.domain.ibge;

import com.google.gson.annotations.SerializedName;

public class MicroRegion {
    private String id;
    @SerializedName(value = "nome")
    private String name;
    @SerializedName(value = "mesorregiao")
    private MesoRegion mesoregion;

    private MicroRegion() {}

    public String getId() {
        return id;
    }

    public MicroRegion setId(final String id) {
        this.id = id;
        return this;
    }

    public String getName() {
        return name;
    }

    public MicroRegion setName(final String name) {
        this.name = name;
        return this;
    }

    public MesoRegion getMesoregion() {
        return mesoregion;
    }

    public MicroRegion setMesoregion(final MesoRegion mesoregion) {
        this.mesoregion = mesoregion;
        return this;
    }
}
