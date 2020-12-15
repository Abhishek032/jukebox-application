package com.abhishek.jukeboxapplication.service;

import java.util.List;

import com.abhishek.jukeboxapplication.model.MusicAlbum;
import com.abhishek.jukeboxapplication.model.Musician;

public interface JukeBoxService {

	MusicAlbum addMusicAlbum(MusicAlbum musicAlbum);

	MusicAlbum updateMusicAlbum(Long musicAlbumId, MusicAlbum musicAlbum);

	List<MusicAlbum> getAllMusicAlbums();

	List<MusicAlbum> getMusicAlbumsByMusician(Long musicianId);

	Musician addMusician(Musician musician);

	Musician updateMusician(Long musicianId, Musician musician);

	List<Musician> getMusiciansByMusicAlbum(Long musicAlbumId);
}
