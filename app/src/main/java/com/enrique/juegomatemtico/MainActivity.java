package com.enrique.juegomatemtico;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    TextView tv,tvr;
    Button btnramdon, btnresult;
    int numero,divisor1,divisor2,divisor3,divisor4,cnt;
    RadioButton rd1, rd2, rd3, rd4, rd5;
    boolean compDivisibilidad;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tv = (TextView) findViewById(R.id.tv);
        tvr = (TextView) findViewById(R.id.tvr);
        btnramdon = (Button) findViewById(R.id.btnrandom);
        btnresult = (Button) findViewById(R.id.btnresultado);
        rd1 = (RadioButton) findViewById(R.id.rd1);
        rd2 = (RadioButton) findViewById(R.id.rd2);
        rd3 = (RadioButton) findViewById(R.id.rd3);
        rd4 = (RadioButton) findViewById(R.id.rd4);
        rd5 = (RadioButton) findViewById(R.id.rd5);
        btnramdon.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                tv.setText(String.valueOf((int) (Math.random() * (1000 - 2000) + 2000)));
                numero = Integer.parseInt((String) tv.getText());
            }
        });
        btnresult.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (rd1.isChecked()){
                    divisor1=Integer.parseInt((String)rd1.getText());
                    cnt++;
                }
                if (rd2.isChecked()){
                    divisor2=Integer.parseInt((String)rd2.getText());
                    cnt++;
                }
                if (rd3.isChecked()){
                    divisor3=Integer.parseInt((String)rd3.getText());
                    cnt++;
                }
                if (rd4.isChecked()){
                    divisor4=Integer.parseInt((String)rd4.getText());
                    cnt++;
                }
                if (rd5.isChecked()){
                    rd5.getText();
                    cnt++;
                }

                if (!rd1.isChecked() && !rd2.isChecked() && !rd3.isChecked() && !rd4.isChecked() && !rd5.isChecked())
                    Toast.makeText(getApplicationContext(), "No has seleccionado ninguna opcion", Toast.LENGTH_LONG).show();

            }
        });
        btnresult.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if ((cnt > 0) && calcular_divisivilidad(numero, divisor1)) {
                    tvr.setText("Correcto");
                } else
                    tv.setText("Incorrecto");
            }
        });
    }
    public boolean calcular_divisivilidad(int numero,int divisores){
        if(numero%divisores==0)
            return true;
        else return false;
    }
}