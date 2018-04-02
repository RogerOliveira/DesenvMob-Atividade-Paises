package devmob.ftce.usjt.br.paises.controller;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListAdapter;
import android.widget.ListView;

import java.util.ArrayList;

import devmob.ftce.usjt.br.paises.R;
import devmob.ftce.usjt.br.paises.model.Data;
import devmob.ftce.usjt.br.paises.model.Pais;
import devmob.ftce.usjt.br.paises.model.PaisAdapter;

/**
 * Created Roger Campos de Oliveira 816117932 on 21/03/2018.
 */

public class ListarPaisesActivity extends Activity {

    public static final String PAIS = "devmob.ftce.usjt.br.paises.pais";
    ArrayList<Pais> paises;
    ListView listView;
    Activity context;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pais);
        Intent intent = getIntent();
        String continente = intent.getStringExtra(MainActivity.CHAVE);
        paises = Data.listarPaisesByContinente(continente);
        listView = findViewById(R.id.listar_paises);
        PaisAdapter adapter = new PaisAdapter(this, paises);
        listView.setAdapter((ListAdapter) adapter);
        context = this;
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                Pais pais = paises.get(i);
                Intent intent = new Intent(context, DetalhePaisActivity.class);
                intent.putExtra(PAIS, pais);
                startActivity(intent);
            }
        });

    }
}
