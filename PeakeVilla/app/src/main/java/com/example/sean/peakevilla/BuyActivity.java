package com.example.sean.peakevilla;

import android.app.Dialog;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
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

public class BuyActivity extends AppCompatActivity {

    SharedPreferences mStoreItems;
    public static final String STORE_PREFERENCES = "StorePrefs";
    public static final String STORE_PREFERENCES_SIZE = "Size";
    public static final String STORE_PREFERENCES_COLOUR = "Colour";
    public static final String STORE_PREFERENCES_DELIVERY = "Delivery";
    private static final String DEBUG_TAG ="Store";

    String TAG = "Store2";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_buy);

        Button buyClicked = (Button) findViewById(R.id.buy);
        Button backClicked = (Button) findViewById(R.id.back_to_store);

        mStoreItems = getSharedPreferences(STORE_PREFERENCES, Context.MODE_PRIVATE);

        final Spinner spinner = (Spinner) findViewById(R.id.size_spinner);
        ArrayAdapter<?> adapter = ArrayAdapter.createFromResource(this,
                R.array.size, android.R.layout.simple_spinner_item);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner.setAdapter(adapter);
        if (mStoreItems.contains(STORE_PREFERENCES_SIZE))
        {
            spinner.setSelection(mStoreItems.getInt(STORE_PREFERENCES_SIZE,0));
        }
        spinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {

            @Override
            public void onItemSelected(AdapterView<?> parent, View itemSelected, int selectedItemPosition, long id) {
                SharedPreferences.Editor editor = mStoreItems.edit();
                editor.putInt(STORE_PREFERENCES_SIZE, selectedItemPosition);
                editor.commit();
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });

        final Spinner spinner2 = (Spinner) findViewById(R.id.colour_spinner);
        ArrayAdapter<?> adapter2 = ArrayAdapter.createFromResource(this,
                R.array.colour, android.R.layout.simple_spinner_item);
        adapter2.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner2.setAdapter(adapter2);
        if (mStoreItems.contains(STORE_PREFERENCES_COLOUR))
        {
            spinner2.setSelection(mStoreItems.getInt(STORE_PREFERENCES_COLOUR,0));
        }
        spinner2.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {

            @Override
            public void onItemSelected(AdapterView<?> parent, View itemSelected, int selectedItemPosition, long id) {
                SharedPreferences.Editor editor = mStoreItems.edit();
                editor.putInt(STORE_PREFERENCES_COLOUR, selectedItemPosition);
                editor.commit();
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });

        final Spinner spinner3 = (Spinner) findViewById(R.id.delivery_spinner);
        ArrayAdapter<?> adapter3 = ArrayAdapter.createFromResource(this,
                R.array.delivery, android.R.layout.simple_spinner_item);
        adapter3.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner3.setAdapter(adapter3);
        if (mStoreItems.contains(STORE_PREFERENCES_DELIVERY))
        {
            spinner3.setSelection(mStoreItems.getInt(STORE_PREFERENCES_DELIVERY,0));
        }
        spinner3.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {

            @Override
            public void onItemSelected(AdapterView<?> parent, View itemSelected, int selectedItemPosition, long id) {
                SharedPreferences.Editor editor = mStoreItems.edit();
                editor.putInt(STORE_PREFERENCES_DELIVERY, selectedItemPosition);
                editor.commit();
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });

        buyClicked.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Context context = BuyActivity.this;
                String msg = "Purchase Successful";
                int duration = Toast.LENGTH_SHORT;

                Toast toast = Toast.makeText(context, msg, duration);
                toast.show();

            }
        });

        backClicked.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(BuyActivity.this, StoreActivity.class);
                startActivity(intent);

            }
        });
    }

    @Override
    protected void onDestroy()
    {
        Log.d(DEBUG_TAG, "SHARED PREFERNCES");
        Log.d(DEBUG_TAG, "Size (S=1, M=2, L=0) is:" + mStoreItems.getInt(STORE_PREFERENCES_SIZE,0));
        Log.d(DEBUG_TAG, "Colour (B=1, R=2, W=0) is:" + mStoreItems.getInt(STORE_PREFERENCES_COLOUR,0));
        Log.d(DEBUG_TAG, "Delivery (P=1, S=2, F=0) is:" + mStoreItems.getInt(STORE_PREFERENCES_DELIVERY,0));
        super.onDestroy();
    }
}
