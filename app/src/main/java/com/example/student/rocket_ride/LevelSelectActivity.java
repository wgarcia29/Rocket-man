package com.example.student.rocket_ride;

import android.content.Intent;
import android.graphics.Canvas;
import android.graphics.Point;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.Toast;


public class LevelSelectActivity extends AppCompatActivity {

    private ImageButton level1;
    private ImageButton level2;
    private ImageButton level3;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_level_select);
        level1 = (ImageButton) findViewById(R.id.level_1);
        level2 = (ImageButton) findViewById(R.id.level_2);
        level3 = (ImageButton) findViewById(R.id.level_3);

        level1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent upgradeActivity = new Intent(LevelSelectActivity.this, Level1_Activity.class);
                startActivity(upgradeActivity);
            }
        });

        level2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent upgradeActivity = new Intent(LevelSelectActivity.this, activity_level2.class);
                startActivity(upgradeActivity);
            }
        });

        level3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent upgradeActivity = new Intent(LevelSelectActivity.this, activity_level3.class);
                startActivity(upgradeActivity);
            }
        });

    }
}



/*
    public void Upgrade(View view) {
        Intent upgradeActivity = new Intent(this, UpgradeActivity.class);
        startActivity(upgradeActivity);
    }
*/
