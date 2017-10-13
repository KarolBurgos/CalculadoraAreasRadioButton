package com.example.sistemas.aplicacionradiobutton;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.TextView;
import android.view.View;
import android.content.Intent;
import android.widget.Toast;
import android.view.Gravity;

public class MainActivity extends AppCompatActivity {

    private TextView txc1;
    private EditText base,altura,lado1,lado2,radio;
    private RadioButton rx1,rx2,rx3;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        base=(EditText)findViewById(R.id.editText2);
        altura=(EditText)findViewById(R.id.editText3);
        lado1=(EditText)findViewById(R.id.editText4);
        lado2=(EditText)findViewById(R.id.editText5);
        radio=(EditText)findViewById(R.id.editText6);



        rx1=(RadioButton)findViewById(R.id.r1);
        rx2=(RadioButton)findViewById(R.id.r2);
        rx3=(RadioButton)findViewById(R.id.r3);
    }

    public void operar(View view) {

        if (rx1.isChecked()==true) {
            String valor5=radio.getText().toString();
            int nro5=Integer.parseInt(valor5);
            double circulo=Math.PI*(nro5)*(nro5);
            String resu=String.valueOf("EL AREA DEL CIRCULO ES:"+circulo);
            Toast toast = Toast.makeText(this, resu, Toast.LENGTH_SHORT);
            toast.show();
        } else
        if (rx2.isChecked()==true) {
            String valor1=base.getText().toString();
            String valor2=altura.getText().toString();
            int nro1=Integer.parseInt(valor1);
            int nro2=Integer.parseInt(valor2);

            int triangulo=(nro1*nro2)/2;
            String resu=String.valueOf("EL AREA DEL TRIANGULO ES:"+triangulo);
            Toast toast = Toast.makeText(this, resu, Toast.LENGTH_SHORT);
            toast.show();
        }else
        if(rx3.isChecked()==true) {
            String valor3=lado1.getText().toString();
            String valor4=lado2.getText().toString();
            int nro3=Integer.parseInt(valor3);
            int nro4=Integer.parseInt(valor4);

            int rectangulo=nro3*nro4;
            String resu=String.valueOf("EL AREA DEL RECTANGULO ES:"+rectangulo);
            Toast toast = Toast.makeText(this, resu, Toast.LENGTH_SHORT);
            toast.show();

        }
    }

    public void acercade(View view) {
        Intent i = new Intent(this, acercaDe.class );
        startActivity(i);
    }

    public void prueba1(View v) {
        Toast toast = Toast.makeText(this, "Mensaje 1", Toast.LENGTH_SHORT);
        toast.show();
    }




}
