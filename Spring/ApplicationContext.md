
## Diffrence between ApplicationContext and ConfigurableApplicationContext
That means that when you use an application context, i.e. get beans from it you only use it as an ApplicationContext
but when you manage its life cycle (initialization and destruction) you use methods from ConfigurableApplicationContext

ApplicationContext: This the most powerful Container, compare to Bean-factory (Core container).

ConfigurableApplicationContext (Interface extend ApplicationContext): One of the implementation of the 
ApplicationContext container. 
This container is used for Event Handling propose.

## ApplicationContext https://www.geeksforgeeks.org/spring-applicationcontext/

ApplicationContext belongs to the Spring framework. Spring IoC container is responsible for instantiating, wiring,
configuring, and managing the entire life cycle of beans or objects. BeanFactory and ApplicationContext represent
the Spring IoC Containers. ApplicationContext is the sub-interface of BeanFactory. It is used when we are creating
an enterprise-level application or web application. ApplicationContext is the superset of BeanFactory, whatever
features provided by BeanFactory are also provided by ApplicationContext.

## ApplicationContext Features
ApplicationContext provides basic features in addition to enterprise-specific functionalities which are as follows:

-- Publishing events to registered listeners by resolving property files.
-- Methods for accessing application components.
-- Supports Internationalization.
-- Loading File resources in a generic fashion.
## Note: It is because of these additional features, developers prefer to use ApplicationContext over BeanFactory.  
Spring – BeanFactory : It provides basic functionalities and is recommended for use for lightweight applications 
like mobile and applets. 

## The SpringApplication.run() method is provided by default in the main class when the SpringBoot project is created.
It creates the container, creates beans, manages dependency injection and life cycle of those beans. This is done 
using @SpringBootApplication annotation.

