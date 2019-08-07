package com.example.ragamactivity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Main2Activity extends AppCompatActivity implements View.OnClickListener{

    Button pindah2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        pindah2 = (Button) findViewById(R.id.pindah2);
        pindah2.setOnClickListener(this);
    }

    @Override
    public void onClick(View view){
        Intent pindah2 = new Intent(this,Main3Activity.class);
        startActivity(pindah2);
    }
}
