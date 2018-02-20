package com.sslty.gifdrawableview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.sslty.library.GifDrawableView;

public class MainActivity extends AppCompatActivity {

    private GifDrawableView gifDrawableView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        gifDrawableView = findViewById(R.id.gif);
        gifDrawableView.showGif(R.drawable.opendoor_loading, R.drawable.opendoor_success);
    }
}
