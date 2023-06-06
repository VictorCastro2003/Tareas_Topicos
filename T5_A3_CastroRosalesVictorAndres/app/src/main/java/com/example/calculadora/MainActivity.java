package com.example.calculadora;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;

import java.text.DecimalFormat;

public class MainActivity extends AppCompatActivity {
    DecimalFormat decimalFormat = new DecimalFormat("#.##");
    String texto ="";
    EditText caja_Principal;
    double num1=0,num2=0;
    String operador="";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        caja_Principal=findViewById(R.id.Caja_Principal);

    }

    public void MostrarSiete(View v){

        if(caja_Principal.getText().toString()==""){
            caja_Principal.setText("7");
        }else {
            caja_Principal.setText(caja_Principal.getText()+"7");
        }
    }

    public void MostrarOcho(View v){

        if(caja_Principal.getText().toString()==""){
            caja_Principal.setText("8");
        }else {
            caja_Principal.setText(caja_Principal.getText()+"8");
        }
    }
    public void MostrarNueve(View v){

        if(caja_Principal.getText().toString()==""){
            caja_Principal.setText("9");
        }else {
            caja_Principal.setText(caja_Principal.getText()+"9");
        }
    }

    public void MostrarSeis(View v){

        if(caja_Principal.getText().toString()==""){
            caja_Principal.setText("6");
        }else {
            caja_Principal.setText(caja_Principal.getText()+"6");
        }
    }

    public void MostrarCinco(View v){

        if(caja_Principal.getText().toString()==""){
            caja_Principal.setText("5");
        }else {
            caja_Principal.setText(caja_Principal.getText()+"5");
        }
    }
    public void MostrarCuatro(View v){

        if(caja_Principal.getText().toString()==""){
            caja_Principal.setText("4");
        }else {
            caja_Principal.setText(caja_Principal.getText()+"4");
        }
    }

    public void MostrarUno(View v){

        if(caja_Principal.getText().toString()==""){
            caja_Principal.setText("1");
        }else {
            caja_Principal.setText(caja_Principal.getText()+"1");
        }
    }

    public void MostrarDos(View v){

        if(caja_Principal.getText().toString()==""){
            caja_Principal.setText("2");
        }else {
            caja_Principal.setText(caja_Principal.getText()+"2");
        }
    }
    public void MostrarTres(View v){

        if(caja_Principal.getText().toString()==""){
            caja_Principal.setText("3");
        }else {
            caja_Principal.setText(caja_Principal.getText()+"3");
        }
    }
    public void MostrarCero(View v){

        if(caja_Principal.getText().toString()==""){
            caja_Principal.setText("0");
        }else {
            caja_Principal.setText(caja_Principal.getText()+"0");
        }
    }
    public void MostrarPunto(View v){

        if(caja_Principal.getText().toString().contains(".")&&caja_Principal.getText().toString().toString()!=""){

        }else {
            caja_Principal.setText(caja_Principal.getText()+".");
        }
    }
    public void btnregresar(View v) {
      texto= caja_Principal.getText().toString();
        if (texto.length() > 0) {
            texto = texto.substring(0, texto.length() - 1);
            caja_Principal.setText(texto);
        }
    }
    public void multiplicacion(View v){
         texto= caja_Principal.getText().toString();
        if(texto.length()>0) {
            num1 = Double.parseDouble(caja_Principal.getText().toString());
            caja_Principal.setText("");
            operador = "*";
        }
    }
    public void porcentaje(View v){
        texto= caja_Principal.getText().toString();
        if(texto.length()>0) {
            num1 = Double.parseDouble(caja_Principal.getText().toString());
            num2=(num1/100);
            caja_Principal.setText(decimalFormat.format(num2));
        }
    }
    public void Division(View v){
        texto= caja_Principal.getText().toString();
        if(texto.length()>0) {

            num1 = Double.parseDouble(caja_Principal.getText().toString());
            caja_Principal.setText("");
            operador = "/";
        }
    }
    public void Suma(View v){
        texto= caja_Principal.getText().toString();
        if(texto.length()>0) {
            num1 = Double.parseDouble(caja_Principal.getText().toString());
            caja_Principal.setText("");
            operador = "+";
        }
    }
    public void Resta(View v){
        texto= caja_Principal.getText().toString();
        if(texto.length()>0) {
            num1 = Double.parseDouble(caja_Principal.getText().toString());
            caja_Principal.setText("");
            operador = "-";
        }
    }
    public void raizC(View v){

        texto= caja_Principal.getText().toString();
        if(texto.length()>0) {

          num1= Double.parseDouble(caja_Principal.getText().toString());
          num2= (float) Math.sqrt(num1);
          caja_Principal.setText(decimalFormat.format(num2));
      }
    }
    public void potenciaC (View v){
        texto= caja_Principal.getText().toString();
        if(texto.length()>0) {
        num1= Double.parseDouble(caja_Principal.getText().toString());
        num2= (double) Math.pow(num1,2);
        caja_Principal.setText(decimalFormat.format(num2));
        }
    }
    public void btn1x (View v){
        texto= caja_Principal.getText().toString();
        if(texto.length()>0&&!caja_Principal.getText().toString().equals("0")) {

            num1= Double.parseDouble(caja_Principal.getText().toString());
            num2= (double) 1/num1;
            caja_Principal.setText(decimalFormat.format(num2));
        }
    }
    public void masMenos(View v){
        texto= caja_Principal.getText().toString();
        if(texto.length()>0) {
            String numeroTexto = caja_Principal.getText().toString();
            double numero = Double.parseDouble(numeroTexto);

            // Cambiar el signo del número
            numero = -numero;

            caja_Principal.setText(String.valueOf(numero));
        }
    }

    public void obtenerResultado(View v){
        texto= caja_Principal.getText().toString();
        if(texto.length()>0) {
        if(operador=="*"){

            num2=num1*Double.parseDouble(caja_Principal.getText().toString());
            caja_Principal.setText(decimalFormat.format(num2));

        } else if (operador=="/") {
            if(!caja_Principal.getText().toString().equals("0")) {
                num2 = num1 / Double.parseDouble(caja_Principal.getText().toString());
                caja_Principal.setText(decimalFormat.format(num2));
            }
        }else if (operador=="+") {
            num2=num1+Double.parseDouble(caja_Principal.getText().toString());
            caja_Principal.setText(decimalFormat.format(num2));

        }
        else if (operador=="-") {
            num2=num1-Double.parseDouble(caja_Principal.getText().toString());
            caja_Principal.setText(decimalFormat.format(num2));

        }
        }

    }
    public void btnCe(View v){

        caja_Principal.setText("");
    }
}