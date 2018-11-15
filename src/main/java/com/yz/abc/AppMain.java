package com.yz.abc;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author your.name Date: 2018-11-15 Time: 15:09
 * @version $Id$
 */
public class AppMain {

    public static void main(String[] args) {
        AbstractApplicationContext context =
            new ClassPathXmlApplicationContext("spring.xml");
    }
}
