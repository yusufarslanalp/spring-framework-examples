package org.example;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {



    public static void main(String[] args) {


        ApplicationContext ctx = new AnnotationConfigApplicationContext(JavaConfiguration.class);
        JavaConfigBean javaConfigBean = ctx.getBean( "noName", JavaConfigBean.class );
        javaConfigBean.show();


        HasJavaConfigBean bar = ctx.getBean( HasJavaConfigBean.class );
        System.out.println( bar.beanWithName.name );
        System.out.println( bar.beanWithNoName.name );
        bar.bar();



        //NoConfigBean class is not configured by any configuration class or file.
        //But instantiated from application context.
        NoConfigBean noConfigBean = ctx.getBean(NoConfigBean.class);
        noConfigBean.foo();
        noConfigBean.name = "asdf";
        System.out.println( noConfigBean.name );

        System.out.println("Hello world!");
    }
}