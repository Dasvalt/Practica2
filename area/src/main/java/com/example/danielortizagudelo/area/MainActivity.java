package com.example.danielortizagudelo.area;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }




    public void onButton(View view){





        boolean checked=((RadioButton) view).isChecked();

        switch (view.getId()){

            case R.id.cuadro:
                final EditText lado,resultado;
                final Button bCalc,volver;

                if (checked)
                    setContentView(R.layout.cuadro);

                lado=(EditText) findViewById(R.id.lado);
                resultado= (EditText) findViewById(R.id.resultado);
                bCalc=(Button) findViewById(R.id.bCalc);
                volver=(Button) findViewById(R.id.volver);


                bCalc.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        double ladoA, area;

                        ladoA = Double.parseDouble(lado.getText().toString());
                        area = ladoA * ladoA;
                        resultado.setText(String.valueOf(area));


                    }
                });
                volver.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {

                        setContentView(R.layout.activity_main);
                    }
                });


                break;


            case R.id.triangulo:
                final EditText base, altura, resultadoT;
                Button volverT;

                if(checked)
                    setContentView(R.layout.triangulo);
                base=(EditText) findViewById(R.id.base);
                altura=(EditText) findViewById(R.id.altura);
                resultadoT=(EditText) findViewById(R.id.resultadoT);
                bCalc=(Button) findViewById(R.id.bCalc);
                volverT=(Button) findViewById(R.id.volverT);

                bCalc.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        double BaseT, AlturaT, areaT;

                        BaseT = Double.parseDouble(base.getText().toString());
                        AlturaT=Double.parseDouble(altura.getText().toString());
                        areaT = BaseT*AlturaT/2;
                        resultadoT.setText(String.valueOf(areaT));


                    }
                });

                volverT.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {

                        setContentView(R.layout.activity_main);
                    }
                });


                break;

            case R.id.rectangulo:
                final EditText baseR, resultadoR, alturaR;
                Button volverR;

                if(checked)

                setContentView(R.layout.rectangulo);
                baseR=(EditText) findViewById(R.id.baseR);
                alturaR=(EditText) findViewById(R.id.alturaR);
                resultadoR=(EditText) findViewById(R.id.resultadoR);
                bCalc=(Button) findViewById(R.id.bCalc);
                volverR=(Button) findViewById(R.id.volverR);

                bCalc.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        double BaseR, AlturaR, areaR;

                        BaseR = Double.parseDouble(baseR.getText().toString());
                        AlturaR=Double.parseDouble(alturaR.getText().toString());
                        areaR = BaseR*AlturaR;
                        resultadoR.setText(String.valueOf(areaR));


                    }
                });
                volverR.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {

                        setContentView(R.layout.activity_main);
                    }
                });

                    break;

            case R.id.circulo:

                final EditText radio;
                final Button bCalcC,volverCr;

                if (checked)
                    setContentView(R.layout.circulo);

                radio=(EditText) findViewById(R.id.radio);
                resultado= (EditText) findViewById(R.id.resultado);
                bCalcC=(Button) findViewById(R.id.bCalcC);
                volverCr=(Button) findViewById(R.id.volverCr);


                bCalcC.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        double radioC, areaC;

                        radioC = Double.parseDouble(radio.getText().toString());
                        areaC = radioC*radioC*3.141592;
                        resultado.setText(String.valueOf(areaC));


                    }
                });
                volverCr.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {

                        setContentView(R.layout.activity_main);
                    }
                });

                break;

        }


    }
}
