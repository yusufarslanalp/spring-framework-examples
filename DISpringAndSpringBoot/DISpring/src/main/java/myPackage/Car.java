package myPackage;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Car {
    Engine engine;
    Transmission transmission;


    @Autowired
    public Car(Engine engine, Transmission transmission) {
        this.engine = engine;
        this.transmission = transmission;
    }

    void start(){
        System.out.println( "From Car Object: " + engine.sound() );
    }
}