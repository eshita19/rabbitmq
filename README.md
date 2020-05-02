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
      - <img src="https://github.com/eshita19/rabbitmq/blob/master/p2p.png"></img>
      - It is for single receiver.
      - Sender publishes message to a virtual channel(queue) in  messaging server. Receiver gets message from mesaging server. Messaging server takes care of deleting the message once a receiver has read it.
      - There are two types: ASync Fire and Forget and  Sync request and reply message(reciever sends ack from different queue).
      - Destination : Queue
      - Persistent(default) vs Non-Persistent messages: In persistent messages, the messages will be stored in disk unless consumed by consumer and will survive broker restart.
      - Example: Mail or Greeting card.
    - **Publish/Subscribe messaging**: 
      - <img src="https://github.com/eshita19/rabbitmq/blob/master/pub-sub.png"></img>
      - One sender multiple receiver.
      - The publisher publishes message as a topic in messaging server. The Subscriber subscribes to this topic. Whenever there are new topics they are automatically broadcasted to subscriber, instead of them reading it from messaging server.
      - Durable/Non-durable subscription: If a subscriber id down for sometime and it comes up, it will revieve all messages sent to it(including the ones when it was down).
      - Destination : Topic
      - Example: Newspaper subscription.
      
# JMS API
  - The basic building blocks of JMS API:
    - **Administered objects** : 
       - **Connection factories** : An object which client uses to connect to provider. For eg: ActiveMQConnectionFactory for Active MQ provider.
       - **Destination**: Target of the messages it produces and source of mesaages it consumers. Queue/Topic.
    - **Connections**: Enacapsulate virtual connection with JMS provider.
    - **Sesssion**: Single threaded context for creating producers, consumers, destination.
    - **Message producers**: Sends message.
    - **Message consumers**: Consumes message
    - **Messages**: JMS messages.
    - **JMS message selector**: Message consumer can specify a filter string to filter the message it receives. The filtering job is done by message broker.
    - **JMS Queue browsers**: Inspect the messages present in queue, not yet sent to consumer.
    - **JMS Message listener**: An asynchronous event handler at consumer end where we can specify an action when msg arrives.
    - **JMS Exception Handling**: The root class for exceptions thrown by JMS API methods is JMSException 

# Apache Active MQ
  - https://www.youtube.com/watch?v=CrpBJgGqhS8&list=PLmCsXDGbJHdgt5mskUPyhtBHQvQsRoJWj
  - Command to start active mq: `bin/activemq start`
  - Active MQ admin page: http://localhost:8161, Credentials: admin/admin.
  - https://github.com/eshita19/rabbitmq/tree/master/activemq
  
  
# Rabbit MQ

- Theory : https://www.cloudamqp.com/blog/2015-05-18-part1-rabbitmq-for-beginners-what-is-rabbitmq.html
