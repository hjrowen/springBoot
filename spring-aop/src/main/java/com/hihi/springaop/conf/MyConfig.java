package com.hihi.springaop.conf;

import com.hihi.springaop.impl.SayHelloImp;
import com.hihi.springaop.intf.SayHello;
import org.springframework.aop.framework.ProxyFactoryBean;
import org.springframework.aop.framework.autoproxy.DefaultAdvisorAutoProxyCreator;
import org.springframework.aop.support.DefaultIntroductionAdvisor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.core.annotation.Order;

/**
 * @author Hejiaran
 */
@Configuration
@EnableAspectJAutoProxy(proxyTargetClass = true)
public class MyConfig {

    @Bean
    public SayHello sayHello() {
        return new SayHelloImp();
    }

    @Bean
    public LogAspectJ logAspectJ() {
        return new LogAspectJ();
    }

}
