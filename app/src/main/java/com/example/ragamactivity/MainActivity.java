package com.example.ragamactivity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    Button pindah1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        pindah1 = (Button)findViewById(R.id.pindah1);
        pindah1.setOnClickListener(this);
    }

    @Override
    public void onClick(View view){
        Intent pindah1 = new Intent(this,Main2Activity.class);
        startActivity(pindah1);
    }

}
