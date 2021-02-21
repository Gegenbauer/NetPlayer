package com.yingbin.netplayer.domain;

import com.google.gson.annotations.SerializedName;

import java.util.Arrays;

public class Artist extends Base {
    @SerializedName("picUrl")
    private String picUrl;
    @SerializedName("alias")
    private String[] alias;
    @SerializedName("albumSize")
    private int albumSize;
    @SerializedName("picId")
    private int picId;
    @SerializedName("img1v1Url")
    private String img1v1Url;
    @SerializedName("img1v1")
    private int img1v1;
    @SerializedName("trans")
    private String trans;

    public String getPicUrl() {
        return picUrl;
    }

    public void setPicUrl(String picUrl) {
        this.picUrl = picUrl;
    }

    public String[] getAlias() {
        return alias;
    }

    public void setAlias(String[] alias) {
        this.alias = alias;
    }

    public int getAlbumSize() {
        return albumSize;
    }

    public void setAlbumSize(int albumSize) {
        this.albumSize = albumSize;
    }

    public int getPicId() {
        return picId;
    }

    public void setPicId(int picId) {
        this.picId = picId;
    }

    public String getImg1v1Url() {
        return img1v1Url;
    }

    public void setImg1v1Url(String img1v1Url) {
        this.img1v1Url = img1v1Url;
    }

    public int getImg1v1() {
        return img1v1;
    }

    public void setImg1v1(int img1v1) {
        this.img1v1 = img1v1;
    }

    public String getTrans() {
        return trans;
    }

    public void setTrans(String trans) {
        this.trans = trans;
    }

    @Override
    public String toString() {
        return "Artist{" +
                "picUrl='" + picUrl + '\'' +
                ", alias=" + Arrays.toString(alias) +
                ", albumSize=" + albumSize +
                ", picId=" + picId +
                ", img1v1Url='" + img1v1Url + '\'' +
                ", img1v1=" + img1v1 +
                ", trans='" + trans + '\'' +
                '}';
    }
}
