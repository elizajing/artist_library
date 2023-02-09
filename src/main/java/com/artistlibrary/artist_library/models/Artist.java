package com.artistlibrary.artist_library.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

import java.util.Date;

@Entity(name="artists")
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
public class Artist {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer artist_id;
    private String artist_name;
    private String record_label;
    private String active_since;

    public Artist() {

    }

    public Integer getArtist_id() {
        return artist_id;
    }

    public void setArtist_id(Integer artist_id) {
        this.artist_id = artist_id;
    }

    public String getArtist_name() {
        return artist_name;
    }

    public void setArtist_name(String artist_name) {
        this.artist_name = artist_name;
    }

    public String getRecord_label() {
        return record_label;
    }

    public void setRecord_label(String record_label) {
        this.record_label = record_label;
    }

    public String getActive_since() {
        return active_since;
    }

    public void setActive_since(String active_since) {
        this.active_since = active_since;
    }
}
