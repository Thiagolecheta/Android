package com.example.ti.calculadora1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button b = (Button) findViewById(R.id.btnCalcular);
        b.setOnClickListener(new Button.OnClickListener(){
            public void onClick(View view) {
                EditText peso = (EditText) findViewById(R.id.txtPeso1);
                EditText altura = (EditText) findViewById(R.id.txtAltura1);


                        double p1 = Double.parseDouble(peso.getText().toString());
                        double a1 = Double.parseDouble(altura.getText().toString());
                        double imc = p1 / (a1 * a1);


                TextView resultado = (TextView) findViewById(R.id.labelIMC);
                TextView situacao = (TextView) findViewById(R.id.labelSituacao);


                         resultado.setText(String.format(" %.2f", imc));


                                        if (imc < 17){
                                            situacao.setText("Muito abaixo do peso");
                                        }
                                        else
                                        if ((imc >= 17) && (imc <= 18.49)) {
                                            situacao.setText("Abaixo do peso");
                                        }
                                        else
                                        if ((imc >= 18.50) && (imc <=24.99 )) {
                                            situacao.setText("Peso normal");
                                        }
                                        else
                                        if ((imc >= 25) && (imc <=29.99 )) {
                                            situacao.setText("Acima do peso");
                                        }
                                        else
                                        if ((imc >= 30) && (imc <=34.99 )) {
                                            situacao.setText("Obesidade I");
                                        }
                                        else
                                        if ((imc >= 35) && (imc <=39.99 )) {
                                            situacao.setText("Obesidade II (severa)");
                                        }

                                        else
                                        if ((imc > 40)) {
                                            situacao.setText("Obesidade III (mórbida)");
                                        }
            }
        });
    }
}

