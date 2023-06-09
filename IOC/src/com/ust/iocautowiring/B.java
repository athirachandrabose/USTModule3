package com.ust.iocautowiring;

import javax.annotation.*;

import org.springframework.beans.factory.annotation.Qualifier;


public class B {
    A a;
public B() {
	// TODO Auto-generated constructor stub
}
	public A getA() {
		return a;
	}
	@Qualifier("a")
	public void setA(A a) {//byName,byType will use setter injection
		//autowiring is applicable only to objects and not to primitives and strings
		//add default constructor to call bytype and byname
		System.out.println("setA() called...............");
		this.a = a;
	}
    
    public B(A a) {
		this.a=a;
		System.out.println("from B() constructor.........");
	}
    @PostConstruct//treats the following method as init method
    //postconstruct and predestroy are called call back methods and it is called by ioc containers
    public void setUp() {
    	System.out.println("from setup()...............");
    }
    @PreDestroy
    public void windUp() {
    	System.out.println("from WindUp()....................");
    }
    
    
}
