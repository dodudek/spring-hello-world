package pl.edu.wszib.springhelloworld;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;
import org.springframework.context.annotation.Scope;
import pl.edu.wszib.springhelloworld.model.Glos;
import pl.edu.wszib.springhelloworld.model.KartaDoGlosowania;
import pl.edu.wszib.springhelloworld.model.Urna;
import pl.edu.wszib.springhelloworld.model.Wyborca;

@Configuration

public class MyConfiguration {

    @Bean
    public Urna urna(){
        return new Urna();
    }

    @Bean
    @Scope("prototype")
    public KartaDoGlosowania kartaDoGlosowania(){
        return new KartaDoGlosowania();
    }

    @Bean
    public Wyborca wyborca1(KartaDoGlosowania kartaDoGlosowania){
        return new Wyborca(kartaDoGlosowania);
    }

    @Bean
    public Wyborca wyborca2(KartaDoGlosowania kartaDoGlosowania){
        return new Wyborca(kartaDoGlosowania);
    }

    @Bean
    public Wyborca wyborca3(KartaDoGlosowania kartaDoGlosowania){
        return new Wyborca(kartaDoGlosowania);
    }

    @Bean
    public Wyborca wyborca4(KartaDoGlosowania kartaDoGlosowania){
        return new Wyborca(kartaDoGlosowania);
    }

    @Bean
    public String execute(Wyborca wyborca1, Wyborca wyborca2, Wyborca wyborca3, Wyborca wyborca4, Urna urna ){
        wyborca1.oddajGlos(urna);
        wyborca2.oddajGlos(urna);
        wyborca3.oddajGlos(urna);
        wyborca4.oddajGlos(urna);
        urna.zlicz();
        return "";
    }
}
