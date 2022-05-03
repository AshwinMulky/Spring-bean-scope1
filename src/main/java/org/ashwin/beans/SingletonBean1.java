package org.ashwin.beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class SingletonBean1 {

    @Autowired
    private PrototypeBean1 prototypeBean1;

    public PrototypeBean1 getPrototypeBean1() {
        return this.prototypeBean1;
    }
}
