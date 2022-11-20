package myPackage;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("myPackage")
public class Config {

    @Bean
    public Engine engine() {
        return new Engine( 100);
    }

    @Bean
    public Transmission transmission() {
        return new Transmission("sliding");
    }
}