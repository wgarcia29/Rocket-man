package com.example.student.rocket_ride;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class UpgradesActivity extends AppCompatActivity implements View.OnClickListener {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_upgrades);

        Button button1 = findViewById(R.id.button1);
        Button button2 = findViewById(R.id.button2);
        Button button3 = findViewById(R.id.button3);
        Button button4 = findViewById(R.id.button3);

        button1.setOnClickListener(this);
        button2.setOnClickListener(this);
        button3.setOnClickListener(this);
        button4.setOnClickListener(this);

       // Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
      //  setSupportActionBar(toolbar);

       // FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
       // fab.setOnClickListener(new View.OnClickListener() {
        //    @Override
        //    public void onClick(View view) {
         //       Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
         //               .setAction("Action", null).show();
          //  }
       // });
    }

    @Override
    public void onClick(View view) {
        switch (v.getId()) {
            case R.id.button1:
                Toast.maketext(this, "button 1 Clicked", Toast.LENGTH_SHORT).show();
                break;

            case R.id.button2:
                Toast.maketext(this, "button 2 Clicked", Toast.LENGTH_SHORT).show();
                break;
            case R.id.button3:
                Toast.maketext(this, "button 3 Clicked", Toast.LENGTH_SHORT).show();
                break;
            case R.id.button4:
                Toast.maketext(this, "button 4 Clicked", Toast.LENGTH_SHORT).show();
                break;

        }

    }
}
