package com.example.ragamactivity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Main6Activity extends AppCompatActivity implements View.OnClickListener {

    Button pindah6;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main6);
        pindah6 = (Button)findViewById(R.id.pindah6);
        pindah6.setOnClickListener(this);
    }

    @Override
    public void onClick(View view){
        Intent pindah6 = new Intent(this,MainActivity.class);
        startActivity(pindah6);
    }
}
