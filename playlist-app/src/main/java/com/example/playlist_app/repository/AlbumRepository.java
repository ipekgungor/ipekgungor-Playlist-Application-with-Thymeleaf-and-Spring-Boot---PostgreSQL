package com.example.playlist_app.repository;

import com.example.playlist_app.model.Album;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AlbumRepository extends JpaRepository<Album, Long> {
    Album findByAlbumId(Long albumId);
}
