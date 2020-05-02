package com.esh;

import javax.jms.Connection;
import javax.jms.ConnectionFactory;
import javax.jms.Destination;
import javax.jms.JMSException;
import javax.jms.MessageProducer;
import javax.jms.Session;
import javax.jms.TextMessage;

import org.apache.activemq.ActiveMQConnection;
import org.apache.activemq.ActiveMQConnectionFactory;

public class MessageSender {

	public static void main(String[] args) throws JMSException {
		ConnectionFactory factory = new ActiveMQConnectionFactory(ActiveMQConnection.DEFAULT_BROKER_URL);
		Connection connection = null;
		try {
			
			//Get JMS Connection
			connection = factory.createConnection();
			connection.start();
			
			//Creating a new transactional session 
			Session session = connection.createSession(false, Session.AUTO_ACKNOWLEDGE);
			
			//Create Destination queue
			Destination destination = session.createQueue("q1");
			
			//Create message producer
			MessageProducer producer = session.createProducer(destination);
			
			//Createe message
			TextMessage msg = session.createTextMessage("Hi Consumer");
			
			producer.send(msg);
		} catch (JMSException e) {
			e.printStackTrace();
		}finally {
			connection.close();
		}
	}
}
