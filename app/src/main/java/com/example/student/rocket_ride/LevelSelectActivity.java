package com.example.student.rocket_ride;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.Toast;


public class LevelSelectActivity extends AppCompatActivity {

    private ImageButton level1;
    private ImageButton level2;
    private ImageButton level3;
    private ImageButton level4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_level_select);

        level1 = findViewById(R.id.level_1);
        level2 = findViewById(R.id.level_2);
        level3 = findViewById(R.id.level_3);
        level4 = findViewById(R.id.level_4);

        level1.setOnClickListener(toastListener);
        level2.setOnClickListener(toastListener);
        level3.setOnClickListener(toastListener);
        level4.setOnClickListener(toastListener);


    }


    private View.OnClickListener toastListener = new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(LevelSelectActivity.this, view.getTag().toString(), Toast.LENGTH_SHORT).show();
            }
        };


}
