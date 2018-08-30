package com.kthilina;

import com.kthilina.exception.JdbcTemplateRollBackException;
import com.kthilina.exception.SavedFailException;
import com.kthilina.service.CustomerService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class JdbcTemplateApp {

    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("spring-module.xml");
        CustomerService customerService = (CustomerService) context.getBean("customerService");
        try {
            customerService.persiste();
        } catch (JdbcTemplateRollBackException ex) {
            ex.printStackTrace();
        }
    }
}
