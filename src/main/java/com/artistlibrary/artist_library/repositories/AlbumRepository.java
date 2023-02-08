package com.artistlibrary.artist_library.repositories;

import com.artistlibrary.artist_library.models.Album;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AlbumRepository extends JpaRepository<Album, Long> {
}
