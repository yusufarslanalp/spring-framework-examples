package myPackage;

import myPackage.DependancyInjectionTypes.FromConstructorWithoutAutowire;
import myPackage.DependancyInjectionTypes.FromField;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String args[]){
        ApplicationContext context = new AnnotationConfigApplicationContext(Config.class);

        //spring created Car object from car constructor. Car constructor annotated with Autowire.
        Car car = context.getBean(Car.class);
        car.start();

        //spring created FromField object. Engine field of FromField object annotated with Autowire.
        FromField fromField = context.getBean(FromField.class);
        fromField.foo();

        //spring created FromConstructorWithoutAutowire object. FromConstructorWithoutAutowire never annotated with autowire.
        FromConstructorWithoutAutowire fromConstructorWithoutAutowire = context.getBean(FromConstructorWithoutAutowire.class);
        fromConstructorWithoutAutowire.foo();

        CarWrapper carWrapper = context.getBean( CarWrapper.class );
        carWrapper.startCar();
    }


}



