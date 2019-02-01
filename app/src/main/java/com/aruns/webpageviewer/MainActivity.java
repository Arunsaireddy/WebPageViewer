package com.aruns.webpageviewer;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
EditText et;
//WebView webView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        et=findViewById(R.id.et);


    }

    public void open(View view) {
        String url=et.getText().toString();
        if(url.length()==0)
        {
            et.setError("please enter the url");
        }else
        {//webView=findViewById(R.id.wv);
           // webView.setWebViewClient(new WebViewClient());
            //webView.loadUrl(url);
            Intent intent=new Intent(this,Main2Activity.class);
           intent.putExtra("url",url);
            startActivity(intent);
        }

    }
}
