package com.example.music.service;


import com.example.music.model.Music;

import java.util.List;

public interface IMusicService {
    List<Music> findAll();

    void save(Music music);

    void remove(int id);

    void update(Music music);

    Music findById(int id);

}
