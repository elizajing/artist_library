package com.artistlibrary.artist_library.repositories;

import com.artistlibrary.artist_library.models.Artist;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ArtistRepository extends JpaRepository<Artist, Long> {
}
