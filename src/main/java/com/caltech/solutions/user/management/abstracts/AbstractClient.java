package com.caltech.solutions.user.management.abstracts;

import com.google.gson.Gson;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.web.client.RestOperations;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.util.UriComponentsBuilder;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

/**
 * @author Weverton Souza.
 * Created on 26/01/2020
 */
public abstract class AbstractClient {
        protected final Logger logger = LoggerFactory.getLogger(getClass());
        protected RestOperations restOperations;
        protected URL url;
        protected HttpURLConnection con;
        protected HttpEntity<?> entity;
        protected UriComponentsBuilder builder;
        protected HttpHeaders headers;
        protected String mainURL;
        protected Gson gson = new Gson().newBuilder().create();

        public AbstractClient() {
            this.restOperations = new RestTemplate();
            this.headers = new HttpHeaders();
            this.headers.set("Content-Type", MediaType.APPLICATION_JSON_VALUE);
        }

        protected void connect(final String API_URL) {
            try {
                URL url = new URL(API_URL);
                con = (HttpURLConnection) url.openConnection();
                con.setRequestProperty("Content-Type", "application/json");
                con.setUseCaches(false);
                con.setRequestMethod("GET");

                if (con.getResponseCode() != HttpStatus.OK.value()) {
                    throw new RuntimeException("HTTP error code : " + con.getResponseCode());
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

        protected void closeConnect() {
            this.con.disconnect();
        }


        protected String call() {
            try {
                BufferedReader bufferedReader = new BufferedReader(new InputStreamReader((con.getInputStream())));
                StringBuilder sb = new StringBuilder();
                String line;

                while ((line = bufferedReader.readLine()) != null) { sb.append(line); }

                bufferedReader.close();
                return sb.toString();

            } catch (IOException e) {
                return null;
            } finally {
                this.closeConnect();
            }
        }

    }
