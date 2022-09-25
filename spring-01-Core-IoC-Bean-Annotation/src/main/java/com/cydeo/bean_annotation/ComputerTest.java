package com.cydeo.bean_annotation;

import com.cydeo.bean_annotation.casefactory.Case;
import com.cydeo.bean_annotation.casefactory.DellCase;
import com.cydeo.bean_annotation.config.ComputerConfig;
import com.cydeo.bean_annotation.monitorfactory.Monitor;
import com.cydeo.bean_annotation.monitorfactory.SonyMonitor;
import com.cydeo.bean_annotation.motherboardfactory.AsusMotherboard;
import com.cydeo.bean_annotation.motherboardfactory.Motherboard;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.Arrays;

public class ComputerTest {
    public static void main(String[] args) {

        ApplicationContext container = new AnnotationConfigApplicationContext(ComputerConfig.class);

        Monitor theMonitor = container.getBean(SonyMonitor.class);
        Case theCase = container.getBean(Case.class);
        Motherboard theMotherboard = container.getBean(Motherboard.class);
        PC pc = new PC(theCase, theMonitor, theMotherboard);

        pc.powerUp();

        //Creating container by using BeanFactory
        BeanFactory context = new AnnotationConfigApplicationContext();

        System.out.println("Retrieving the beans");

        SonyMonitor sony = container.getBean(SonyMonitor.class);
        DellCase dell = container.getBean(DellCase.class);
        AsusMotherboard asus = container.getBean(AsusMotherboard.class);

        PC myPc = new PC(dell, sony, asus);

        myPc.powerUp();

        dell.pressPowerButton();

        System.out.println("**************** Retrieving the beans **********************");

        Monitor theMonitor2 = container.getBean("monitorAcer", Monitor.class);
        Case theCase2 = container.getBean(Case.class);
        Motherboard theMotherboard2 = container.getBean(Motherboard.class);

        PC myPc2 = new PC(theCase2, theMonitor2, theMotherboard2);

        System.out.println("********************* Multiple Objects *****************");

        Monitor theMonitor3 = container.getBean("monitorSony", Monitor.class);
        Monitor theMonitor4 = container.getBean("sony", Monitor.class);
        Monitor theMonitor5 = container.getBean(Monitor.class);
    }
}
