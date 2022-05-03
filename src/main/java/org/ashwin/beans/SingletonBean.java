package org.ashwin.beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class SingletonBean {

    @Autowired
    private PrototypeBean prototypeBean;

    public SingletonBean() {
        System.out.println("Singleton bean created");
    }

    public PrototypeBean getPrototypeBean() {
        return this.prototypeBean;
    }
}
