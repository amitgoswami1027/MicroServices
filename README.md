## MicroServices By Amit Goswami (All Important resources under one head)
Martin Flower Defination: The term "Microservice Architecture" has sprung up over the last few years to describe a particular way of designing software applications as suites of independently deployable services. While there is no precise definition of this architectural style, there are certain common characteristics around organization around business capability, automated deployment, intelligence in the endpoints, and decentralized control of languages and data.

#### MircoServices1 --> MicroServices2 --> MicroServices3 --> MicroServices4 --> MicroServices5

#### End to End Flow for the System Architecture.
##### Microservices --> Configuration --> AutoScaling --> Cloud(AWS) --> Kubernetes (Deployment)/Autmation

### Link for Reference: https://martinfowler.com/articles/microservices.html (Good Read)

### SILENT FEATURES OF MICROSERVICES
* #### RESTFUL WEB SERVICE
* #### SMALL WELL CHOOSEN DEPLOYABLE UNITS.
* #### CLOUD ENABLED - DYNAMIC SCALE UP AND SCALE DOWN,DYNAMIC LOAD BALANCING.
* #### DECIDING THE BOUNDARY OF THE MICROSERVICES IS EVOLUTIONARY PROCESS. (BOUNDED CONTEXT - EVOLUTIONARY)
* #### VISIBILITY/MONITORING. 
* #### FAULT TOLERANCE. 

### DEVELOPING MICROSERVICES USING JAVA SPRINGBOOT 
We are trying to develop the microservices system which can demonstrate end to end different concepts of the good Microservices architecture. Create the integration of these microservice, how they intract with one another and can be deployed on AWS (Amazoon web Services).

### Different Servers that we would be creating in this coding excercise:
* "Limit Server --> ""Spring cloud config server" (Limit Server connect to Spring Cloud Config Server to retrieve all the configuration of different microservices centrally.)
* "Currency Exchange Server"
* "currency Conversion Server"

### Dynamic Scale up and Scale Down
*  Naming Server (Eureka) 
*  Ribbon (Client Side Load Balancing)
*  Feign ( Easier Rest Clients)
*  Zipkin Distribution (Visibility & Monitoring)
*  NetFlix Zuul API Gateway (Visibility & Monitoring)
*  Hystrix (Fault Tolerance)





