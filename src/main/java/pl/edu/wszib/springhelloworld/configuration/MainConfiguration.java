package pl.edu.wszib.springhelloworld.configuration;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import pl.edu.wszib.springhelloworld.model.*;

@Configuration
public class MainConfiguration {


    @Bean
    public Zabawka klocki(){
        return new Klocki();
    }

    @Bean
    public Zabawka mis(){
        return new Mis();
    }
    @Bean
    public Zabawka samochodzik(){
        return new Samochodzik();
    }


    @Bean
    public Dziecko jas(@Qualifier("klocki") Zabawka zabawka) {
        Dziecko jas = new Jas(zabawka);
        jas.odpakuj();
        return jas;
    }

    @Bean
    public Dziecko malgosia(@Qualifier("mis")Zabawka zabawka) {
        Dziecko malgosia = new Malgosia(zabawka);
        malgosia.odpakuj();
        return malgosia;
    }

    @Bean
    public Dziecko grzes(@Qualifier("samochodzik")Zabawka zabawka) {
        Dziecko grzes = new Grzes(zabawka);
        grzes.odpakuj();
        return grzes;
    }

}