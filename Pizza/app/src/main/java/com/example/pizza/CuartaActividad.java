package com.example.pizza;

import androidx.appcompat.app.AppCompatActivity;
import android.view.View;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.Toast;
import android.os.Bundle;
//Mathías Miranda
public class CuartaActividad extends AppCompatActivity {
    private EditText text1;
    String p3 ="¨Cocacola 2.50 soles";
    String p4 ="Incacola 3.00 soles";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cuarta_actividad);
        text1 = (EditText) findViewById(R.id.editText1);
    }
    public void miClicManejador1(View view) {
        switch (view.getId()) {
            case R.id.btnConvertir1:
                RadioButton cocaButton = (RadioButton)
                        findViewById(R.id.radio2);
                RadioButton incaButton = (RadioButton)
                        findViewById(R.id.radio3);

                if (cocaButton.isChecked()) {
                    text1.setText(String.valueOf(p3));
                    incaButton.setChecked(false);
                    cocaButton.setChecked(true);
                } else {
                    text1.setText(String.valueOf(p4));
                    cocaButton.setChecked(false);
                    incaButton.setChecked(true);
                }
                break;
        }
    }
}