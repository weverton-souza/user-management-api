package com.caltech.solutions.user.management.domain.ibge;

import com.google.gson.annotations.SerializedName;

public class County  {
    private String id;
    @SerializedName(value = "nome")
    private String name;
    @SerializedName(value = "microrregiao")
    private MicroRegion microregion;

    public County() {}

    public String getId() {
        return id;
    }

    public County setId(final String id) {
        this.id = id;
        return this;
    }

    public String getName() {
        return name;
    }

    public County setName(final String name) {
        this.name = name;
        return this;
    }

    public MicroRegion getMicroregion() {
        return microregion;
    }

    public County setMicroregion(final MicroRegion microregion) {
        this.microregion = microregion;
        return this;
    }
}
