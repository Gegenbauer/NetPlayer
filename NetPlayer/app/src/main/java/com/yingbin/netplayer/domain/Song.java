package com.yingbin.netplayer.domain;

import com.google.gson.annotations.SerializedName;

import java.util.Arrays;
import java.util.List;

public class Song extends Base {
    @SerializedName("artists")
    private List<Artist> artists;
    @SerializedName("album")
    private Album album;
    @SerializedName("duration")
    private long duration;
    @SerializedName("copyrightId")
    private int copyrightId;
    @SerializedName("status")
    private int status;
    @SerializedName("alias")
    private String[] alias;
    @SerializedName("rtype")
    private int rtype;
    @SerializedName("ftype")
    private int ftype;
    @SerializedName("mvid")
    private int mvid;
    @SerializedName("fee")
    private int fee;
    @SerializedName("rUrl")
    private String rUrl;
    @SerializedName("mark")
    private int mark;

    public List<Artist> getArtists() {
        return artists;
    }

    public void setArtists(List<Artist> artists) {
        this.artists = artists;
    }

    public Album getAlbum() {
        return album;
    }

    public void setAlbum(Album album) {
        this.album = album;
    }

    public long getDuration() {
        return duration;
    }

    public void setDuration(long duration) {
        this.duration = duration;
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

    public String[] getAlias() {
        return alias;
    }

    public void setAlias(String[] alias) {
        this.alias = alias;
    }

    public int getRtype() {
        return rtype;
    }

    public void setRtype(int rtype) {
        this.rtype = rtype;
    }

    public int getFtype() {
        return ftype;
    }

    public void setFtype(int ftype) {
        this.ftype = ftype;
    }

    public int getMvid() {
        return mvid;
    }

    public void setMvid(int mvid) {
        this.mvid = mvid;
    }

    public int getFee() {
        return fee;
    }

    public void setFee(int fee) {
        this.fee = fee;
    }

    public String getrUrl() {
        return rUrl;
    }

    public void setrUrl(String rUrl) {
        this.rUrl = rUrl;
    }

    public int getMark() {
        return mark;
    }

    public void setMark(int mark) {
        this.mark = mark;
    }

    @Override
    public String toString() {
        return "Song{" +
                "artists=" + artists +
                ", album=" + album +
                ", duration=" + duration +
                ", copyrightId=" + copyrightId +
                ", status=" + status +
                ", alias=" + Arrays.toString(alias) +
                ", rtype=" + rtype +
                ", ftype=" + ftype +
                ", mvid=" + mvid +
                ", fee=" + fee +
                ", rUrl='" + rUrl + '\'' +
                ", mark=" + mark +
                '}';
    }
}
