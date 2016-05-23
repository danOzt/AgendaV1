package com.zt.dano.agendav1;


import android.content.Intent;
import android.support.design.widget.TextInputEditText;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;


public class MainActivity extends AppCompatActivity {

    private TextInputEditText nombre;
    private TextInputEditText telefono;
    private TextInputEditText email;
    private TextInputEditText descripcion;
    private Button btnsiguiente;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        nombre = (TextInputEditText) findViewById(R.id.nombre);
        telefono = (TextInputEditText) findViewById(R.id.telefono);
        email = (TextInputEditText) findViewById(R.id.email);
        descripcion = (TextInputEditText) findViewById(R.id.descripcion);
        btnsiguiente = (Button) findViewById(R.id.button);



        btnsiguiente.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(MainActivity.this, Confirmacion.class);
                if (nombre.equals("") || nombre.equals(null)) {
                    i.putExtra("vacio", "sin texto");
                } else {
                    i.putExtra("nombre", nombre.getText().toString());
                    i.putExtra("telefono", telefono.getText().toString());
                    i.putExtra("email", email.getText().toString());
                    i.putExtra("descripcion", descripcion.getText().toString());
                    startActivity(i);

                    finish();

                }

            }
        });




    }




}


