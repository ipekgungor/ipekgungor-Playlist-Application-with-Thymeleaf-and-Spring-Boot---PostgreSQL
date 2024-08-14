package com.example.playlist_app.model;

import jakarta.persistence.*;
import java.sql.Date;

@Entity
@Table(name = "Song")
public class Song {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "song_id")
    private Long songId;

    @Column(name = "song_name", nullable = false)
    private String songName;

    @Column(name = "song_release_date")
    private Date songReleaseDate;

    @Column(name = "spotify_url")
    private String spotifyUrl;

    @Column(name = "ytmusic_url")
    private String ytmusicUrl;

    @ManyToOne
    @JoinColumn(name = "artist_id", nullable = false)
    private Artist artist;

    @ManyToOne
    @JoinColumn(name = "album_id")
    private Album album;

    public Long getSongId() {
        return songId;
    }

    public void setSongId(Long songId) {
        this.songId = songId;
    }

    public String getSongName() {
        return songName;
    }

    public void setSongName(String songName) {
        this.songName = songName;
    }

    public Date getSongReleaseDate() {
        return songReleaseDate;
    }

    public void setSongReleaseDate(Date songReleaseDate) {
        this.songReleaseDate = songReleaseDate;
    }

    public String getSpotifyUrl() {
        return spotifyUrl;
    }

    public void setSpotifyUrl(String spotifyUrl) {
        this.spotifyUrl = spotifyUrl;
    }

    public String getYtmusicUrl() {
        return ytmusicUrl;
    }

    public void setYtmusicUrl(String ytmusicUrl) {
        this.ytmusicUrl = ytmusicUrl;
    }

    public Artist getArtist() {
        return artist;
    }

    public void setArtist(Artist artist) {
        this.artist = artist;
    }

    public Album getAlbum() {
        return album;
    }

    public void setAlbum(Album album) {
        this.album = album;
    }
}
