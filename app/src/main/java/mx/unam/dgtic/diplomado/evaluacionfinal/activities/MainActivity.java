package mx.unam.dgtic.diplomado.evaluacionfinal.activities;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;

import mx.unam.dgtic.diplomado.evaluacionfinal.R;
import mx.unam.dgtic.diplomado.evaluacionfinal.adapters.CustomAdapter;
import mx.unam.dgtic.diplomado.evaluacionfinal.model.Pelicula;

public class MainActivity extends AppCompatActivity {

    ArrayList<Pelicula> Peliculas;
    ListView listView;
    private static CustomAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        listView=(ListView)findViewById(R.id.list);

        Peliculas= new ArrayList<>();

        Peliculas.add(new Pelicula("Avengers", "Acción","2018"));
        Peliculas.add(new Pelicula("El rey leon", "Infantil","2009"));
        Peliculas.add(new Pelicula("La sirenita", "Infantil","2006"));
        Peliculas.add(new Pelicula("Rapido y furioso", "Acción","2002"));
        Peliculas.add(new Pelicula("El barco", "Infantil","2000"));
        Peliculas.add(new Pelicula("La espada", "Infantil","20019"));
        Peliculas.add(new Pelicula("Nacido para matar", "Acción","2003"));
        Peliculas.add(new Pelicula("Deadpool", "Acción","2002"));
        Peliculas.add(new Pelicula("Mr. Bean", "Comedia","2004"));
        Peliculas.add(new Pelicula("El rey leon II", "Infantil","2009"));

        adapter= new CustomAdapter(Peliculas,getApplicationContext());

        listView.setAdapter(adapter);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                Pelicula pelicula= Peliculas.get(position);
                Intent intent = new Intent(MainActivity.this, SecondActivity.class);
                intent.putExtra("nombre",pelicula.getNombre());
                startActivity(intent);

                System.out.println(pelicula.getNombre());
            }
        });
    }
}
