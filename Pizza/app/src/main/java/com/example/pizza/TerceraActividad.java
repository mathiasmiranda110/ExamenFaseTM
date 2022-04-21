package com.example.pizza;

import androidx.appcompat.app.AppCompatActivity;
import android.view.View;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.Toast;
import android.os.Bundle;

public class TerceraActividad extends AppCompatActivity {
    private EditText text;
String p1 ="¨Pizza Americana 30.0 soles";
String p2 ="Pizza Peperoni 50.0 soles";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tercera_actividad);
        text = (EditText) findViewById(R.id.editText);
    }
    public void miClicManejador(View view) {
        switch (view.getId()) {
            case R.id.btnConvertir:
                RadioButton americanaButton = (RadioButton)
                        findViewById(R.id.radio0);
                RadioButton peperoniButton = (RadioButton)
                        findViewById(R.id.radio1);

                if (americanaButton.isChecked()) {
                    text.setText(String.valueOf(p1));
                    americanaButton.setChecked(false);
                    peperoniButton.setChecked(true);
                } else {
                    text.setText(String.valueOf(p2));
                    peperoniButton.setChecked(false);
                    americanaButton.setChecked(true);
                }
                break;
        }
    }

}