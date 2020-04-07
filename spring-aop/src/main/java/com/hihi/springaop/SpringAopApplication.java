package com.hihi.springaop;

import com.hihi.springaop.conf.MyConfig;
import com.hihi.springaop.intf.SayHello;
//import org.springframework.boot.SpringApplication;
//import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

//@SpringBootApplication
public class SpringAopApplication {

    public static void main(String[] args) {
//        SpringApplication.run(SpringAopApplication.class, args);
        AnnotationConfigApplicationContext cx = new AnnotationConfigApplicationContext(MyConfig.class);
        SayHello bean = ((SayHello) cx.getBean("sayHello"));
        bean.sayHello();
    }

}
