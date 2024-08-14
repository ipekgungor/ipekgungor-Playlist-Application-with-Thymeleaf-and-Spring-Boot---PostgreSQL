package com.example.playlist_app.repository;

import com.example.playlist_app.model.Playlist;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PlaylistRepository extends JpaRepository<Playlist, Long> {
    Playlist findBySongId(Long songId);
}
