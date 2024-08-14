package com.example.playlist_app.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.example.playlist_app.model.Artist;
import com.example.playlist_app.model.Song;
import com.example.playlist_app.repository.ArtistRepository;
import com.example.playlist_app.repository.SongRepository;

@Controller
public class SongController {
	
	@Autowired
	private ArtistRepository artistRepository;
	
	@Autowired
	private SongRepository songRepository;
	
	@GetMapping("/songs")
	public String song(Model model) {
		List<Artist> artists = artistRepository.findAll();
		List<Song> songs = songRepository.findAll();
		model.addAttribute("artists", artists); // we can access artists object with "artists" key in html
		model.addAttribute("songs", songs); // we can access songs object with "songs" key in html
		return "song";
	}
}