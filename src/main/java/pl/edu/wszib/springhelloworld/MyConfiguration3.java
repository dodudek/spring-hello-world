package pl.edu.wszib.springhelloworld;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import pl.edu.wszib.springhelloworld.model.Ksiegowa;

@Configuration

public class MyConfiguration3 {
    @Bean
    public Ksiegowa dajKsiegowa (BazaDanych bazaDanych){
        return new Ksiegowa(bazaDanych);
    }


//    private BazaDanych fileBazaDanych = new FileBazaDanych();
//    private  BazaDanych mapBazaDanych = new MapBazaDanych();
//
//    private boolean isFile;
//
//    public MyConfiguration3 (boolean isFile){
//        this.isFile = isFile;
//    }
//
//    public Ksiegowa dajKsiegowa(){
//        return new Ksiegowa(isFile ? fileBazaDanych : mapBazaDanych);
//    }
}
