package aplicacion.hospital.app.umb.edu.healthcare;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.EditText;
public class Aceptacion extends AppCompatActivity {
    EditText resultado;
//public static final String datopasado = "dato1";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_aceptacion);
        resultado=(EditText) findViewById(R.id.caja);
        String[] nombre= getIntent().getStringArrayExtra("datopasado");

    }
}
