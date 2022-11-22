package myPackage;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class CarWrapper {

    @Autowired
    Car car;

    public void startCar(){
        System.out.print( "car wrapper starting car: "  );
        car.start();
    }

}
