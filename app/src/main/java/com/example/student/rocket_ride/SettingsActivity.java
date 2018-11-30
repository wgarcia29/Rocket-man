package com.example.student.rocket_ride;

import android.content.SharedPreferences;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.SwitchCompat;
import android.support.v7.widget.Toolbar;
import android.view.View;

public class SettingsActivity extends AppCompatActivity {
/*
    SwitchCompat musicSwitch, soundSwitch, thirdSwitch;

    boolean musicState, soundState, thirdState;

    SharedPreferences preferences;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_settings);

        preferences = getSharedPreferences("PREFS", 0);
        musicState = preferences.getBoolean("musicSwitch", false);
        soundState = preferences.getBoolean("soundSwitch", false);
        thirdState = preferences.getBoolean("thirdSwitch", false);

        musicSwitch = (SwitchCompat) findViewById(R.id.musicSwitch);
        soundSwitch = (SwitchCompat) findViewById(R.id.soundSwitch);
        thirdSwitch = (SwitchCompat) findViewById(R.id.thirdSwitch);

        musicSwitch.setChecked(musicState);
        soundSwitch.setChecked(soundState);
        thirdSwitch.setChecked(thirdState);

        musicSwitch.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                musicState = !musicState;
                musicSwitch.setChecked(musicState);
                SharedPreferences.Editor editor = preferences.edit();
                editor.putBoolean("music_Switch", musicState);
                editor.apply();
            }
        });
        soundSwitch.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                soundState = !soundState;
                soundSwitch.setChecked(soundState);
                SharedPreferences.Editor editor = preferences.edit();
                editor.putBoolean("sound_Switch", soundState);
                editor.apply();
            }
        });
        thirdSwitch.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                thirdState = !thirdState;
                thirdSwitch.setChecked(thirdState);
                SharedPreferences.Editor editor = preferences.edit();
                editor.putBoolean("third_Switch", thirdState);
                editor.apply();
            }
        });
    }
    */
}