package com.example.music.dto;

import com.sun.istack.NotNull;

import javax.validation.constraints.Pattern;

public class MusicDto {
    private int id;

    @NotNull()
    @Pattern(regexp = "^[a-zA-Z]{3,45}$",message = "sai")
    private String nameOfSong;

    @NotNull()
    @Pattern(regexp = "^[a-zA-Z]{3,45}$",message = "sai")
    private String artistName;

    @NotNull()
    @Pattern(regexp = "^[a-zA-Z]{3,45}$",message = "sai")
    private String category;

    private String path;

    public MusicDto() {
    }

    public MusicDto(int id, String nameOfSong, String artistName, String category, String path) {
        this.id = id;
        this.nameOfSong = nameOfSong;
        this.artistName = artistName;
        this.category = category;
        this.path = path;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNameOfSong() {
        return nameOfSong;
    }

    public void setNameOfSong(String nameOfSong) {
        this.nameOfSong = nameOfSong;
    }

    public String getArtistName() {
        return artistName;
    }

    public void setArtistName(String artistName) {
        this.artistName = artistName;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path;
    }
}
