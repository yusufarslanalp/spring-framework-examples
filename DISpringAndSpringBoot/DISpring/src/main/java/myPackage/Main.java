package myPackage;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String args[]){
        ApplicationContext context = new AnnotationConfigApplicationContext(Config.class);
        Car car = context.getBean(Car.class);

        car.star();
    }


}



