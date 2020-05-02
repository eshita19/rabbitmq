package com.esh.jms;

import javax.jms.Message;

import org.springframework.jms.annotation.JmsListener;
import org.springframework.stereotype.Component;

import com.esh.config.MessagingConfig;

@Component
public class MessageAsyncAnnoReceiver {
	
	@JmsListener(destination = MessagingConfig.MESSAGE_QUEUE)
	public void receiveMsg(final Message msg){
		System.out.println("Inside MessageAsyncAnnoReceiver, Received msg" + msg);
	}

}
