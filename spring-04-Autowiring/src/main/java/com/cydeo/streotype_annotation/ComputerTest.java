package com.cydeo.streotype_annotation;

import com.cydeo.streotype_annotation.config.PcConfig;
import com.cydeo.streotype_annotation.monitorfactory.AcerMonitor;
import com.cydeo.streotype_annotation.monitorfactory.Monitor;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class ComputerTest {
    public static void main(String[] args) {

        ApplicationContext context = new AnnotationConfigApplicationContext(PcConfig.class);

        PC myPc = context.getBean( PC.class, "acer",Monitor.class);

        System.out.println(myPc.getMonitor().getManufacturer());
    }
}
