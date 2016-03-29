package com.example.danielortizagudelo.formulario;

import android.app.Activity;
import android.app.DatePickerDialog;
import android.app.Dialog;
import android.app.DialogFragment;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.DatePicker;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Calendar;
import java.util.Date;

public class MainActivity extends AppCompatActivity {



    String ciudad,sexo,h1,h2,h3,h4;
    static int año;
    static int mes;
    static int dia;




    public static class DatePickerFragment extends DialogFragment
            implements DatePickerDialog.OnDateSetListener {

        @Override
        public Dialog onCreateDialog(Bundle savedInstanceState) {
            // Use the current date as the default date in the picker
            final Calendar c = Calendar.getInstance();
            int year = c.get(Calendar.YEAR);
            int month = c.get(Calendar.MONTH);
            int day = c.get(Calendar.DAY_OF_MONTH);

            // Create a new instance of DatePickerDialog and return it
            return new DatePickerDialog(getActivity(), this, year, month, day);
        }

        public void onDateSet(DatePicker view, int year, int month, int day) {

            año=year;
            mes=month;
            dia=day;

        }


    }

    public void showDatePickerDialog(View v) {
        DialogFragment newFragment = new DatePickerFragment();
        newFragment.show(getFragmentManager(),"datePicker");
    }



    public void onBox(View view) {
        // Is the view now checked?
        boolean checked = ((CheckBox) view).isChecked();

        // Check which checkbox was clicked
        switch(view.getId()) {
            case R.id.hmusica:
                if(checked)
                h1="Música";


                break;
            case R.id.hlectura:
                if(checked)
                h2="Lectura";


                break;

            case R.id.hdeporte:
                if(checked)
                h3="Deporte";
               break;

            case R.id.hviajes:
                if(checked)
                h4="Viajes";
                break;

        }
    }




    public void onButton(View view){

        boolean checked= ((RadioButton)view).isChecked();
        switch (view.getId()){
            case R.id.masculino:
                sexo="masculino";

            case R.id.femenino:
                sexo="fememino";

        }
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);






        Spinner spinner= (Spinner) findViewById(R.id.ciudades);

        ArrayAdapter<CharSequence> adapter= ArrayAdapter.createFromResource(this,
                R.array.ciudades,android.R.layout.simple_spinner_item);

        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);

        spinner.setAdapter(adapter);


        spinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {


            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {

                ciudad=parent.getItemAtPosition(position).toString();
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });



        //Botón de aceptar**********************************

        final TextView logginS, passwordS,eMailS,cityS,sexoS, dateS,hobbieS,hobbieS1,hobbieS2,hobbieS3,error1,error2;
        final  EditText loggin, password, Cpassword, mail;




        error2=(TextView) findViewById(R.id.error2);
        error1=(TextView) findViewById(R.id.error1);
        hobbieS3=(TextView) findViewById(R.id.hobbieS3);
        hobbieS2=(TextView) findViewById(R.id.hobbieS2);
        hobbieS1=(TextView) findViewById(R.id.hobbieS1);
        hobbieS=(TextView) findViewById(R.id.hobbieS);
        dateS=(TextView) findViewById(R.id.dateS);
        sexoS=(TextView) findViewById(R.id.sexoS);
        cityS=(TextView) findViewById(R.id.cityS);
        eMailS=(TextView) findViewById(R.id.eMailS);
        passwordS=(TextView) findViewById(R.id.passwordS);
        logginS=(TextView) findViewById(R.id.logginS);
        loggin=(EditText) findViewById(R.id.loggin);
        password=(EditText)findViewById(R.id.password);
        Cpassword=(EditText) findViewById(R.id.Cpassword);
        mail=(EditText) findViewById(R.id.mail);

        Button button;
        button= (Button) findViewById(R.id.button);



        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                final String Tloggin, Tpassword, TeMail;
                String TCpassword;


            String AA,MM,DD;


                Tloggin = loggin.getText().toString();

                Tpassword = password.getText().toString();

                TCpassword= Cpassword.getText().toString();



                TeMail=mail.getText().toString();

                AA=String.valueOf(año); MM=String.valueOf(mes);DD=String.valueOf(dia);



                if(Tloggin!=null&&Tpassword!=null&&TeMail!=null
                        &&ciudad!=null&&sexo!=null){}else{ error1.setText("No puden haber campos vacios");}


                if(h1!=null||h2!=null||h3!=null||h4!=null){}else{error1.setText("No pueden haber campos vacios");}


                if(Tpassword.equals(TCpassword)) {


                    error1.setText(" ");
                    error2.setText(" ");
                    logginS.setText("Usuario: "+Tloggin);
                    passwordS.setText("Contraseña: "+Tpassword);
                    eMailS.setText("eMail: "+TeMail);
                    cityS.setText("Ciudad: "+ciudad);
                    sexoS.setText("Sexo: "+sexo);
                    dateS.setText("Fecha de nacimiento: "+DD+"/"+MM+"/"+AA);
                    if(h1!=null){hobbieS.setText("Hobbies: "+h1);}
                    if(h2!=null){hobbieS1.setText(h2);}
                    if(h3!=null){hobbieS2.setText(h3);}
                    if(h4!=null){hobbieS3.setText(h4);}


                }else{
                    error2.setText("No coinciden las contraseñas");
                }

            }
        });



//limite
    }
}

