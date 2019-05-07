package com.emon.shareprefarensedemo;

import android.content.SharedPreferences;
import android.support.v4.app.NavUtils;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;
import android.widget.TextView;

public class Main2Activity extends AppCompatActivity {
    private SharedPreferences sharedPreferences;
    private SharedPreferences.Editor editor;
    TextView nameTv, ageTv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        nameTv = findViewById(R.id.nameTv);
        ageTv = findViewById(R.id.ageTv);
        sharedPreferences = getApplicationContext().getSharedPreferences("Userdatail", MODE_PRIVATE);
        editor = sharedPreferences.edit();

        nameTv.setText(sharedPreferences.getString("name", null));
        ageTv.setText(sharedPreferences.getString("age", null));

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);


    }

}
