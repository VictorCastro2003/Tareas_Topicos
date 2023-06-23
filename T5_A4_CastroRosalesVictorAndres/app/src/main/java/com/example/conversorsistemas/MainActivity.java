package com.example.conversorsistemas;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.RadioButton;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    RadioButton rbDecimal,rbBinario,rbOctal,rbHexa;
    CheckBox cbBinario,cbOctal,cbHexa;
    TextView cajaIngresar,cajaOctal,cajaBinario,cajaHexa;
    byte checkSelec;

    Conversiones c = new Conversiones();

    int numeroIngresado;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        rbDecimal=findViewById(R.id.rbDecimal);
        rbBinario=findViewById(R.id.rbBinario);
        rbOctal=findViewById(R.id.rbOctal);
        rbHexa=findViewById(R.id.rbHexa);

        cbBinario=findViewById(R.id.cbBinario);
        cbOctal=findViewById(R.id.cbOctal);
        cbHexa=findViewById(R.id.cbHexa);

        cajaIngresar=findViewById(R.id.cajaIngresar);
        cajaBinario=findViewById(R.id.cajaBinario);
        cajaOctal=findViewById(R.id.cajaOctal);
        cajaHexa=findViewById(R.id.cajaHexa);

        cajaBinario.setEnabled(false);
        cajaOctal.setEnabled(false);
        cajaHexa.setEnabled(false);

    }
    public void checkSelect(View v){
        if(v.getId()==R.id.cbBinario){
            if(cbBinario.isChecked())
                checkSelec=1;
        }else if (v.getId()==R.id.cbOctal){
            if(cbOctal.isChecked())
                checkSelec=1;
            checkSelec=2;
        }else{
            if(cbHexa.isChecked())
                checkSelec=3;

        }
    }

    public  void btBinario(View v){
        if(cajaIngresar.getText().toString().isEmpty()){
            cajaBinario.setText("0");
        }else{
            if(checkSelec==1){
                cajaBinario.setText(cajaIngresar.getText().toString());
            }else if(checkSelec==2){
                numeroIngresado=c.binarioADecimal(Integer.parseInt(cajaIngresar.getText().toString()));
                cajaOctal.setText(c.decimalAOctal(numeroIngresado));
            }else{
                numeroIngresado=c.binarioADecimal(Integer.parseInt(cajaIngresar.getText().toString()));
                cajaHexa.setText(c.decimalAHexadecimal(numeroIngresado));
            }
        }
    }
    public  void btDecimal(View v){

        if(cajaIngresar.getText().toString().isEmpty()){
            numeroIngresado=0;
            cajaIngresar.setText("0");
            long resultado=c.decimalABinario(numeroIngresado);
            cajaBinario.setText(resultado+"");
        }else{
            numeroIngresado=Integer.parseInt(cajaIngresar.getText().toString());
            if(checkSelec==1){
                long resultado=c.decimalABinario(numeroIngresado);
                cajaBinario.setText(resultado+"");
            }else if(checkSelec==2){
                cajaOctal.setText(c.decimalAOctal(numeroIngresado));
            }else if(checkSelec==3){
                cajaHexa.setText(c.decimalAHexadecimal(numeroIngresado));
            }
        }
    }
    public  void btHexa(View v){

        if(cajaIngresar.getText().toString().isEmpty()){
            cajaIngresar.setText("0");
            numeroIngresado=0;
        }else{
            numeroIngresado=Integer.parseInt(cajaIngresar.getText().toString());
            if(checkSelec==1){
                int convercion= c.hexadecimalADecimal(cajaIngresar.getText().toString());
                cajaBinario.setText(c.decimalABinario(convercion)+"");
            }else if(checkSelec==2){
                int convercion= c.hexadecimalADecimal(cajaIngresar.getText().toString());
                String res=c.decimalAOctal(convercion);
                cajaOctal.setText(res);
            }else{
                cajaHexa.setText(cajaIngresar.getText().toString());
            }
        }
    }

    public  void btOcta(View v){
        if(cajaIngresar.getText().toString().isEmpty()){
            numeroIngresado=0;
            cajaIngresar.setText("0");
        }else{
            numeroIngresado=Integer.parseInt(cajaIngresar.getText().toString());
            if(checkSelec==1){
                int dec=c.octalADecimal(numeroIngresado);
                long res=c.decimalABinario(dec);
                cajaBinario.setText(res+"");
            }else if(checkSelec==2){
                cajaOctal.setText(cajaIngresar.getText().toString());
            }else if(checkSelec==3){
                int dec=c.octalADecimal(numeroIngresado);
                cajaHexa.setText(c.decimalAHexadecimal(dec));
            }
        }
    }


    @Override
    public void onClick(View v) {

    }
}


