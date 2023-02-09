package com.artistlibrary.artist_library.controllers;

import com.artistlibrary.artist_library.models.Artist;
import com.artistlibrary.artist_library.repositories.ArtistRepository;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/artists")
public class ArtistsController {
    @Autowired
    private ArtistRepository artistRepository;
    @GetMapping
    public List<Artist> list(){
        return artistRepository.findAll();
    }
    @GetMapping
    @RequestMapping("{id}")
    public Artist get(@PathVariable Long id) {
        return artistRepository.getOne(id);
    }
    @PostMapping
    public Artist create(@RequestBody final Artist artist) {
        return artistRepository.saveAndFlush(artist);
    }
    @RequestMapping(value="{id}", method=RequestMethod.DELETE)
    public void delete(@PathVariable Long id) {
        artistRepository.deleteById(id);
    }
    @RequestMapping(value="{id}", method=RequestMethod.PUT)
    public Artist update(@PathVariable Long id, @RequestBody Artist artist) {
        Artist existingArtist = artistRepository.getOne(id);
        BeanUtils.copyProperties(artist, existingArtist, "artist_id");
        return artistRepository.saveAndFlush(existingArtist);
    }
}
