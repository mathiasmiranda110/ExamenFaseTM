package com.example.pizza;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.view.View;
import android.os.Bundle;

public class SegundaActividad extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_segunda_actividad);
    }
    public void onClick1(View view) {
        startActivity(new Intent("com.example.TerceraActividad"));
    }
    public void onClick2(View view) {
        startActivity(new Intent("com.example.CuartaActividad"));
    }
}