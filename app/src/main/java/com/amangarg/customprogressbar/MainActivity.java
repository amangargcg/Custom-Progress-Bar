package com.amangarg.customprogressbar;

import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ProgressBar;

public class MainActivity extends AppCompatActivity {
    ProgressBar progressBar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        progressBar = findViewById(R.id.progressBar1);

        Drawable draw = getResources().getDrawable(R.drawable.custom_progressbar);
        progressBar.setProgressDrawable(draw);
    }
}