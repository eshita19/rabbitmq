package com.esh.jms;

import javax.jms.JMSException;
import javax.jms.Message;
import javax.jms.MessageListener;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jms.support.converter.MessageConversionException;
import org.springframework.jms.support.converter.MessageConverter;
import org.springframework.stereotype.Component;

//@Component
public class MessageAsyncReceiver implements MessageListener{

	@Autowired
	MessageConverter messageConverter;
	
	@Override
	public void onMessage(Message message) {
		try {
			System.out.println("Received Async Msg: " + messageConverter.fromMessage(message)
					);
		} catch (MessageConversionException | JMSException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
