package myPackage.DependancyInjectionTypes;

import myPackage.Engine;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class FromField {
    @Autowired
    Engine engine;

    public void foo(){
        System.out.println( "FromField object: " + engine.sound() );
    }
}
