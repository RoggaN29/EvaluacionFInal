package mx.unam.dgtic.diplomado.evaluacionfinal.activities;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

import mx.unam.dgtic.diplomado.evaluacionfinal.R;

public class SecondActivity extends AppCompatActivity {

    private TextView nombreText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        nombreText = (TextView) findViewById(R.id.nombre);

        Intent iin= getIntent();
        Bundle b = iin.getExtras();

        if(b!=null)
        {
            String nombre = (String) b.get("nombre");
            nombreText.setText("Nombre: "+ nombre);
        }
    }
}
