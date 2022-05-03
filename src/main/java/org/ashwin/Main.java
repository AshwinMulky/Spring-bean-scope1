package org.ashwin;

import org.ashwin.beans.PrototypeBean;
import org.ashwin.beans.SingletonBean;
import org.ashwin.beans.SingletonBean1;
import org.ashwin.beans.SingletonBean2;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {

        ApplicationContext context = new AnnotationConfigApplicationContext("org.ashwin.beans");
        System.out.println("Context initialized");

        SingletonBean s1 = context.getBean("singletonBean", SingletonBean.class);
        SingletonBean s2 = context.getBean("singletonBean", SingletonBean.class);
        System.out.println("s1 = "+s1);
        System.out.println("s2 = "+s2);
        System.out.println("s1.getPrototypeBean = "+s1.getPrototypeBean());//returns same prototype instance
        System.out.println("s1.getPrototypeBean = "+s1.getPrototypeBean());//returns same prototype instance

        PrototypeBean p1 = context.getBean("prototypeBean", PrototypeBean.class);
        PrototypeBean p2 = context.getBean("prototypeBean", PrototypeBean.class);
        System.out.println("p1 = "+p1);
        System.out.println("p2 = "+p2);

       //method 1 to make getProtoTypeBean in Singletonbean to return different objects
        SingletonBean1 s11 = context.getBean("singletonBean1", SingletonBean1.class);

        System.out.println("s11.getPrototypeBean1 = "+s11.getPrototypeBean1());
        System.out.println("s11.getPrototypeBean1 = "+s11.getPrototypeBean1());

        //method 2 to make getProtoTypeBean in Singletonbean to return different objects - recommended
        SingletonBean2 s22 = context.getBean("singletonBean2", SingletonBean2.class);

        System.out.println("s22.getPrototypeBean = "+s22.getPrototypeBean());
        System.out.println("s22.getPrototypeBean = "+s22.getPrototypeBean());

        //Singleton bean will be specific to an application context. Each application context will have its own copy.

        //Other scopes like request, session, application and websocket works only in web application context
    }
}