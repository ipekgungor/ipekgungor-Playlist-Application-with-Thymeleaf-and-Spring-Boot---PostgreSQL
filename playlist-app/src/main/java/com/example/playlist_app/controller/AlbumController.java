package com.example.playlist_app.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.example.playlist_app.model.Album;
import com.example.playlist_app.model.Song;
import com.example.playlist_app.repository.AlbumRepository;

@Controller
public class AlbumController {
	@Autowired
	private AlbumRepository albumRepository;
	
    @GetMapping("/album/{id}")
    public String albumDetail(@PathVariable("id") Long id, Model model) {
        Album album = albumRepository.findByAlbumId(id);
        List<Song> songs = album != null ? album.getSongs() : List.of(); // If there is an album, it will get the songs, otherwise it will return an empty list.
        model.addAttribute("album", album);
        model.addAttribute("songs", songs);
        return "album-detail";
    }
}