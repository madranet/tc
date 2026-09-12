package com.thinkcar.diagtest;

import android.app.Activity;
import android.os.Bundle;
import android.os.Handler;
import android.widget.TextView;

public class MainActivity extends Activity {

    private TextView label;
    private final Handler handler = new Handler();
    private int seconds = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        label = new TextView(this);
        label.setTextSize(24);
        setContentView(label);

        handler.post(ticker);
    }

    private final Runnable ticker = new Runnable() {
        @Override
        public void run() {
            seconds++;
            label.setText("com.thinkcar prefix test\nStill foregrounded: " + seconds + "s");
            handler.postDelayed(this, 1000);
        }
    };
}
