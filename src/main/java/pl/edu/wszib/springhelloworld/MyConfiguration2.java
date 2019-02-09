package pl.edu.wszib.springhelloworld;


import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import pl.edu.wszib.springhelloworld.model.*;

@Configuration

public class MyConfiguration2 {

    @Bean
     public Kierownica kierownica(){
        return new Kierownica();
    }

    @Bean
    public SkrzyniaBiegow skrzyniaBiegow(){
        return new SkrzyniaBiegow();
    }
    @Bean
    public Silnik silnik(){
        return new Silnik();
    }

    @Bean
    public UkladSterowania ukladSterowania(){
        return new UkladSterowania(kierownica());
    }

    @Bean
    public Samochod samochod(Karoseria karoseria, Zawieszenie zawieszenie){
        return new Samochod(karoseria, zawieszenie);
    }

    @Bean
    public Drzwi drzwi(){
        return new Drzwi();
    }

    @Bean
    public Karoseria karoseria(){
        return new Karoseria(drzwi());
    }

    @Bean
    public Zawieszenie zawieszenie (Silnik silnik, SkrzyniaBiegow skrzyniaBiegow, UkladSterowania ukladSterowania){
        return new Zawieszenie(silnik, skrzyniaBiegow, ukladSterowania);
    }


}
