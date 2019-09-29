## MicroServices By Amit Goswami (All Important resources under one head)
We are trying to develop the microservices system which can demonstrate end to end different concepts of the good Microservices architecture. Create the integration of these microservice, how they intract with one another and can be deployed on AWS (Amazoon web Services).

### DEVELOPING MICROSERVICES USING JAVA SPRINGBOOT 
Martin Flower Defination: The term "Microservice Architecture" has sprung up over the last few years to describe a particular way of designing software applications as suites of independently deployable services. While there is no precise definition of this architectural style, there are certain common characteristics around organization around business capability, automated deployment, intelligence in the endpoints, and decentralized control of languages and data.

#### MircoServices1 --> MicroServices2 --> MicroServices3 --> MicroServices4 --> MicroServices5

#### End to End Flow for the System Architecture.
##### Microservices --> Configuration --> AutoScaling --> Cloud(AWS) --> Kubernetes (Deployment)/Autmation

### Link for Reference: https://martinfowler.com/articles/microservices.html (Good Read)
### SpringBoot Tutorial: https://www.springboottutorial.com/
### URI Vs URL : Most of the confusion with these two is because they are related. You see, a URI can be a name, locator, or both for an online resource where a URL is just the locator. URLs are a subset of URIs. That means all URLs are URIs. It doesn't work the opposite way though.Not all URIs are URLs because a URI could be a name instead of a locator.
* https://upload.wikimedia.org/wikipedia/commons/c/c3/URI_Euler_Diagram_no_lone_URIs.svg

### SILENT FEATURES OF MICROSERVICES
* #### RESTFUL WEB SERVICE
* #### SMALL WELL CHOOSEN DEPLOYABLE UNITS.
* #### CLOUD ENABLED - DYNAMIC SCALE UP AND SCALE DOWN,DYNAMIC LOAD BALANCING.
* #### DECIDING THE BOUNDARY OF THE MICROSERVICES IS EVOLUTIONARY PROCESS. (BOUNDED CONTEXT - EVOLUTIONARY)
* #### VISIBILITY/MONITORING. 
* #### FAULT TOLERANCE. 

### Different Servers that we would be creating in this coding excercise:
* "Limit Server --> ""Spring cloud config server" (Limit Server connect to Spring Cloud Config Server to retrieve all the configuration of different microservices centrally.)
* "Currency Exchange Server"
* "currency Conversion Server"

### Details of the Services used:
*  Naming Server (Eureka) 
*  Ribbon (Client Side Load Balancing)
*  Feign ( Easier Rest Clients)
*  Zipkin Distribution (Visibility & Monitoring)
*  NetFlix Zuul API Gateway (Visibility & Monitoring)
*  Hystrix (Fault Tolerance)

#### ----------------------------------------------------------------------------------------------------------
#### Spring Cloud Config Service 
#### Fetches the limits service configration via spring cloud config service
URI : 
* http://localhost:8888/limits-service/default
* http://localhost:8888/limits-service/qa
* http://localhost:8888/limits-service/dev
      
      OUTPUT Using POSTMAN APP:
      http://localhost:8888/limits-service/default
      {
    "name": "limits-service",
    "profiles": [
        "default"
    ],
    "label": null,
    "version": "3fb82145e20b15dfe44dee31fb595600de0b7d7b",
    "state": null,
    "propertySources": [
        {
            "name": "https://github.com/amitgoswami1027/springconfigrepo.git/limits-service.properties",
            "source": {
                "limits-service.minimum": "1000",
                "limits-service.maximum": "100000"
            }
        }
    ]
}

#### -------------------------------------------------------------------------------------------------------------
### Currency Exchange Service
### Fetches the details of the currency rates
URI:
* http://localhost:9000/currency-exchange/from/USD/to/INR

OUTPUT
{
    "id": 1000,
    "from": "USD",
    "to": "INR",
    "conversionMultiple": 65,
    "port": 9000
}

Installing Rabbit MQ
Windows
https://www.rabbitmq.com/install-windows.html
https://www.rabbitmq.com/which-erlang.html
http://www.erlang.org/downloads
Video - https://www.youtube.com/watch?v=gKzKUmtOwR4


Currency Converter Service - Feign	http://localhost:8100/currency-converter-feign/from/EUR/to/INR/quantity/10000
Currency Exchange Service	http://localhost:8000/currency-exchange/from/EUR/to/INR http://localhost:8001/currency-exchange/from/USD/to/INR
Eureka	http://localhost:8761/
Zuul - Currency Exchange & Exchange Services	http://localhost:8765/currency-exchange-service/currency-exchange/from/EUR/to/INR http://localhost:8765/currency-conversion-service/currency-converter-feign/from/USD/to/INR/quantity/10

















