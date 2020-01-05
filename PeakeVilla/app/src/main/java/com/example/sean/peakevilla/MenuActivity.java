package com.example.sean.peakevilla;

import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class MenuActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);

        Context context = this;
        String msg = "Use the Buttons to Navigate through the App";
        int duration = Toast.LENGTH_SHORT;

        Toast toast = Toast.makeText(context, msg, duration);
        toast.show();
    }

    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.info_button:
                Intent intent = new Intent(this, InfoActivity.class);
                startActivity(intent);
                break;
            case R.id.news_button:
                Intent intent2 = new Intent(this, NewsActivity.class);
                startActivity(intent2);
                break;
            case R.id.formation_button:
                Intent intent3 = new Intent(this, FormationActivity.class);
                startActivity(intent3);
                break;
            case R.id.store_button:
                Intent intent4 = new Intent(this, StoreActivity.class);
                startActivity(intent4);
                break;
            case R.id.location_button:
                Intent intent5 = new Intent(this, MapsActivity.class);
                startActivity(intent5);
                break;
        }
    }
}

