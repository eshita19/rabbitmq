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

# Rabbit MQ

- Theory : https://www.cloudamqp.com/blog/2015-05-18-part1-rabbitmq-for-beginners-what-is-rabbitmq.html
