package devmob.ftce.usjt.br.paises.model;

import android.widget.ImageView;
import android.widget.TextView;

/**
 * Created by Roger Campos de Oliveira 816117932 on 21/03/2018.
 */

public class ViewHolder {

    private TextView capital, populacao, regiao;
    private ImageView bandeira;

    public ImageView getBandeira() {
        return bandeira;
    }

    public void setBandeira(ImageView bandeira) {
        this.bandeira = bandeira;
    }

    public TextView getCapital() {

        return capital;
    }

    public void setCapital(TextView capital) {
        this.capital = capital;
    }

    public TextView getPopulacao() {
        return populacao;
    }

    public void setPopulacao(TextView populacao) {
        this.populacao = populacao;
    }

    public TextView getRegiao() {
        return regiao;
    }

    public void setRegiao(TextView regiao) {
        this.regiao = regiao;
    }
}
