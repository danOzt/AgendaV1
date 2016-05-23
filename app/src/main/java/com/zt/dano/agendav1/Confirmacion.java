package com.zt.dano.agendav1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Confirmacion extends AppCompatActivity {

    public final static int MI_REQUEST_CODE = 1;

    private TextView nombreC, fechaC, telefonoC, emailC, descripcionC;
    private Button btnE;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_confirmacion);

        nombreC = (TextView) findViewById(R.id.nombreC);
        telefonoC = (TextView) findViewById(R.id.telefonoC);
        emailC = (TextView) findViewById(R.id.emailC);
        descripcionC = (TextView) findViewById(R.id.descripcionC);
        fechaC = (TextView) findViewById(R.id.fechaC);

        btnE = (Button) findViewById(R.id.btnEditar);





        Bundle datos = getIntent().getExtras();
        String nombreD = datos.getString("nombre");
        String telefonoD = datos.getString("telefono");
        String emailD =datos.getString("email");
        String descripcionD =datos.getString("descripcion");

        nombreC.setText(nombreD);
        telefonoC.setText(telefonoD);
        emailC.setText(emailD);
        descripcionC.setText(descripcionD);




        btnE.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent iE = new Intent(Confirmacion.this, MainActivity.class);
                iE.putExtra("nombreE", nombreC.getText().toString());
                iE.putExtra("telefonoE", telefonoC.getText().toString());
                iE.putExtra("emailE", emailC.getText().toString());
                iE.putExtra("descripcionE", descripcionC.getText().toString());
                //startActivity(iE);
                startActivityForResult(iE, MI_REQUEST_CODE);
                finish();

            }
        });


    }
}
