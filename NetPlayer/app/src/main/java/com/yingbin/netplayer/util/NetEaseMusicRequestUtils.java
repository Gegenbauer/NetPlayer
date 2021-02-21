package com.yingbin.netplayer.util;

import com.yingbin.netplayer.BuildConfig;
import com.yingbin.netplayer.domain.SearchResult;
import com.yingbin.netplayer.service.SearchService;
import com.yingbin.netplayer.type.SearchType;

import java.util.concurrent.TimeUnit;

import okhttp3.OkHttpClient;
import okhttp3.logging.HttpLoggingInterceptor;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class NetEaseMusicRequestUtils {

    public static void getSearchResult(String keyword, SearchType searchType, int offset, int limit,
                                       Callback<SearchResult> callback){
        //步骤4:创建Retrofit对象
        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl("https://v1.hitokoto.cn/nm/") // 设置 网络请求 Url
                .addConverterFactory(GsonConverterFactory.create()) //设置使用Gson解析(记得加入依赖)
                .client(getClientWithLog().build())
                .build();

        // 步骤5:创建 网络请求接口 的实例
        SearchService request = retrofit.create(SearchService.class);

        //对 发送请求 进行封装
        Call<SearchResult> call = request.getSearchResult(keyword, searchType, offset, limit);

        //步骤6:发送网络请求(异步)
        call.enqueue(callback);
    }

    public static OkHttpClient.Builder getClientWithLog(){
        HttpLoggingInterceptor logging = new HttpLoggingInterceptor();
        //设置日志Level
        if (BuildConfig.DEBUG) {
            // development build
            logging.setLevel(HttpLoggingInterceptor.Level.BODY);
        } else {
            // production build
            logging.setLevel(HttpLoggingInterceptor.Level.BASIC);
        }
        return new OkHttpClient.Builder()
                .connectTimeout(15, TimeUnit.SECONDS)
                .readTimeout(15, TimeUnit.SECONDS)
                .writeTimeout(15, TimeUnit.SECONDS)
                //添加拦截器到OkHttp，这是最关键的
                .addInterceptor(logging);
    }
}
