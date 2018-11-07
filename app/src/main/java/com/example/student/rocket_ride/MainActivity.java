package com.example.student.rocket_ride;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private Button button;  // Jonathan
    // Used to load the 'native-lib' library on application startup.
    static {
        System.loadLibrary("native-lib");
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Example of a call to a native method
        TextView tv = (TextView) findViewById(R.id.sample_text);
        tv.setText(stringFromJNI());

        button = (Button) findViewById(R.id.button); // Jonathan
        button.setOnClickListener(new View.onClickListener(){
            @Override
                    public void OnClick(View v) {
                openUpgradeActivity();

            }
        });
    }
    public void openUpgradeActivity(){
        Intent intent= new Intent (this, UpgradesActivity.class);
        startActivity(intent);

    }

    public void buttonOnClick (View v) {
        Button button=(Button) v;
        startActivity(new Intent(getApplicationContext(), UpgradesActivity.class));
    }

    /**
     * A native method that is implemented by the 'native-lib' native library,
     * which is packaged with this application.
     */
    public native String stringFromJNI();
}
