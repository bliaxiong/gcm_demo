package gcm.play.android.samples.com.gcmquickstart;

import android.content.Intent;
import android.os.Bundle;
import android.provider.SyncStateContract;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.webkit.WebView;
import android.widget.LinearLayout;

/**
 * Created by z001kxv on 12/4/15.
 */
public class SecondActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.second);

//        WebView web = (WebView) findViewById(R.id.webView);
//        web.getSettings().setJavaScriptEnabled(true);
//        web.getSettings().setUseWideViewPort(false);
//        web.loadUrl("https://www.target.com");

        Intent intent = getIntent();
        String click_action = intent.getExtras().getString("gcm.notification.click_action");
        if (click_action == "OPEN_ACTIVITY_1") {
            Log.d("PUSH", click_action);
            Log.d("PUSH", intent.getExtras().getString("key1"));
        }
    }

    public void gotoMain(View view) {
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
    }

}
