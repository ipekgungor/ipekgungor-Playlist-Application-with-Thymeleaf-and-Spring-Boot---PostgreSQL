package com.example.playlist_app.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.example.playlist_app.model.Artist;
import com.example.playlist_app.model.Song;
import com.example.playlist_app.repository.ArtistRepository;
import com.example.playlist_app.repository.SongRepository;

@Controller
public class ArtistController {
	
	@Autowired
	private ArtistRepository artistRepository;
	
	@Autowired
	private SongRepository songRepository;
	
    @GetMapping("/artist/{id}")
    public String artistDetail(@PathVariable("id") Long id, Model model) {
        Artist artist = artistRepository.findById(id).orElse(null);
        List<Song> songs = songRepository.findAll();
        model.addAttribute("artist", artist);
        model.addAttribute("songs", songs);
        return "artist-detail";
    }
}