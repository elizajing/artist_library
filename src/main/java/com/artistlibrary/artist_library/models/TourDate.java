package com.artistlibrary.artist_library.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

import java.util.Date;

@Entity(name="tour_dates")
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
public class TourDate {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer tour_id;
    private String artist_name;
    private Date tour_date;
    private String place;

    public TourDate() {

    }

    public Integer getTour_id() {
        return tour_id;
    }

    public void setTour_id(Integer tour_id) {
        this.tour_id = tour_id;
    }

    public String getArtist_name() {
        return artist_name;
    }

    public void setArtist_name(String artist_name) {
        this.artist_name = artist_name;
    }

    public Date getTour_date() {
        return tour_date;
    }

    public void setTour_date(Date tour_date) {
        this.tour_date = tour_date;
    }

    public String getPlace() {
        return place;
    }

    public void setPlace(String place) {
        this.place = place;
    }
}
