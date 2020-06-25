package edu.cecar.curso2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private TextView textUno;
    private Button btnEventos, btnEventos2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        textUno = (TextView) findViewById(R.id.text_caja1);
        btnEventos = (Button) findViewById(R.id.btn_eventos);
        btnEventos2 = (Button) findViewById(R.id.btn_eventos2);

        // Evento que se acciona al momento de hacer un click sobre un botón
        btnEventos.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textUno.setText("Al dar un click");
            }
        });

        // Evento que se acciona al momento de mantener el botón precionado
        btnEventos.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View v) {
                textUno.setText("Al mantener pulsado el botón");
                return false;
            }
        });
        // Evento que se accuiona al momento de cambiar el botón
        btnEventos.setOnFocusChangeListener(new View.OnFocusChangeListener() {
            @Override
            public void onFocusChange(View v, boolean hasFocus) {
                textUno.setText("Al cambiar de componente ");
            }
        });

    }
}
