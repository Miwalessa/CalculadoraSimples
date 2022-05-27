package com.example.calculadora;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    double num1, num2, res;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btnSoma = (Button) findViewById(R.id.btnSoma);
        Button btnSubtrai = (Button) findViewById(R.id.btnSubtrai);
        Button btnMultiplica = (Button) findViewById(R.id.btnMultiplica);
        Button btnDividi = (Button) findViewById(R.id.btnDividi);

        TextView resultado = (TextView) findViewById(R.id.resultado);
        EditText v1 = (EditText) findViewById(R.id.v1);
        EditText v2 = (EditText) findViewById(R.id.v2);

        btnSoma.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                num1=Double.parseDouble(v1.getText().toString());
                num2=Double.parseDouble(v2.getText().toString());
                res=num1+num2;
                resultado.setText(String.valueOf(res));

            }
        });

        btnSubtrai.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {

                num1=Double.parseDouble(v1.getText().toString());
                num2=Double.parseDouble(v2.getText().toString());
                res=num1-num2;
                resultado.setText(String.valueOf(res));

            }
        });

        btnMultiplica.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {

                num1=Double.parseDouble(v1.getText().toString());
                num2=Double.parseDouble(v2.getText().toString());
                res=num1*num2;
                resultado.setText(String.valueOf(res));

            }
        });

        btnDividi.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {

                num1=Double.parseDouble(v1.getText().toString());
                num2=Double.parseDouble(v2.getText().toString());
                res=num1/num2;
                resultado.setText(String.valueOf(res));

            }
        });

    }
}