package ex.music.repository;

import ex.music.model.Music;

import java.util.List;

public interface IMusicRepository {
    List<Music> findAll();

    void save(Music music);

    void remove(int id);

    void update(Music music);

    Music findById(int id);
}
