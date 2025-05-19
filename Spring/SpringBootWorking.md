https://www.geeksforgeeks.org/how-spring-boot-application-works-internally/

Spring Boot Application starts using a main method, like any other Java program, and the main method is called the
"run" method i.e. SpringApplication.run(). From this run method, the application context of IOC (Inversion Of Control)
searches the class annotated with @Configuration annotation which calls all the beans in the classpath and initializes
those classes. Beans are stored inside a particular space in JVM (Java Virtual Machine). That particular space is 
known as the IOC Container.

After beans are created the requests will go to the dispatcher servlet and the dispatcher servlet will distribute all
the requests among the appropriate controllers. To understand how a Spring Boot application works internally, it is 
essential to know its key components and the flow of the application.

Spring Boot Layered Architecture
Spring Boot follows a layered architecture in which each layer communicates with the other layer directly in a 
hierarchical structure.

There are 4 layers in Spring Boot as follows:

1. Presentation Layer
2. Business Layer
3. Persistence Layer
4. Database Layer

How-Spring-Boot-Application-Works-internally-Layered-Architecture-Image
1. Presentation Layer
   This layer handles all the HTTP requests made by clients, then it translates the JSON parameter to object and 
   also authenticates the request, and transfer it to the business layer. In short, it only consists of the frontend 
   part or we can say the view part.

2. Business Layer
   This is also known as the Service layer which handles all the business logic of an application. It consists of 
   service classes and uses services provided by the data access layers. It also performs authorization and validation.

3. Persistence Layer
   It contains all the storage logic which are required and translates the business objects to database rows.

4. Database Layer
   In this layer, all the CRUD (create, read update, delete) operations are performed.