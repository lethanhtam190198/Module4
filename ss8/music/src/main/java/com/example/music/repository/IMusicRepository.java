package com.example.music.repository;


import com.example.music.model.Music;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import javax.transaction.Transactional;

@Transactional
public interface IMusicRepository extends JpaRepository<Music, Integer> {
    @Modifying
    @Query(value = "update music set artist_name = :artist_name, category=:category, name_of_song=:name_of_song , path=:path  where id = :id", nativeQuery = true)
    void update(@Param("artist_name") String artist_name,@Param("category") String category,@Param("name_of_song") String name_of_song,@Param("path") String path, @Param("id")int id);
}
