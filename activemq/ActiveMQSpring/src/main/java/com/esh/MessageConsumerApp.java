package com.esh;

import javax.jms.JMSException;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.jms.JmsException;
import org.springframework.jms.support.converter.MessageConversionException;

import com.esh.config.AppConfig;
import com.esh.jms.MessageReceiver;

public class MessageConsumerApp {
	public static void main(String[] args) throws MessageConversionException, JmsException, JMSException
	{
		AbstractApplicationContext context = new AnnotationConfigApplicationContext(
				AppConfig.class);

		MessageReceiver messageReceiver = context.getBean(MessageReceiver.class);
		System.out.println("Recieved message: " + messageReceiver.getMessage());

		((AbstractApplicationContext) context).close();
	}
}
