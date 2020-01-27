package com.caltech.solutions.user.management.infrastructure.client;

import com.caltech.solutions.user.management.abstracts.AbstractClient;
import com.caltech.solutions.user.management.domain.ibge.County;
import com.caltech.solutions.user.management.domain.ibge.Region;

import com.caltech.solutions.user.management.domain.ibge.UF;
import com.google.gson.Gson;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpMethod;
import org.springframework.web.util.UriComponentsBuilder;

import java.lang.reflect.Type;
import java.util.Arrays;
import java.util.List;

/**
 * @author Weverton Souza.
 * Created on 26/01/2020
 */
public class IBGE extends AbstractClient {

    @Value("${user.management.ibge-service-locality-url}")
    protected String mainURL;

    public IBGE() { }

    public Region findRegion(final String regionCod) {
        this.builder = UriComponentsBuilder.fromHttpUrl(mainURL + "/localidades/" + regionCod);
        this.entity = new HttpEntity<>(headers);

        String body = this.restOperations
                .exchange(builder.toUriString(), HttpMethod.GET, entity, String.class)
                .getBody();

        return this.gson.fromJson(body, Region.class);
    }

    public List<Region> findAllRegion() {
        this.builder = UriComponentsBuilder
                .fromHttpUrl(mainURL + "/localidades/" + "/1/2/3/4/5");
        this.entity = new HttpEntity<>(headers);

        String body = this.restOperations
                .exchange(builder.toUriString(), HttpMethod.GET, entity, String.class)
                .getBody();

        return this.gson.fromJson(body, (Type) Region[].class);
    }

    public List<County> findAllCitiesByState(final Long countyCod) {
        String url = this.mainURL +"/localidades/estados/"+countyCod+"/municipios";
        this.connect(this.mainURL +"/localidades/estados/"+countyCod+"/municipios");
        String page = this.call();
        return Arrays.asList(new Gson().fromJson(page, County[].class));
    }

    public List<UF> fetchAllStates() {
        this.connect(this.mainURL + "/localidades/estados");
        return Arrays.asList(new Gson().fromJson(this.call(), UF[].class));
    }
}
