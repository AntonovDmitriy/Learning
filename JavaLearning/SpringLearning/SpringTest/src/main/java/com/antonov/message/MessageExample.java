package com.antonov.message;

import org.springframework.context.support.GenericXmlApplicationContext;

public class MessageExample {

    public static void main(String[] args) {

        GenericXmlApplicationContext context = new GenericXmlApplicationContext();

        /*Пример использования разных типов загрузки. Через конфигурацию в xml бинов
        либо через конфигурацию xml с указанием поиска бинов по аннотациям в определенном пакете
        * */

        context.load("classpath:messages-annotation-config.xml");
//        context.load("classpath:messages-xml-config.xml");
        context.refresh();
        MessageProvider provider = context.getBean("messageProvider", MessageProvider.class);
        System.out.println(provider.getMessage());

    }
}
