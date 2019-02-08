package com.example.estudiantes.calculadora;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class Calculadora extends AppCompatActivity {
    EditText editText1,editText2;
    Button buttonSuma,ButtonResta,buttonConver;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calculadora);
    }

    public void sumar (View vista){
        EditText NumeroA=(EditText) findViewById(R.id.editText1);
        EditText NumeroB=(EditText) findViewById(R.id.editText2);
        TextView resultado=(TextView) findViewById(R.id.textView2);
        int num1=Integer.parseInt(NumeroA.getText().toString());
        int num2=Integer.parseInt(NumeroB.getText().toString());
        int suma=num1+num2;
        resultado.setText("la suma de los numeros es:"+suma);
    }

    public void resta (View vista){
            EditText NumeroA=(EditText) findViewById(R.id.editText1);
            EditText NumeroB=(EditText) findViewById(R.id.editText2);
            TextView resultado=(TextView) findViewById(R.id.textView2);
            int num1=Integer.parseInt(NumeroA.getText().toString());
            int num2=Integer.parseInt(NumeroB.getText().toString());
            int resta=num1-num2;
            resultado.setText("la suma de los numeros es:"+resta);

        }
    public void Convertir (View vista) {
        EditText NumeroA = (EditText) findViewById(R.id.editText1);
        TextView resultado = (TextView) findViewById(R.id.textView2);
        float num1 = Integer.parseInt(NumeroA.getText().toString());
        float f=((9*num1)/5)+32;
        resultado.setText("el numero a en farenheit es:"+f);


    }






}
