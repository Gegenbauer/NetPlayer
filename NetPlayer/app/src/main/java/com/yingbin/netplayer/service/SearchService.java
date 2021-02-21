package com.yingbin.netplayer.service;

import com.yingbin.netplayer.domain.SearchResult;
import com.yingbin.netplayer.type.SearchType;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;
import retrofit2.http.Query;

public interface SearchService {

    @GET("search/{keyword}")
    Call<SearchResult> getSearchResult(@Path("keyword") String keyword,
                                       @Query("type") SearchType searchType,
                                       @Query("offset") int offset,
                                       @Query("limit") int limit);

    Call
}
