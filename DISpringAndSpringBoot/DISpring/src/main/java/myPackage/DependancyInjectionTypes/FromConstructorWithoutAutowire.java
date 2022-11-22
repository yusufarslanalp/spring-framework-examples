package myPackage.DependancyInjectionTypes;

import myPackage.Engine;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class FromConstructorWithoutAutowire {

    Engine engine;

    public FromConstructorWithoutAutowire(Engine engine){
        this.engine = engine;
    }

    public void foo(){
        System.out.println( "FromConstructorWithoutAutowire object: " + engine.sound() );
    }
}
