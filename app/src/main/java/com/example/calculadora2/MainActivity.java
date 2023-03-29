package com.example.calculadora2;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private EditText editText1, editText2;
    private CheckBox checkBoxSuma, checkBoxResta, checkBoxMultiplicacion, checkBoxDivision;
    private TextView tvResultado;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        editText1 = findViewById(R.id.editText1);
        editText2 = findViewById(R.id.editText2);
        checkBoxSuma = findViewById(R.id.checkBoxSuma);
        checkBoxResta = findViewById(R.id.checkBoxResta);
        checkBoxMultiplicacion = findViewById(R.id.checkBoxMultiplicacion);
        checkBoxDivision = findViewById(R.id.checkBoxDivision);
        tvResultado = findViewById(R.id.tvResultado);
    }

    public void calcular(View view) {
        String valor1String = editText1.getText().toString();
        String valor2String = editText2.getText().toString();
        int valor1 = Integer.parseInt(valor1String);
        int valor2 = Integer.parseInt(valor2String);
        String resultado = "";

        if (checkBoxSuma.isChecked()) {
            int suma = valor1 + valor2;
            resultado += "La suma es: " + suma + "\n";
        }
        if (checkBoxResta.isChecked()) {
            int resta = valor1 - valor2;
            resultado += "La resta es: " + resta + "\n";
        }
        if (checkBoxMultiplicacion.isChecked()) {
            int multiplicacion = valor1 * valor2;
            resultado += "La multiplicación es: " + multiplicacion + "\n";
        }
        if (checkBoxDivision.isChecked()) {
            if(valor2 == 0){
                resultado += "No se puede dividir entre cero\n";
            } else {
                float division = (float) valor1 / valor2;
                resultado += "La división es: " + division + "\n";
            }
        }
        tvResultado.setText(resultado);
    }

}

