package com.example.playlist_app.model;

import java.util.List;
import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;

@Entity
public class Artist {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "artist_id")
    private Long artistId;

    @Column(name = "artist_name", nullable = false)
    private String artistName;

    @Column(name = "artist_surname")
    private String artistSurname;

    @Column(name = "artist_style")
    private String artistStyle;

    @Column(name = "artist_birth_year")
    private Integer artistBirthYear;

    @Column(name = "artist_img")
    private String artistImg;

    @OneToMany(mappedBy = "artist", cascade = CascadeType.ALL)
    private List<Album> albums;

    @OneToMany(mappedBy = "artist", cascade = CascadeType.ALL)
    private List<Song> songs;
    
    public Long getArtistId() {
        return artistId;
    }

    public void setArtistId(Long artistId) {
        this.artistId = artistId;
    }

    public String getArtistName() {
        return artistName;
    }

    public void setArtistName(String artistName) {
        this.artistName = artistName;
    }

    public String getArtistSurname() {
        return artistSurname;
    }

    public void setArtistSurname(String artistSurname) {
        this.artistSurname = artistSurname;
    }

    public String getArtistStyle() {
        return artistStyle;
    }

    public void setArtistStyle(String artistStyle) {
        this.artistStyle = artistStyle;
    }

    public Integer getArtistBirthYear() {
        return artistBirthYear;
    }

    public void setArtistBirthYear(Integer artistBirthYear) {
        this.artistBirthYear = artistBirthYear;
    }

    public String getArtistImg() {
        return artistImg;
    }

    public void setArtistImg(String artistImg) {
        this.artistImg = artistImg;
    }

    public List<Song> getSongs() {
        return songs;
    }

    public void setSongs(List<Song> songs) {
        this.songs = songs;
    }
}