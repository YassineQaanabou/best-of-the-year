package org.learning.bestoftheyear.model;

public class Songs {
    private int songId;
    private String songName;

    public Songs(int songId, String songName) {
        this.songId = songId;
        this.songName = songName;
    }

    public Songs() {
    }

    public int getSongId() {
        return songId;
    }

    public String getSongName() {
        return songName;
    }

    public void setSongId(int songId) {
        this.songId = songId;
    }

    public void setSongName(String songName) {
        this.songName = songName;
    }
}
