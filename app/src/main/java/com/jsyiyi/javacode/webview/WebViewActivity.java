package com.jsyiyi.javacode.webview;

import android.os.Bundle;
import android.view.View;
import android.webkit.WebSettings;
import android.webkit.WebView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import com.jsyiyi.testkotlin.R;

public class WebViewActivity extends AppCompatActivity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_webview);
        WebView webView = (WebView) findViewById(R.id.webView);
        WebSettings settings =webView.getSettings();
        settings.setJavaScriptEnabled(true);
        webView.loadUrl("https://p.yiyiny.com/p2/#/personalCenter/download/download?from=nongchang");
    }
}
