package com.example.playlist_app.model;

import jakarta.persistence.*;

@Entity
@Table(name = "Playlist")
public class Playlist {

    @Id
    @Column(name = "song_id")
    private Long songId;

    @OneToOne // Because of the OneToOne relationship there is no information about playlist in the song table.
    @JoinColumn(name = "song_id", insertable = false, updatable = false)
    private Song song;

    public Long getSongId() {
        return songId;
    }

    public void setSongId(Long songId) {
        this.songId = songId;
    }

    public Song getSong() {
        return song;
    }

    public void setSong(Song song) {
        this.song = song;
    }
}
