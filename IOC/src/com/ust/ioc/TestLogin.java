package com.ust.ioc;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.FileSystemResource;

public class TestLogin {
public static void main(String[] args) {
//	Login login=new Login();
//	login.setUsername("john doe");
//	login.setPassword("winny-minny");
//	String result=login.validate();
//	System.out.println(result);
	BeanFactory factory=new XmlBeanFactory(new FileSystemResource("beans.xml"));
	//all beans are auto promoted to object type
	Object obj=factory.getBean("connection");
	System.out.println(obj);
	Object obj2=factory.getBean("login");
	Login login=(Login)obj2;
	login.validate();
}
}
