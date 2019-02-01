package com.aruns.webpageviewer;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class Main2Activity extends AppCompatActivity {
WebView wv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        wv=findViewById(R.id.wv);
        String url=getIntent().getStringExtra("url");
        wv.setWebViewClient(new WebViewClient());
        wv.loadUrl(url);
    }
}
