package com.yingbin.netplayer.type;

import com.google.gson.annotations.SerializedName;

public enum SearchType {
    @SerializedName("1") SONG(1),
    @SerializedName("2") LYRIC(2),
    @SerializedName("3") USER(3),
    @SerializedName("4") ARTIST(4),
    @SerializedName("5") ALBUM(5),
    @SerializedName("6") PLAYLIST(6),
    @SerializedName("7") MV(7),
    @SerializedName("8") DJ(8);

    int value;

    private SearchType(int value) {
        this.value = value;
    }
}
