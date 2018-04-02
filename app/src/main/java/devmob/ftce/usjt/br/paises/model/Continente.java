package devmob.ftce.usjt.br.paises.model;

import java.io.Serializable;

/**
 * Created by Roger Campos de Oliveira 816117932 on 21/03/2018.
 */

public class Continente implements Serializable {

    private int id;
    private String nome, bandeira;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setBandeira(String figura) {
        this.bandeira = bandeira;
    }

    public String getBandeira() {
        return bandeira;
    }
}
