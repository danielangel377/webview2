package com.example.webview2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class pagina2 extends AppCompatActivity {
    WebView web;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pagina3 );
        web = (WebView)findViewById(R.id.pagina);
        web.setWebViewClient(new imprimir());
    Bundle get=getIntent().getExtras();
    String buscar =get.getString("");
    web.getSettings().setLoadsImagesAutomatically(true);
    web.getSettings().setJavaScriptEnabled(true);
    web.setScrollBarStyle(View.SCROLLBARS_INSIDE_OVERLAY);
    web.loadUrl(buscar);
    }

    private class imprimir extends WebViewClient {
public boolean zelda1(WebView v, String zelda){
        v.loadUrl(zelda);
return true;
}
    }
}