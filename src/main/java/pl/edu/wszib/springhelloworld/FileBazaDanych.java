package pl.edu.wszib.springhelloworld;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;
import java.util.Scanner;

public class FileBazaDanych implements BazaDanych {

    @Override
    public void zapis(String klucz, String wartosc) {
        PrintWriter writer = null;

        try {
            writer = new PrintWriter(klucz + " .txt", "UTF-8");
            writer.append(wartosc);
            writer.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        }
    }

    @Override
    public String get(String klucz) {
        try {
            Scanner scanner = new Scanner (new File (klucz)+ " .txt");
            return scanner.next("//A");
        } catch (Exception e) {
            e.printStackTrace();
        }

        return null;

    }

    @Override
    public String usun(String klucz) {

        return klucz;
    }
}
