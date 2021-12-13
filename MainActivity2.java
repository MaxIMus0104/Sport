package com.example.myapplication;

import android.annotation.TargetApi;
import android.os.Build;
import android.os.Bundle;
import android.webkit.WebResourceRequest;
import android.webkit.WebView;
import android.webkit.WebViewClient;

import androidx.fragment.app.FragmentActivity;

/*
 * Main Activity class that loads {@link MainFragment}.
 */
public class MainActivity2 extends FragmentActivity {

    

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        WebView webView =findViewById(R.id.WebView);
        webView.getSettings().setJavaScriptEnabled(true);
        webView.loadUrl("https://www.flashscore.com/");

        WebViewClient webViewClient = new WebViewClient() {
           @SuppressWarnings("deprecation") @Override
           public boolean shouldOverrideUrlLoading(WebView view, String Url) {
               view.loadUrl(Url);
               return true;
           }
           @TargetApi(Build.VERSION_CODES.N) @Override
           public boolean shouldOverrideUrlLoading(WebView view, WebResourceRequest request) {
               view.loadUrl(request.getUrl().toString());
               return true;
           }
        };
        webView.setWebViewClient(webViewClient);


        }
    }
