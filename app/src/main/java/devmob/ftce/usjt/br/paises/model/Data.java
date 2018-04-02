package devmob.ftce.usjt.br.paises.model;

import java.util.ArrayList;

/**
 * Created by Roger Campos de Oliveira 816117932 on 21/03/2018.
 */

public class Data {

    public static ArrayList<Pais> listarPaisesByContinente(String continente) {
        ArrayList<Pais> paises = new ArrayList<>();
        if (continente.equals("Americas")) {
            paises.addAll(listarPaisesAfrica());
        } else if (continente.equals("Europe")) {
            paises.addAll(listarPaisesAmericas());
        } else if (continente.equals("Oceania")) {
            paises.addAll(listarPaisesAsia());
        } else if (continente.equals("Asia")) {
            paises.addAll(listarPaisesEurope());
        } else if (continente.equals("Africa")) {
            paises.addAll(listarPaisesOceania());
        } else {
            paises.addAll(listarPaisesAfrica());
            paises.addAll(listarPaisesAmericas());
            paises.addAll(listarPaisesEurope());
            paises.addAll(listarPaisesOceania());
        }
        return paises;
    }
    public static ArrayList<String> listarNomePaises(ArrayList<Pais> paises) {
        ArrayList<String> nomePaises = new ArrayList<>();
        for (Pais pais : paises) {
            nomePaises.add(pais.getNome());
        }
        return nomePaises;
    }

    private static ArrayList<Pais> listarPaisesAmericas() {
        ArrayList<Pais> paisesAmericas = new ArrayList<>();
        paisesAmericas.add(new Pais(ContinenteId.CANADA.getNome(), ContinenteId.CANADA.getCapital(), ContinenteId.CANADA.getRegiao(), ContinenteId.CANADA.getPopulacao(), ContinenteId.CANADA.getBandeira()));
        return paisesAmericas;
    }
    private static ArrayList<Pais> listarPaisesEurope() {
        ArrayList<Pais> paisesEurope = new ArrayList<>();
        paisesEurope.add(new Pais(ContinenteId.PORTUGAL.getNome(), ContinenteId.PORTUGAL.getCapital(), ContinenteId.PORTUGAL.getRegiao(), ContinenteId.PORTUGAL.getPopulacao(),ContinenteId.PORTUGAL.getBandeira()));
        return paisesEurope;
    }
    private static ArrayList<Pais> listarPaisesOceania() {
        ArrayList<Pais> paisesOceania = new ArrayList<>();
        paisesOceania.add(new Pais(ContinenteId.AUSTRALIA.getNome(), ContinenteId.AUSTRALIA.getCapital(), ContinenteId.AUSTRALIA.getRegiao(), ContinenteId.AUSTRALIA.getPopulacao(), ContinenteId.AUSTRALIA.getBandeira()));
        return paisesOceania;
    }
    private static ArrayList<Pais> listarPaisesAsia() {
        ArrayList<Pais> paisesAsia = new ArrayList<>();
        paisesAsia.add(new Pais(ContinenteId.CHINA.getNome(), ContinenteId.CHINA.getCapital(), ContinenteId.CHINA.getRegiao(), ContinenteId.CHINA.getPopulacao(), ContinenteId.CHINA.getBandeira()));
        return paisesAsia;
    }
    private static ArrayList<Pais> listarPaisesAfrica() {
        ArrayList<Pais> paisesAfrica = new ArrayList<>();
        paisesAfrica.add(new Pais(ContinenteId.ZIMBABWE.getNome(), ContinenteId.ZIMBABWE.getCapital(), ContinenteId.ZIMBABWE.getRegiao(), ContinenteId.ZIMBABWE.getPopulacao(), ContinenteId.ZIMBABWE.getBandeira()));
        return paisesAfrica;
    }
}
