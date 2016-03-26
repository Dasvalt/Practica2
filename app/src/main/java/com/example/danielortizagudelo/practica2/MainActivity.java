package com.example.danielortizagudelo.practica2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.RadioButton;


public class MainActivity extends AppCompatActivity {

    EditText n1, n2, resultado;
    RadioButton suma,resta, multi, divi;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        n1=(EditText) findViewById(R.id.n1);
        n2=(EditText) findViewById(R.id.n2);
        suma=(RadioButton) findViewById(R.id.suma);
        resta=(RadioButton) findViewById(R.id.resta);
        multi=(RadioButton) findViewById(R.id.multi);
        divi=(RadioButton) findViewById(R.id.divi);
        resultado=(EditText) findViewById(R.id.resultado);

    }


        public void onRadioButtonClicked(View view) {
            // Is the button now checked?

            boolean checked = ((RadioButton) view).isChecked();

            double nA, nB, result = 0;

            nA=Double.parseDouble(n1.getText().toString());
            nB=Double.parseDouble(n2.getText().toString());


            // Check which radio button was clicked
            switch(view.getId()) {
                case R.id.suma:
                    if (checked)
                        result=nA+nB;
                    resultado.setText(String.valueOf(result));
                    checked=false;



                        break;
                case R.id.resta:
                    if (checked)
                       result=nA-nB;
                    resultado.setText(String.valueOf(result));

                    checked=false;

                        break;

                case R.id.multi:
                    if (checked)
                        result=nA*nB;
                    resultado.setText(String.valueOf(result));
                    checked=false;

                    break;
                case R.id.divi:
                    if (checked)
                        result=nA/nB;
                    resultado.setText(String.valueOf(result));
                    checked=false;

                    break;

            }
        }




}

