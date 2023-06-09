package com.ust.ioc2;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.FileSystemResource;

public class TestDrawing {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//       BeanFactory factory=new XmlBeanFactory(new FileSystemResource("beans.xml"));
//       Object obj=factory.getBean("point1");
//		System.out.println(obj);
//		
//		Object obj2=factory.getBean("point2");
//		System.out.println(obj2);
//		
//		Object obj3=factory.getBean("line");
//		Line line=(Line)obj3;
//		line.drawLine();

		// ClassPathXmlApplicationContext context
//		ApplicationContext context=new ClassPathXmlApplicationContext("beans.xml");
		ConfigurableApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
		context.registerShutdownHook();
		boolean exists = context.containsBean("line");
		System.out.println(exists);
		if (exists) {
			Object object = context.getBean("line");
			if (object instanceof Line) {
				Line line = (Line) object;
				line.drawLine();
			}
		}
		boolean type = context.isSingleton("line");
		// every bean created by bean factory or application context is a singelton(a
		// class having only one instance)
		System.out.println(type);
//		Object object=context.getBean("line");
//		Object object2=context.getBean("line");
//		if(object.hashCode()==object2.hashCode()) {
//			System.out.println("line is singelton");
//		}
//		else {
//			System.out.println("line is not singelton");
//		}
		Line line1 = (Line) context.getBean("line");
		Line line2 = (Line) context.getBean("line");
		if (line1.hashCode() == line2.hashCode()) {
			System.out.println("line is singelton");
		} else {
			System.out.println("line is not singelton");
		}
		// after constructor only init method is called
	}

}
