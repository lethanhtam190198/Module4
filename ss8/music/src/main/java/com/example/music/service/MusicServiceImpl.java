package com.example.music.service;



import com.example.music.model.Music;
import com.example.music.repository.IMusicRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MusicServiceImpl implements IMusicService {

    @Autowired
    IMusicRepository musicRepository;

    @Override
    public List<Music> findAll() {
        return musicRepository.findAll();
    }

    @Override
    public void save(Music music) {
        musicRepository.save(music);
    }

    @Override
    public void remove(int id) {
        musicRepository.deleteById(id);
    }

    @Override
    public void update(Music music) {
        musicRepository.update(music.getArtistName(),music.getCategory(),music.getNameOfSong(),music.getPath(),music.getId());
    }

    @Override
    public Music findById(int id) {
        return musicRepository.findById(id).orElse(null);
    }
}
