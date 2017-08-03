package com.antonov.message;

import org.springframework.context.support.GenericXmlApplicationContext;

public class MessageExample {

    public static void main(String[] args) {

        /*
        * Раньше мне был известен класс другой. Но появился новый более удобный контекст
        *
        * Convenient application context with built-in XML support.
        * This is a flexible alternative to {@link ClassPathXmlApplicationContext}
        * and {@link FileSystemXmlApplicationContext}, to be configured via setters,
        * with an eventual {@link #refresh()} call activating the context.
        **/

        GenericXmlApplicationContext context = new GenericXmlApplicationContext();

        /*Пример использования разных типов загрузки. Через конфигурацию в xml бинов
        либо через конфигурацию xml с указанием поиска бинов по аннотациям в определенном пакете
        * */

        context.load("classpath:messages-annotation-config.xml");
//        context.load("classpath:messages-xml-config.xml");
        context.refresh();
        MessageRenderer renderer = context.getBean("messageRenderer", MessageRenderer.class);
        renderer.render();

    }
}
