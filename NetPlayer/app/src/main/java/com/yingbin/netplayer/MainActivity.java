package com.yingbin.netplayer;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;

import com.yingbin.netplayer.domain.SearchData;
import com.yingbin.netplayer.domain.SearchResult;
import com.yingbin.netplayer.type.SearchType;
import com.yingbin.netplayer.util.NetEaseMusicRequestUtils;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class MainActivity extends AppCompatActivity {
    private static final String TAG = "MainActivity";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        NetEaseMusicRequestUtils.getSearchResult("海阔天空", SearchType.SONG, 0, 1, new Callback<SearchResult>() {
            @Override
            public void onResponse(Call<SearchResult> call, Response<SearchResult> response) {
                TextView textView = findViewById(R.id.text);
                textView.setText(response.body().toString());
            }

            @Override
            public void onFailure(Call<SearchResult> call, Throwable t) {
                Log.d(TAG, "onFailure: " + t.getMessage());
            }
        });
    }
}