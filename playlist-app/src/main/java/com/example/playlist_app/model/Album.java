package com.example.playlist_app.model;

import jakarta.persistence.*;
import java.sql.Date;
import java.util.List;

@Entity
@Table(name = "Album")
public class Album {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "album_id")
    private Long albumId;

    @Column(name = "album_name", nullable = false)
    private String albumName;

    @Column(name = "release_date")
    private Date releaseDate;

    @Column(name = "album_img")
    private String albumImg;

    @ManyToOne
    @JoinColumn(name = "artist_id", nullable = false)
    private Artist artist;

    @OneToMany(mappedBy = "album", cascade = CascadeType.ALL, orphanRemoval = true) //It automatically applies operations on album-related songs to the songs table and automatically updates deleted data.
    private List<Song> songs;

    public Long getAlbumId() {
        return albumId;
    }

    public void setAlbumId(Long albumId) {
        this.albumId = albumId;
    }

    public String getAlbumName() {
        return albumName;
    }

    public void setAlbumName(String albumName) {
        this.albumName = albumName;
    }

    public Date getReleaseDate() {
        return releaseDate;
    }

    public void setReleaseDate(Date releaseDate) {
        this.releaseDate = releaseDate;
    }

    public String getAlbumImg() {
        return albumImg;
    }

    public void setAlbumImg(String albumImg) {
        this.albumImg = albumImg;
    }

    public Artist getArtist() {
        return artist;
    }

    public void setArtist(Artist artist) {
        this.artist = artist;
    }

    public List<Song> getSongs() {
        return songs;
    }

    public void setSongs(List<Song> songs) {
        this.songs = songs;
    }
}
