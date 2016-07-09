package aplicacion.hospital.app.umb.edu.healthcare;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Registro extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registro);
        Button boton = (Button) findViewById(R.id.button);
        boton.setOnClickListener(this);
    }
    public void onClick(View v) {
        //seleccion cada caso de boton que se pulse
        switch (v.getId()) {

            case R.id.button:
               //abre ventana
                Intent intent = new Intent(this,Aceptacion.class);
                startActivity(intent);
                break;
        }
    }
}
