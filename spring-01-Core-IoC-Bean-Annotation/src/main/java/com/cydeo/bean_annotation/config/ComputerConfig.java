package com.cydeo.bean_annotation.config;

import com.cydeo.bean_annotation.casefactory.Case;
import com.cydeo.bean_annotation.casefactory.DellCase;
import com.cydeo.bean_annotation.monitorfactory.AcerMonitor;
import com.cydeo.bean_annotation.monitorfactory.Monitor;
import com.cydeo.bean_annotation.monitorfactory.SonyMonitor;
import com.cydeo.bean_annotation.motherboardfactory.AsusMotherboard;
import com.cydeo.bean_annotation.motherboardfactory.Motherboard;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

@Configuration
public class ComputerConfig {

    @Bean(name = "sony")
    public Monitor monitorSony(){
        return new SonyMonitor("25 inch Beast", "Sony", 25);
    }

    @Bean
    @Primary
    public Monitor monitorAcer(){
        return new AcerMonitor("25 inch Beast", "Acer", 25);
    }

    @Bean
    public Motherboard motherboardAsus(){
        return new AsusMotherboard("25 inch Beast", "Acer", 25, 4, "windows");
    }

    @Bean
    public Case caseDell(){
        return new DellCase("25 inch Beast", "Acer", "1000W");
    }
}
