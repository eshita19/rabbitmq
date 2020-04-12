# Messaging
  - Provides communication between sender application and reciever application with a messaging server as middleware.
  - **Advantages**:
    - _Asynchronous_: To receive the message, client is not required to send request. Message will arrive automatically to the client.
    - _Reliable_: It provides assurance that message is delivered.
    - _Heterogenous application communication_: Allows apps running on different OS to communicate seamlessly.
    - _Loose coupling_: Brings in loose coupling between applications.
    - _Reduce system bottlenecks_: If there are too many messages sent by sender and single receiver is not able to process it, we can scale the number of receivers. 
    
# Java Messaging Service (JMS 2.0)
  - There are multiple messaging server available like : ActiveMQ, SonicMQ, TibcoMQ and Websphere MQ.
  - JMS provides a standardised API. All the messaging server uses same API.
  - JMS is for messaging what JDBC is for database connections.
  - **Two types of messaging**:
    - **Point to Point messaging(P2P messaging)**:
      - It is for single receiver.
      - Sender publishes message to a virtual channel(queue) in  messaging server. Receiver gets message from mesaging server. Messaging server takes care of deleting the message once a receiver has read it.
      - There are two types: ASync Fire and Forget and  Sync request and reply message(reciever sends ack from different queue).
      - Example: Mail or Greeting card.
    - **Publish/Subscribe messaging**: 
      - One sender multiple receiver.
      - The publisher publishes message as a topic in messaging server. The Subscriber subscribes to this topic. Whenever there are new topics they are automatically broadcasted to messaging server, instead of them reading it from messaging server.
      - Example: Newspaper subscription.
       

# Rabbit MQ

- Theory : https://www.cloudamqp.com/blog/2015-05-18-part1-rabbitmq-for-beginners-what-is-rabbitmq.html
