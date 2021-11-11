package com.enrique.juegomatemtico;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    TextView tv;
    Button btnramdon,btnresult;
    int numero;
    RadioButton rd1,rd2,rd3,rd4,rd5;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tv=(TextView) findViewById(R.id.tv);
        btnramdon=(Button) findViewById(R.id.btnrandom);
        btnresult=(Button) findViewById(R.id.btnresultado);
        rd1=(RadioButton) findViewById(R.id.rd1);
        rd2=(RadioButton) findViewById(R.id.rd2);
        rd3=(RadioButton) findViewById(R.id.rd3);
        rd4=(RadioButton) findViewById(R.id.rd4);
        rd5=(RadioButton) findViewById(R.id.rd5);
        btnramdon.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                tv.setText(String.valueOf((int)(Math.random()*(1000-2000)+2000)));
                numero=Integer.parseInt((String) tv.getText());

            }
        });
        btnresult.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (rd1.isChecked())rd1.getText();
                if (rd2.isChecked())rd2.getText();
                if (rd3.isChecked())rd3.getText();
                if (rd4.isChecked())rd4.getText();
                if (rd5.isChecked())rd5.getText();
                if (!rd1.isChecked() && !rd2.isChecked()&& !rd3.isChecked()&&!rd4.isChecked()&&! rd5.isChecked())
                    Toast.makeText(getApplicationContext(),"No has seleccionado ninguna opc",Toast.LENGTH_LONG).show();
            }
        });
    }
    public void calcular_divisivilidad(int a){
    }
}