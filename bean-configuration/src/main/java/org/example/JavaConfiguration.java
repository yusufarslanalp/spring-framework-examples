package org.example;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("org.example")
public class JavaConfiguration {

    //name of bean function is important. if you chang function name from javaConfigBean
    //to foo or any other thing it won't work.
    @Bean(name = {"noName"})
    public JavaConfigBean getNoParameterJB(){
        return new JavaConfigBean();
    }/**/

    @Bean(name = {"withName"})
    public JavaConfigBean getWithNameJB(){
        return new JavaConfigBean( "Java Configured Bean" );
    }/**/

}
