package aplicacion.hospital.app.umb.edu.healthcare;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioGroup;

import android.widget.RadioButton;

public class Registro extends AppCompatActivity implements View.OnClickListener {
EditText nombres, apellidos, correo;
    String valor="";
    RadioGroup grupo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registro);
        Button boton = (Button) findViewById(R.id.button);
         nombres=(EditText) findViewById(R.id.names);
         apellidos=(EditText) findViewById(R.id.lastname);
         correo= (EditText) findViewById(R.id.mail);
         grupo=(RadioGroup) findViewById(R.id.gruporb);
        boton.setOnClickListener(this);
        grupo.setOnCheckedChangeListener(
                new RadioGroup.OnCheckedChangeListener() {
                    public void onCheckedChanged(RadioGroup grupo, int checkedId) {
                    // Obtenemos el RadioButton que está seleccionado usando
                    // el ID marcado checkedId
                        if (checkedId == R.id.man){
                            valor="hombre";
                        }else if (checkedId == R.id.woman) {
                            valor = "mujer";
                        }

                    }
                });




    }





    public void onClick(View v) {
        //seleccion cada caso de boton que se pulse
        switch (v.getId()) {

            case R.id.button:
                //arreglo de datos
                String[] datos= new String[4];
                //Rellenar datos
                datos[0]= nombres.getText().toString();
                datos[1]= apellidos.getText().toString();
                datos[2]= correo.getText().toString();
                datos[3]= valor.toString();
               //abre ventana
                Intent intent = new Intent(this,Test.class);
                intent.putExtra(Test.datopasado,datos);
                //intent.putExtra("nombre",nombres.getText().toString());
                startActivity(intent);
                break;
        }
    }
}
