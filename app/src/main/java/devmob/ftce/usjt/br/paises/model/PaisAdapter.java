package devmob.ftce.usjt.br.paises.model;


import android.content.Context;

import android.view.LayoutInflater;
import android.view.View;

import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;

import android.widget.TextView;

import java.util.ArrayList;

import devmob.ftce.usjt.br.paises.R;

/**
 * Created by Roger Campos de Oliveira 816117932 on 24/03/2018.
 */

public class PaisAdapter extends BaseAdapter {

    private Context context;
    private ArrayList<Pais> paises;
    private ImageView bandeira;

    public PaisAdapter(Context context, ArrayList<Pais> paises) {
        this.context = context;
        this.paises = paises;
    }

    @Override
    public int getCount() {
        return paises.size();
    }

    @Override
    public Object getItem(int position) {
        return paises.get(position);
    }

    @Override
    public long getItemId(int i) {
        return i;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View view = convertView;
        if(view == null){
            LayoutInflater inflater = (LayoutInflater)context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            view = inflater.inflate(R.layout.acticity_pais_view, parent, false);
            ImageView imageView = (ImageView)view.findViewById(R.id.bandeira_pais);
            TextView capital = (TextView)view.findViewById(R.id.valor_capital);
            TextView populacao = (TextView)view.findViewById(R.id.valor_populacao);
            TextView regiao = (TextView)view.findViewById(R.id.valor_regiao);
            ViewHolder viewHolder = new ViewHolder();
            viewHolder.setCapital(capital);
            viewHolder.setPopulacao(populacao);
            viewHolder.setRegiao(regiao);
            viewHolder.setBandeira(imageView);
            view.setTag(viewHolder);
        }

        Pais pais = paises.get(position);
        ViewHolder viewholder = (ViewHolder)view.getTag();
        viewholder.getBandeira().setImageDrawable(Util.getDrawableDinamic(context, pais.getContinente().getBandeira()));
        viewholder.getCapital().setText(String.format("Capital: %d", pais.getCapital()));
        viewholder.getPopulacao().setText(String.format("População: %d", pais.getPopulacao()));
        viewholder.getRegiao().setText(String.format("Continente: %d", pais.getRegiao()));

        return view;
    }

}


