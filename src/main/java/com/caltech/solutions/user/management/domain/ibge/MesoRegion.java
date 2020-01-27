package com.caltech.solutions.user.management.domain.ibge;

import com.google.gson.annotations.SerializedName;

public class MesoRegion {
    private String id;
    @SerializedName(value = "nome")
    private String name;
    @SerializedName(value = "UF")
    private UF uf;

    public MesoRegion() {}

    public String getId() {
        return id;
    }

    public MesoRegion setId(final String id) {
        this.id = id;
        return this;
    }

    public String getName() {
        return name;
    }

    public MesoRegion setName(final String name) {
        this.name = name;
        return this;
    }

    public UF getUf() {
        return uf;
    }

    public MesoRegion setUf(final UF uf) {
        this.uf = uf;
        return this;
    }
}
