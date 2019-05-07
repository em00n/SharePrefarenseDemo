package com.emon.shareprefarensedemo;

import android.content.Intent;
import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private EditText editText1, editText2;
    private SharedPreferences sharedPreferences;
    private SharedPreferences.Editor editor;
    private String name, age;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        editText1 = findViewById(R.id.nameEt);
        editText2 = findViewById(R.id.ageEt);

        sharedPreferences = getApplicationContext().getSharedPreferences("Userdatail", MODE_PRIVATE);
        editor = sharedPreferences.edit();
    }


    public void submit(View view) {
        name = editText1.getText().toString();
        age = editText2.getText().toString();

        editor.putString("name", name);
        editor.putString("age", age);
        editor.commit();
        editText1.getText().clear();
        editText2.getText().clear();
        startActivity(new Intent(MainActivity.this, Main2Activity.class));

    }
}
