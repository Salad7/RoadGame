package com.example.mohamed.gsuhack;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;
import android.location.Location;
public class MainActivity extends AppCompatActivity {

    TextView tv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tv = (TextView) findViewById(R.id.scoreID);
        Location location = new Location("Mohamed");
        tv.setText(location.getLatitude()+"");
    }

    @Override
    protected void onStop() { // Works
        super.onStop();
        int add = 0;
        tv.setText("OnStop");

    }

    @Override
    protected void onRestart() {
        super.onRestart();
        tv.setText("You have earned points for driving safe");
    }


}
