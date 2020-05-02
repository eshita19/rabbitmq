package com.esh;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;

import com.esh.config.AppConfig;
import com.esh.jms.MessageSender;
import com.esh.jms.Student;

public class MessageProducerApp {
	public static void main(String[] args)
	{
		AbstractApplicationContext context = new AnnotationConfigApplicationContext(
				AppConfig.class);

		MessageSender messageSender = context.getBean(MessageSender.class);
		Student student = new Student(1, "Eshita");
		messageSender.sendMessage(student);
		System.out.println("Message has been sent successfully...");
		

		((AbstractApplicationContext) context).close();
	}
}
