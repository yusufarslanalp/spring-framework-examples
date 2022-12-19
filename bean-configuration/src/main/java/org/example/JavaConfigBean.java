package org.example;


import org.springframework.stereotype.Component;


//@Component
public class JavaConfigBean {

    String name;

    JavaConfigBean(){

    }

    JavaConfigBean( String name ){
        this.name = name;
    }

    public void show(){
        System.out.println( "running show function in JavaConfigBean class" );
    }

}
