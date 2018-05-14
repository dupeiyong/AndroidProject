package com.makeapp.hellogradle;

import android.os.Bundle;
import android.provider.Settings;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        String aipUrl = BuildConfig.APPLICATION_ID;
        Log.e("MainActivity", "aipUrl:" + aipUrl);
        String uuid = Settings.Secure.getString(
                this.getApplicationContext().getContentResolver(),
                Settings.Secure.ANDROID_ID);
        Log.e("MainActivity", "uuid:" + uuid);
    }
}
