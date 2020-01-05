package com.example.sean.peakevilla;

import android.app.Dialog;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.PersistableBundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

import java.text.DateFormat;

public class StoreActivity extends AppCompatActivity {

    SharedPreferences mStoreItems;
    public static final String STORE_PREFERENCES = "StorePrefs";
    public static final String STORE_PREFERENCES_SIZE = "Size";
    private static final String DEBUG_TAG ="Store";

    String TAG = "Store2";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_store);

        Log.d(TAG, "On create");
        Log.d(DEBUG_TAG, "On create");

        mStoreItems = getSharedPreferences(STORE_PREFERENCES, Context.MODE_PRIVATE);

        Context context = this;
        String msg = "View the kit and purchase some merchandise";
        int duration = Toast.LENGTH_SHORT;

        Toast toast = Toast.makeText(context, msg, duration);
        toast.show();
    }


    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.jersey_button:
                Intent intent = new Intent(this, BuyActivity.class);
                startActivity(intent);
                break;
            case R.id.jacket_button:
                Intent intent2 = new Intent(this, BuyActivity.class);
                startActivity(intent2);
                break;
            case R.id.gearbag_button:
                Intent intent3 = new Intent(this, BuyActivity.class);
                startActivity(intent3);
                break;
            case R.id.socks_button:
                Intent intent4 = new Intent(this, BuyActivity.class);
                startActivity(intent4);
                break;
            case R.id.shin_button:
                Intent intent5 = new Intent(this, BuyActivity.class);
                startActivity(intent5);
                break;
            case R.id.boots_button:
                Intent intent6 = new Intent(this, BuyActivity.class);
                startActivity(intent6);
                break;
        }
    }

}
        /*
        Button buyClicked = (Button) findViewById(R.id.jersey_button);
        Button jacketClicked = (Button) findViewById(R.id.jacket_button);
        Button bootsClicked = (Button) findViewById(R.id.boots_button);
        Button socksClicked = (Button) findViewById(R.id.socks_button);
        Button gearbagClicked = (Button) findViewById(R.id.gearbag_button);
        Button shinClicked = (Button) findViewById(R.id.shin_button);

        buyClicked.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(StoreActivity.this, BuyActivity.class);
                startActivity(intent);

                /*
                //Create Dialog
                final Dialog dialog = new Dialog(StoreActivity.this);
                Log.d(TAG, "In Activity");
                dialog.setContentView(R.layout.store_dialog);
                Log.d(TAG, "In Layout");
                dialog.setTitle("Store");
                dialog.setCancelable(true);
                Log.d(TAG, "In Dialog");

                //Create text for player information
                TextView text = (TextView) dialog.findViewById(R.id.size);
                text.setText(R.string.store_size);
                Log.d(TAG, "Text View created");

                //Create image for player
                ImageView img = (ImageView) dialog.findViewById(R.id.store_image);
                img.setImageResource(R.drawable.jersey);
                Log.d(TAG, "Image View created");

                //Create spinner for choices
                setContentView(R.layout.store_dialog);
                final Spinner spinner = (Spinner) findViewById(R.id.size_spinner);
                Log.d(TAG, "Spinner 1");
                ArrayAdapter<?> adapter = ArrayAdapter.createFromResource(StoreActivity.this,
                        R.array.size, android.R.layout.simple_spinner_item);
                Log.d(TAG, "Spinner 2");
                adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
                Log.d(TAG, "Spinner 3");
                spinner.setAdapter(adapter);
                Log.d(TAG, "Spinner 4");
                if (mStoreItems.contains(STORE_PREFERENCES_SIZE))
                {
                   spinner.setSelection(mStoreItems.getInt(STORE_PREFERENCES_SIZE,0));
                    Log.d(TAG, "Spinner if");
                }
                spinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
                    @Override
                    public void onItemSelected(AdapterView<?> parent, View itemSelected, int selectedItemPosition, long id) {
                        SharedPreferences.Editor editor = mStoreItems.edit();
                        editor.putInt(STORE_PREFERENCES_SIZE, selectedItemPosition);
                        editor.commit();
                        Log.d(TAG, "Spinner item selected");
                    }

                    @Override
                    public void onNothingSelected(AdapterView<?> parent) {

                    }
                });


                //Create button to close dialog
                Button button = (Button) dialog.findViewById(R.id.back_to_formation);
                button.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        dialog.dismiss();
                    }
                });
                //Display dialog
                dialog.show();


            }
        });


    }

    @Override
    protected void onDestroy()
    {
        Log.d(DEBUG_TAG, "SHARED PREFERNCES");
        Log.d(DEBUG_TAG, "Size (S=1, M=2, L=0) is:" + mStoreItems.getInt(STORE_PREFERENCES_SIZE,0));
        super.onDestroy();
    }
    */



