package org.example;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

import java.io.File;

public class Main {



    public static void main(String[] args) {


        ApplicationContext ctx = new AnnotationConfigApplicationContext(JavaConfiguration.class);
        JavaConfigBean javaConfigBean = ctx.getBean( "noName", JavaConfigBean.class );
        javaConfigBean.show();


        HasJavaConfigBean bar = ctx.getBean( HasJavaConfigBean.class );
        System.out.println( bar.beanWithName.name );
        System.out.println( bar.beanWithNoName.name );
        bar.bar();
        System.out.println();



        //NoConfigBean class is not configured by any configuration class or file.
        //But instantiated from application context.
        NoConfigBean noConfigBean = ctx.getBean(NoConfigBean.class);
        noConfigBean.foo();
        noConfigBean.name = "no configured bean";
        System.out.println( noConfigBean );

        //XML configured beans
        String basePath = new File("").getAbsolutePath();
        System.out.println( "\nFollowing beans created with XML configurations:" );
        ApplicationContext ac = new FileSystemXmlApplicationContext(basePath + "\\" + "configuration.xml");
        XmlConfigBean xmlConfigBean = (XmlConfigBean) ac.getBean( "bean" );
        System.out.println( xmlConfigBean );
        XmlConfigBean XmlBeanWithSetters = (XmlConfigBean) ac.getBean( "XmlBeanWithSetters" );
        System.out.println( XmlBeanWithSetters );
        XmlConfigBean XmlBeanWithConstructor = (XmlConfigBean) ac.getBean( "XmlBeanWithConstructor" );
        System.out.println( XmlBeanWithConstructor );

    }
}