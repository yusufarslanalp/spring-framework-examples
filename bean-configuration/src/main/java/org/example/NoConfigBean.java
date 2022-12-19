package org.example;

import org.springframework.stereotype.Component;

//Commenting @component throws .NoSuchBeanDefinitionException exception.
@Component
public class NoConfigBean {

    public String name;

    public void foo(){
        System.out.println( "printed from NoConfigBean.foo()" );

    }


}
