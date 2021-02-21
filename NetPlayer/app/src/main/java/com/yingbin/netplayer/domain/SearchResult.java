package com.yingbin.netplayer.domain;

import com.google.gson.annotations.SerializedName;

public class SearchResult {

    @SerializedName("result")
    private SearchData result;
    @SerializedName("code")
    private int code;

    public SearchData getResult() {
        return result;
    }

    public void setResult(SearchData result) {
        this.result = result;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    @Override
    public String toString() {
        return "SearchResult{" +
                "searchData=" + result +
                ", code=" + code +
                '}';
    }
}
