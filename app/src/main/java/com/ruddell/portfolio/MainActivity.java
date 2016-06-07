package com.ruddell.portfolio;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private static final String TAG = "MainActivity";
    private static final boolean DEBUG_LOG = true;

    private static final String PACKAGE_MOVIE_STUDIO = "com.ruddell.moviestudio";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.popularMovies:
//                Toast.makeText(this, "This button will launch the Popular Movies app project!", Toast.LENGTH_SHORT).show();
                launchApp(PACKAGE_MOVIE_STUDIO);
                break;
            case R.id.stockHawk:
                Toast.makeText(this, "This button will launch the Stock Hawk app project!", Toast.LENGTH_SHORT).show();
                break;
            case R.id.buildItBigger:
                Toast.makeText(this, "This button will launch the Build it Bigger app project!", Toast.LENGTH_SHORT).show();
                break;
            case R.id.makeAppMaterial:
                Toast.makeText(this, "This button will launch the Make Your App Material app project!", Toast.LENGTH_SHORT).show();
                break;
            case R.id.ubiquitous:
                Toast.makeText(this, "This button will launch the Go Ubiquitous app project!", Toast.LENGTH_SHORT).show();
                break;
            case R.id.capstone:
                Toast.makeText(this, "This button will launch the Capstone app project!", Toast.LENGTH_SHORT).show();
                break;
        }
    }

    private void launchApp(String packageName) {
        Intent launchIntent = getPackageManager().getLaunchIntentForPackage(packageName);
        startActivity(launchIntent);
    }
}
