package com.example.sean.peakevilla;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ImageView logo = (ImageView) findViewById(R.id.logo);
        TextView splash = (TextView) findViewById(R.id.splash);
        TextView version = (TextView) findViewById(R.id.version);

        Animation fadeSpin = AnimationUtils.loadAnimation(this, R.anim.fade_spin);
        Animation fade1 = AnimationUtils.loadAnimation(this, R.anim.fade1);
        Animation fade2 = AnimationUtils.loadAnimation(this, R.anim.fade2);

        fadeSpin.setAnimationListener(new Animation.AnimationListener() {
            @Override
            public void onAnimationStart(Animation animation) {
            }

            @Override
            public void onAnimationEnd(Animation animation) {
                Intent intent = new Intent(MainActivity.this, MenuActivity.class);
                startActivity(intent);
            }

            @Override
            public void onAnimationRepeat(Animation animation) {

            }
        });

        logo.startAnimation(fadeSpin);
        splash.startAnimation(fade1);
        version.setAnimation(fade2);
    }

    public void onPause() {
        super.onPause();

        ImageView logo = (ImageView) findViewById(R.id.logo);
        TextView splash = (TextView) findViewById(R.id.splash);
        TextView version = (TextView) findViewById(R.id.version);


        logo.clearAnimation();
        splash.clearAnimation();
        version.clearAnimation();
    }

}

