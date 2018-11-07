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

    ImageButton cartoon_rocket;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        cartoon_rocket = (ImageButton) findViewById(R.id.cartoon_rocket);

        cartoon_rocket.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                Toast.makeText(MainActivity.this, "it works", Toast.LENGTH_SHORT).show();
            }
        });
        // Example of a call to a native method
        TextView tv = (TextView) findViewById(R.id.sample_text);
        tv.setText(stringFromJNI());
    }


    public void Levels(View view) {
        Intent levelActivity = new Intent(this, LevelsActivity.class);
        startActivity(levelActivity);
    }

    public void Settings(View view) {
        Intent settingActivity = new Intent(this, SettingsActivity.class);
        startActivity(settingActivity);
    }

    public void Upgrade(View view) {
        Intent upgradeActivity = new Intent(this, UpgradeActivity.class);
        startActivity(upgradeActivity);
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
    public native String stringFromJNI();
}
