package devmob.ftce.usjt.br.paises.model;

/**
 * Created by roger on 01/04/2018.
 */

public enum ContinenteId {
    CANADA(1, "Canadá", "Ottawa", "Amérias", 35151728, "can"),
    PORTUGAL(2, "Portugal", "Lisboa", "Europa", 10374822, "prt"),
    AUSTRALIA(3, "Australia", "Camberra", "Oceania", 24885212, "aus"),
    CHINA(4, "China", "Pequim", "Ásia", 1379302771, "chn"),
    ZIMBABWE(5, "Canadá", "Harare", "Africa", 16150362, "zwe");

    private final int id;
    private int populacao;
    private final String nome, capital, regiao, bandeira;

    ContinenteId(int id, String nome, String capital, String regiao, int populacao, String bandeira) {
        this.id = id;
        this.nome = nome;
        this.capital = capital;
        this.regiao = regiao;
        this.populacao = populacao;
        this.bandeira = bandeira;
    }


    public int getId() {
        return id;
    }

    public int getPopulacao() {
        return populacao;
    }

    public String getNome() {
        return nome;
    }

    public String getCapital() {
        return capital;
    }

    public String getRegiao() {
        return regiao;
    }

    public String getBandeira() {
        return bandeira;
    }

    @Override
    public String toString() {
        return "ContinenteId{" +
                "id=" + id +
                ", nome='" + nome + '\'' +
                ", capital='" + capital + '\'' +
                ", regiao='" + regiao + '\'' +
                ", populacao='" + populacao + '\'' +
                ", bandeira='" + bandeira + '\'' +
                '}';
    }
}
