package aplicacion.hospital.app.umb.edu.healthcare;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.EditText;
import android.widget.Button;
public class Test extends Activity implements View.OnClickListener {
    EditText resultado;
    Button    salida;
    public static final String datopasado = "dato1";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_test);
        // Botón de salida (final de la aplicación)
        salida = (Button)findViewById(R.id.salir);
        salida.setOnClickListener(this);

        resultado=(EditText) findViewById(R.id.caja);
         String[] nombre= getIntent().getStringArrayExtra("dato1");
        //String nombre =getIntent().getStringExtra("nombre");
        for (int i =0 ; i<nombre.length;i++)resultado.append("\n"+nombre[i]);
    }
    public void onClick(View v) {
        //seleccion cada caso de boton que se pulse
        switch (v.getId()) {

            case R.id.salir:

                finish();
                Intent intent = new Intent(Intent.ACTION_MAIN);
                intent.addCategory(Intent.CATEGORY_HOME);
                intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
                startActivity(intent);
                break;
        }
    }
}
