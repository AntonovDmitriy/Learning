package com.antonov.simpletest;

import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;

public class XmlConfigWithBeanFactory {

    public static void main(String[] args) {

        DefaultListableBeanFactory factory = new DefaultListableBeanFactory();
        XmlBeanDefinitionReader reader = new XmlBeanDefinitionReader(factory);
        reader.loadBeanDefinitions("/xml-bean-factory-config.xml");
        Oracle bean = (Oracle) factory.getBean("oracle");
        System.out.println(bean.defineMeaningOfLife());
    }
}
