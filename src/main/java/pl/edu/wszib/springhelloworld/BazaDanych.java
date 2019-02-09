package pl.edu.wszib.springhelloworld;

public interface BazaDanych {

    void zapis(String klucz, String wartosc);
    String get (String klucz);
    String usun (String klucz);
}
