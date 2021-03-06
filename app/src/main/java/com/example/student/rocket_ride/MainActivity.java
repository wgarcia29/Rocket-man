package com.example.student.rocket_ride;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.TextView;
import android.widget.Toast;


public class MainActivity extends AppCompatActivity {

    // Used to load the 'native-lib' library on application startup.
    static {
        System.loadLibrary("native-lib");
    }

    private ImageButton Wrench3;


    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Wrench3 = (ImageButton) findViewById(R.id.wrench3);
        Wrench3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent upgradeActivity = new Intent(MainActivity.this, UpgradeActivity.class);
                startActivity(upgradeActivity);            }
        });

    }


    public void Play(View view) {
        Intent levelActivity = new Intent(this, LevelSelectActivity.class);
        startActivity(levelActivity);
    }

    public void Settings(View view) {
        Intent settingActivity = new Intent(this, SettingsActivity.class);
        startActivity(settingActivity);
    }

    public void Quit(View view) {
        moveTaskToBack(true);
        android.os.Process.killProcess(android.os.Process.myPid());
        System.exit(1);
    }

    /**
     * A native method that is implemented by the 'native-lib' native library,
     * which is packaged with this application.
     */
    //public native String stringFromJNI();
}
