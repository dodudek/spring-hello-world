package pl.edu.wszib.springhelloworld;

import java.util.HashMap;
import java.util.Map;

public class MapBazaDanych implements BazaDanych {

    private Map<String, String > baza = new HashMap<>();

    @Override
    public void zapis(String klucz, String wartosc) {
        baza.put(klucz, wartosc);

    }

    @Override
    public String get(String klucz) {
        return baza.get(klucz);

    }

    @Override
    public String usun(String klucz) {
        return baza.remove(klucz);

    }
}
