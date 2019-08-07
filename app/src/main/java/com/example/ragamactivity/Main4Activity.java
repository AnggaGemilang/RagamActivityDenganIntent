package com.example.ragamactivity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Main4Activity extends AppCompatActivity implements View.OnClickListener {

    Button pindah4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main4);
        pindah4 = (Button)findViewById(R.id.pindah4);
                pindah4.setOnClickListener(this);
    }

    @Override
    public void onClick(View view){
        Intent pindah4 = new Intent(this,Main5Activity.class);
        startActivity(pindah4);
    }
}
