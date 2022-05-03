package org.ashwin.beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Lookup;
import org.springframework.stereotype.Component;

@Component
public abstract class SingletonBean2 {

    @Autowired
    private PrototypeBean prototypeBean;

    public PrototypeBean getPrototypeBean() {
        return this.getBean();
    }

    @Lookup
    public abstract PrototypeBean getBean();
}
