package com.yingbin.netplayer.domain;

import com.google.gson.annotations.SerializedName;

public class Album extends Base {
    @SerializedName("artist")
    private Artist artist;
    @SerializedName("publishTime")
    private long publishTime;
    @SerializedName("size")
    private int size;
    @SerializedName("copyrightId")
    private int copyrightId;
    @SerializedName("status")
    private int status;
    @SerializedName("picId")
    private long picId;
    @SerializedName("mark")
    private int mark;

    public Artist getArtist() {
        return artist;
    }

    public void setArtist(Artist artist) {
        this.artist = artist;
    }

    public long getPublishTime() {
        return publishTime;
    }

    public void setPublishTime(long publishTime) {
        this.publishTime = publishTime;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public int getCopyrightId() {
        return copyrightId;
    }

    public void setCopyrightId(int copyrightId) {
        this.copyrightId = copyrightId;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public long getPicId() {
        return picId;
    }

    public void setPicId(long picId) {
        this.picId = picId;
    }

    public int getMark() {
        return mark;
    }

    public void setMark(int mark) {
        this.mark = mark;
    }

    @Override
    public String toString() {
        return "Album{" +
                "artist=" + artist +
                ", publishTime=" + publishTime +
                ", size=" + size +
                ", copyrightId=" + copyrightId +
                ", status=" + status +
                ", picId=" + picId +
                ", mark=" + mark +
                '}';
    }
}
