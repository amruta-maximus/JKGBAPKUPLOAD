package com.example.jkgbapkupload;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {
    public static final String downloadAPKUrl = "https://github.com/amru-nitin/GPSApplication/raw/master/app-debug.apk";
    public static final String downloadAPKUrlq = "https://github.com/amruta-maximus/JKGBAPKUPLOAD/raw/master/JKGB_MATM_PRO_1.apk";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
