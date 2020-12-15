package com.abhishek.jukeboxapplication.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.abhishek.jukeboxapplication.model.MusicAlbum;
import com.abhishek.jukeboxapplication.model.Musician;

@Repository
public interface MusicAlbumRepository extends JpaRepository<MusicAlbum, Long> {
	List<MusicAlbum> findAllByMusiciansOrderByPrice(Musician musician);
}
