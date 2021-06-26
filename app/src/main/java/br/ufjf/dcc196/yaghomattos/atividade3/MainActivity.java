package br.ufjf.dcc196.yaghomattos.atividade3;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private EditText editValor1;
    private EditText editValor2;
    private TextView viewResultado;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //atribui a entrada de dados
        editValor1 = findViewById(R.id.valor1);
        editValor2 = findViewById(R.id.valor2);
        //atribui a saida de dados
        viewResultado = findViewById(R.id.resultadoValue);
    }

    public void soma(View view) {
        Double valor1 = 0.0;
        Double valor2 = 0.0;
        Double resultado = null;
        try {
            valor1 = Double.parseDouble(editValor1.getText().toString());
            valor2 = Double.parseDouble(editValor2.getText().toString());
            resultado = valor1 + valor2;
        } catch (Exception e) {
            new Error("Houve um erro na Soma");
        }

        if(resultado != null)
            viewResultado.setText(resultado.toString());
        else
            viewResultado.setText("x_x");
    }
    public void subtracao(View view) {
        Double valor1 = 0.0;
        Double valor2 = 0.0;
        Double resultado = null;
        try {
            valor1 = Double.parseDouble(editValor1.getText().toString());
            valor2 = Double.parseDouble(editValor2.getText().toString());
            resultado = valor1 - valor2;
        } catch (Exception e) {
            new Error("Houve um erro na Subtração");
        }

        if(resultado != null)
            viewResultado.setText(resultado.toString());
        else
            viewResultado.setText("x_x");
    }
}