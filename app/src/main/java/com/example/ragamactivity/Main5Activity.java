package com.example.ragamactivity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Main5Activity extends AppCompatActivity implements View.OnClickListener {

    Button pindah5;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main5);
        pindah5 = (Button)findViewById(R.id.pindah5);
        pindah5.setOnClickListener(this);
    }

    @Override
    public void onClick(View view){
        Intent pindah5 = new Intent(this,Main6Activity.class);
        startActivity(pindah5);
    }
}
