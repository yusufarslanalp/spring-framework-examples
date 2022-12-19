package org.example;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class HasJavaConfigBean {

    //Using @Qualifier in here and Bean(name="") in Configuration class
    //you can specify witch Constructor to use.
   @Autowired
   @Qualifier("withName")
   public JavaConfigBean beanWithName;

    @Autowired
    @Qualifier("noName")
    public JavaConfigBean beanWithNoName;

    public void bar(){
        System.out.println( "dsfadsfasf" );
    }

}
