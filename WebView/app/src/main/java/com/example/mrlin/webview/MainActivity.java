package com.example.mrlin.webview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    private WebView w1;
    private Button b1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        w1 = findViewById(R.id.w1);
        w1.loadUrl("http://www.baidu.com");
/*        String htmlContent =
                "<html>\n" +
                        "<head>\n" +
                        "<title>\n" +
                        "Nice\n" +
                        "</title>\n" +
                        "</head>\n" +
                        "<body>\n" +
                        "android Webview\n" +
                        "<img src=\"file:///android_asset/timg.jpg\">\n" +
                        "</body>\n" +
                        "</html>";
        w1.loadDataWithBaseURL(null,htmlContent,"text/html","utf-8",
                null);*/
/*        w1.loadUrl("file:///mnt/shared/Other/nice.html");*/
        w1.setWebViewClient(new WebViewClient() {
            @Override
            public boolean shouldOverrideUrlLoading(WebView view, String url) {
                view.loadUrl(url);
                return true;
            }
        });
        b1 = findViewById(R.id.b1);
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(w1.canGoForward()){
                    w1.goForward();
                }
            }
        });

    }

    public void onBackPressed() {
        Log.e("MainActivity", "onBackPressed");
        if (w1.canGoBack()) {
            w1.goBack();
        } else {
            super.onBackPressed();
        }
    }
}
