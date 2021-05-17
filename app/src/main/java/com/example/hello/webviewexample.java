package com.example.hello;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.KeyEvent;
import android.webkit.WebChromeClient;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class webviewexample extends AppCompatActivity {

    private WebView webView;
    private String url = "https://www.youtube.com/";


    @Override
    public boolean onKeyDown(int keyCode, KeyEvent event) {
        if((keyCode == KeyEvent.KEYCODE_BACK) & webView.canGoBack()){
            webView.goBack();
            return true;
        }

        return super.onKeyDown(keyCode, event);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_webviewexample);

        webView = (WebView)findViewById(R.id.webView);
        webView.getSettings().setJavaScriptEnabled(true); // 자바스크립트 허용 해주냐 마느냐
        webView.loadUrl(url); // 특정 url 을 가져오느냐
        webView.setWebChromeClient(new WebChromeClient()); // chrome 에 맞춰 최적화를 시켜 띄어주는 역할
        webView.setWebViewClient(new WebViewClientClass()); // 뒤로가기 버튼이 눌렸을 때 webview가 안정적이게 종료되도록 해줘야함.


    }

    private class WebViewClientClass extends WebViewClient {
        @Override
        public boolean shouldOverrideUrlLoading(WebView view, String url) {
            view.loadUrl(url);
            return true;
        }
    }
}