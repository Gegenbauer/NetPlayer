package com.yingbin.netplayer.domain;

import com.google.gson.annotations.SerializedName;

import java.util.List;

public class SearchData {
    @SerializedName("songs")
    private List<Song> songs;
    @SerializedName("hasMore")
    private boolean hasMore;
    @SerializedName("songCount")
    private int songCount;

    public List<Song> getSongs() {
        return songs;
    }

    public void setSongs(List<Song> songs) {
        this.songs = songs;
    }

    public boolean isHasMore() {
        return hasMore;
    }

    public void setHasMore(boolean hasMore) {
        this.hasMore = hasMore;
    }

    public int getSongCount() {
        return songCount;
    }

    public void setSongCount(int songCount) {
        this.songCount = songCount;
    }

    @Override
    public String toString() {
        return "SearchResult{" +
                "songs=" + songs +
                ", hasMore=" + hasMore +
                ", songCount=" + songCount +
                '}';
    }
}
