package devmob.ftce.usjt.br.paises.controller;

import android.app.Activity;
import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import devmob.ftce.usjt.br.paises.R;
import devmob.ftce.usjt.br.paises.model.Pais;
import devmob.ftce.usjt.br.paises.model.Util;

/**
 * Created Roger Campos de Oliveira 816117932 on 24/03/2018.
 */

public class DetalhePaisActivity extends Activity {
    TextView txtNome;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detalhe_pais);
        txtNome = (TextView) findViewById(R.id.pais_nome);
        Intent intent = getIntent();
        Pais pais = (Pais)intent.getSerializableExtra(ListarPaisesActivity.PAIS);
        ImageView bandeira = (ImageView) findViewById(R.id.bandeira_pais);
        Drawable drawable = Util.getDrawableDinamic(this, pais.getContinente().getBandeira());
        bandeira.setImageDrawable(drawable);
        TextView continente = (TextView)findViewById(R.id.valor_continente);
        continente.setText(pais.getContinente().getNome());
        TextView capital = (TextView)findViewById(R.id.valor_capital);
        capital.setText(""+pais.getCapital());
        TextView populacao = (TextView)findViewById(R.id.valor_populacao);
        populacao.setText(""+pais.getPopulacao());
        TextView regiao = (TextView)findViewById(R.id.valor_regiao);
        regiao.setText(""+pais.getRegiao());
    }
}
