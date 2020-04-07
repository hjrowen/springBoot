package com.hihi.springaop.impl;

import com.hihi.springaop.intf.SayHello;

/**
 * @author Hejiaran
 */
public class SayHelloImp implements SayHello {
    @Override
    public String sayHello() {
        System.out.println("hello world...");
        return "hello world";
    }
}
