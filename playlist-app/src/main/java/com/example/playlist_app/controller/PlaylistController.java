package com.example.playlist_app.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.example.playlist_app.model.Playlist;
import com.example.playlist_app.model.Song;
import com.example.playlist_app.repository.PlaylistRepository;
import com.example.playlist_app.repository.SongRepository;

@Controller
public class PlaylistController {

    @Autowired
    private SongRepository songRepository;

    @Autowired
    private PlaylistRepository playlistRepository;

    @PostMapping("/add-playlist/{id}")
    public String addPlaylist(@PathVariable("id") Long songId, RedirectAttributes redirectAttributes) {
        Song song = songRepository.findById(songId).orElse(null);
        if (song != null) {
            Playlist existingPlaylist = playlistRepository.findBySongId(songId);
            if (existingPlaylist == null) {
                Playlist playlist = new Playlist();
                playlist.setSongId(songId);
                playlistRepository.save(playlist);
                redirectAttributes.addFlashAttribute("message", "Song added to playlist!");
            } else {
                redirectAttributes.addFlashAttribute("message", "Song is already in the playlist.");
            }
        } else {
            redirectAttributes.addFlashAttribute("message", "Song not found.");
        }
        return "redirect:/songs";
    }

    @GetMapping("/playlist")
    public String playlist(Model model) {
        List<Playlist> playlistSongs = playlistRepository.findAll();
        model.addAttribute("playlistSongs", playlistSongs);
        return "playlist";
    }

    @PostMapping("/remove-playlist/{id}")
    public String removePlaylist(@PathVariable("id") Long songId, RedirectAttributes redirectAttributes) {
        Playlist playlistSong = playlistRepository.findBySongId(songId);
        if (playlistSong != null) {
            playlistRepository.delete(playlistSong);
            redirectAttributes.addFlashAttribute("message", "Song removed from playlist.");
        }
        return "redirect:/playlist";
    }
}
