package com.lecheng.spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.mail.MailSender;
import org.springframework.mail.SimpleMailMessage;

/**
 * Created by Lecheng on 2015/10/22.
 */
public class Main {

    public static void main(String[] args) {
        ApplicationContext actx = new ClassPathXmlApplicationContext("spring.xml");
        MailSender ms = (MailSender) actx.getBean("mailSender");
        SimpleMailMessage smm = (SimpleMailMessage) actx.getBean("mailMessage");
        //
        smm.setSubject("spring-mail");
        smm.setText("spring hello world");
        ms.send(smm);
    }
}
