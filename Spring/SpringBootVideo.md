
https://www.youtube.com/watch?v=d4dcV7Kt3SI&list=PLA3GkZPtsafacdBLdd3p1DyRd5FGfr3Ue&index=4

bunch of method is called class.
bunch of classes is called package
bunch of package is called library
bunch of library is called project

bunch of projects together for bunch's of solutions is called Framework

## Compatibility
Spring Framework version 5,4 (Backward compatible -> Java EE APIs) work with. Enterprise Edition
Spring Boot version 2 (Backward compatible)
Java min 8

Spring Framework version 6 (not Backward compatible ->Jakarta API) work with
Spring Boot version 3 (not Backward compatible)
Java min 17


## Project meta-data

-- Group -> Company name (group-id unique through-out the world)
-- Artifact -> jar file name (Project name) (artifact id is unique throughout the company)
-- Name -> Project name
-- jar - java archive -> we can directly use it with cmd line
-- war -> web application archive -> to run this file we need to deploy it on any external web server

## Maven is a build automation tool that help to manage dependencies, 
-- Two ways to use dependencies, first by download from their official website and then import in your project
-- Second way is by using maven repository to directly copy the code and paste in .pom file to use it
(https://mvnrepository.com)

-- i.e <dependency> 
            <groupId>com.facebook.android</groupId>
            <artifactId>facebook-login</artifactId>
            <version>18.0.3</version>
        </dependency>
-- Three component of dependency groupID (Company Name), artifactID (Jar File name), version (dependency version)

## A Build Lifecycle is Made Up of Phases
Each of these build lifecycles is defined by a different list of build phases, wherein a build phase represents a
stage in the lifecycle.

For example, the default lifecycle comprises of the following phases (for a complete list of the lifecycle phases, 
refer to the Lifecycle Reference):

-- validate - validate the project is correct and all necessary information is available (.pom is fine)
-- compile - compile the source code of the project
-- test - test the compiled source code using a suitable unit testing framework. These tests should not require 
   the code be packaged or deployed
-- package - take the compiled code and package it in its distributable format, such as a JAR.
-- verify - run any checks on results of integration tests to ensure quality criteria are met
-- install - install the package into the local repository, for use as a dependency in other projects locally
-- deploy - done in the build environment, copies the final package to the remote repository for sharing with other 
   developers and projects.

These lifecycle phases (plus the other lifecycle phases not shown here) are executed sequentially to complete the
default lifecycle. Given the lifecycle phases above, this means that when the default lifecycle is used, Maven will 
first validate the project, then will try to compile the sources, run those against the tests, package the binaries 
(e.g. jar), run integration tests against that package, verify the integration tests, install the verified package 
to the local repository, then deploy the installed package to a remote repository.

## Plugins
The second way to add goals to phases is to configure plugins in your project. Plugins are artifacts that provide
goals to Maven. Furthermore, a plugin may have one or more goals wherein each goal represents a capability of that 
plugin. For example, the Compiler plugin has two goals: compile and testCompile. The former compiles the source code 
of your main code, while the latter compiles the source code of your test code.

-- Plugins are under build lifecycle phase and help to create .jar files

## How to run .jar file
create package with mvn package
then check target\ (.jar created in target folder)
to run jar file cmd is java -jar jarFileName


## <parent>  // parent dependency is used to inherit required dependency and plugins
		<groupId>org.springframework.boot</groupId>
		<artifactId>spring-boot-starter-parent</artifactId>
		<version>3.3.11</version>
		<relativePath/> <!-- lookup parent from repository -->
	</parent>

## <properties> // to pass maven compiler that source code would be written and must compatible with java 17
		<java.version>17</java.version>
	</properties>

## In Maven, GAV stands for:

📦 GAV = GroupId + ArtifactId + Version
These three elements uniquely identify a Maven artifact (like a library or a project) in a repository.

🔹 1. GroupId
Meaning: The project's group or organization.
Example: org.springframework, com.google.guava
🔹 2. ArtifactId
Meaning: The name of the specific project/module.
Example: spring-core, guava
🔹 3. Version
Meaning: The specific version of the artifact.
Example: 5.3.20, 31.1-jre
📘 Example in a pom.xml:
<dependency>
<groupId>org.springframework</groupId>
<artifactId>spring-core</artifactId>
<version>5.3.20</version>
</dependency>
This tells Maven:

“Fetch version 5.3.20 of the spring-core library from the org.springframework group.”


## In Maven, a plugin is a reusable piece of software that performs specific tasks during the build lifecycle of 
  a project.

A plugin in Maven:
-- Extends Maven's functionality.
-- Provides goals (individual tasks) like compiling code, packaging, testing, generating reports, etc.
-- Is defined in the pom.xml file.
📘 Example:
<plugin>
<groupId>org.apache.maven.plugins</groupId>
<artifactId>maven-compiler-plugin</artifactId>
<version>3.8.1</version>
<configuration>
<source>1.8</source>
<target>1.8</target>
</configuration>
</plugin>

This example tells Maven to:
-- Use the maven-compiler-plugin to compile Java code for Java 8.

🔧 Common Maven Plugins:
Plugin Name	                    Purpose
maven-compiler-plugin	        Compiles Java source code
maven-surefire-plugin	        Runs unit tests
maven-jar-plugin	            Builds JAR files
maven-clean-plugin	            Cleans the project directory
maven-install-plugin	        Installs artifacts to the local repo

A plugin in Maven is a tool that helps automate and manage tasks in the build process.

## Difference between .jar and .jar.original file
During mvn packing it will create two files, .jar file is called "FAT JAR file" because it's contain all the dependency
and plugging , web server, which we need to to run project. But jar.original file only contains "Compile code" that why
its size in kbs only.

## Repackaging
Compiler first create .jar.original file, then use this file to create .jar (FAT) file (REPACKING) to include all 
dependency and plugging.

In Maven, the term repacking (or repackaging) usually refers to modifying an existing packaged artifact—like a JAR 
or WAR—after it's built, often to:
-- Add dependencies
-- Embed resources
-- Make it executable

🚀 Common Repacking Use Case: Spring Boot
In Spring Boot, repackaging is done by the spring-boot-maven-plugin, which:

-- Takes the original JAR file
-- Adds all dependencies inside
-- Makes it an executable JAR (java -jar app.jar)

📘 Example:

<plugin>
  <groupId>org.springframework.boot</groupId>
  <artifactId>spring-boot-maven-plugin</artifactId>
</plugin>

Running mvn package with this plugin will:

Repackage your app with its dependencies into a fat JAR (also called uber JAR), so it can run standalone.

## IOC (Inversion of control)
-- Inversion means now objects/ beans will be created by spring itself by using third party called externalization.
-- Spring keep IOC container, which keep all the classes and objects of our project and provided when it needed.
-- To keep all the classes in IOC container, it uses scanner (@Component scanner), the class which has written
 @component annotation , is keep by IOC Container as bean.
-- Ioc keep the object as bean.
-- @Component annotation will be written on any CLass, Interface, Method, Field name

## What is IOC (Inversion of Control) in Spring?
Inversion of Control (IoC) is a core principle of the Spring Framework. It means the control of object creation and 
dependency management is inverted from your code to the Spring container.

🔄 Traditional vs IoC
🔧 Without IoC:

Car car = new Car(new Engine());
Your code is responsible for creating and wiring dependencies.
🌱 With IoC in Spring:

@Component
public class Car {
@Autowired
private Engine engine;
}
Spring creates the Car and injects the Engine automatically.

🧰 How Spring Implements IoC
Spring uses a container (like ApplicationContext) to:
-- Instantiate objects (beans)
-- Manage their lifecycle
-- Inject dependencies
This is called Dependency Injection (DI) — a common form of IoC.

✅ Benefits of IoC
-- Loose coupling
-- Better testability
-- Easier configuration and maintenance
-- Scalable architecture

🚀 Real-World Analogy
Think of a restaurant:

Without IoC: You cook your own food.
With IoC: You order, and the kitchen (Spring container) handles everything.

## Annotation -- provide the information about on which it would be written
i.e. @Component
public class MyComponent{
//class is automatically registered as a Spring bean
}

## Application Context -- is a logic which is used to implement IOC Container (IOC Container and Application Context
uses vice versa)

## What is ApplicationContext in Spring?
ApplicationContext is the central interface in Spring for accessing the Spring IoC container.
It manages the full lifecycle of beans and handles dependency injection, configuration, and resource management.

🧰 What does ApplicationContext do?
-- Loads bean definitions (from XML, Java config, or annotations)
-- Instantiates and wires beans
-- Manages bean lifecycle (singleton, prototype, etc.)
-- Provides internationalization support
-- Publishes application events
-- Loads resources (like properties files)

## We can create beans with @Component, @RestController, @Beans annotations

## @SpringBootApplication annotation is used specially on Main Class. Its include three annotations
1. @Configuration
2. @EnableAutoConfiguration
3. @ComponentScan 

1. @Configuration -- if we write @Configuration annotation on class then we can create beans within class with
   @bean annotation, which applied only for Functions.
   @Configuration is a Spring annotation that marks a class as a source of bean definitions — meaning it contains 
   @Bean methods that will be managed by the Spring container.
-- Think of it like:
   A modern replacement for old XML configuration files (applicationContext.xml).
-- Use @Configuration + @Bean when you want manual control over bean creation and wiring.
-- Use @Component for automatic component scanning of classes that don't require manual wiring logic.

-- Imagine you're writing a recipe book 🧑‍🍳.
-- Each recipe is a way to create something — like a bean (object).
@Configuration is like marking a class as a recipe book, and inside it, you define recipes (@Bean methods) that 
tell Spring how to create and manage your objects.

✅ Real-World Analogy:
You: "Spring, here’s how to make a Car. Use this recipe."
Spring: "Got it. I’ll take care of making and managing that Car."

🧪 Example:
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration  // This class contains bean definitions
public class AppConfig {

    @Bean  // This method defines a bean
    public Engine engine() {
        return new Engine();
    }

    @Bean
    public Car car() {
        return new Car(engine());  // Uses the Engine bean
    }
}
Now, Spring will:

See @Configuration
Look at @Bean methods
-- Create and manage Engine and Car objects
-- Inject the same Engine into the Car
📦 How You Use It in Your App:
public class MainApp {
public static void main(String[] args) {
ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
Car car = context.getBean(Car.class);
car.drive();
}
}

## What happens here?
-- Spring creates and wires everything for you.
-- If multiple beans need Engine, Spring gives them the same instance (singleton by default).
-- Spring manages the lifecycle, dependencies, and configuration — this is Inversion of Control (IoC) in action.

## Using new (Manual Object Creation)
public class MainApp {
public static void main(String[] args) {
Engine engine = new Engine();
Car car = new Car(engine);  // You have to wire everything yourself
car.drive();
}
}

🛠 What happens here?
-- You manually create each object.
-- You are in full control, but also responsible for managing everything (dependencies, lifecycle, singletons, etc.).
-- No help from Spring.

2. @EnableAutoConfiguration -- enable automatic configuration. Example if we want to use MongoDB database, just insert
   dependency of MongoDb in .pom file and write port number, User name and password in application property file, then 
   Springboot automatically create connection with database
-- @EnableAutoConfiguration is a core Spring Boot annotation that automatically configures your Spring application
   based on the JARs (dependencies) on the classpath.
-- When you use:
   @EnableAutoConfiguration
Spring Boot tries to:
-- Guess what you want to configure (e.g., database, web server, security, etc.)
-- Automatically set it up using sensible defaults

 For example:
-- If spring-boot-starter-web is on the classpath → auto-configures Tomcat, DispatcherServlet, and Spring MVC
-- If spring-boot-starter-data-jpa is present → configures Hibernate, DataSource, and JPA

3.  @ComponentScan -- is used to scan all the class,Interface, Method, Field name to check which has written @Component
 to add in IOC Container
-- @ComponentScan is a Spring annotation used to tell the container where to look for components (like @Component, 
   @Service, @Repository, @Controller) so they can be automatically detected and registered as beans.
-- Why It's Important
-- Spring needs to know where to search for classes to manage.
-- Without @ComponentScan, it won’t automatically detect annotated classes.
 
## @RestController annotation is also used to create Bean but with special features
 @RestController in Spring Boot?
@RestController is a convenience annotation in Spring Boot that makes a class capable of handling HTTP requests and 
 sending JSON or text responses directly — perfect for building REST APIs.

✅ It's a shortcut for:
@Controller
@ResponseBody
This means every method in a @RestController automatically returns data in the response body, not a view like a JSP 
or HTML.

## Common Annotations Used Inside @RestController
Annotation	    Purpose
@GetMapping	    Handles HTTP GET requests
@PostMapping	Handles HTTP POST requests
@RequestParam	Extracts query parameters
@PathVariable	Extracts values from the URL path
@RequestBody	Maps JSON request to Java object

## @GetMapping annotation is used for API to create end point, which will be accessed by GET command

## @Autowired annotation is used for Dependency Injection, Just @Autowired on field (Specially called Field Injection)
i.e @Autowired
   private Engine engine; means Car class depend on Engine and @autowired inserted DI into Car class. Its loosely 
   coupled
-- @Autowired is a Spring annotation used for automatic dependency injection.
-- It tells Spring: "Inject the required bean into this class automatically."

🔍 Why Use @Autowired?
Instead of creating objects manually with new, Spring will:
-- Find the matching bean in the container
-- Inject it into the class where it's needed

## What is @SpringBootApplication in Spring Boot?
@SpringBootApplication is a convenience annotation that combines three core annotations into one. It marks the main 
 class of a Spring Boot application.

-- It is equivalent to:
@Configuration
@EnableAutoConfiguration
@ComponentScan

## What Each Part Does:
Annotation	                Purpose
@Configuration	            Marks the class as a source of bean definitions
@EnableAutoConfiguration	Tells Spring Boot to auto-configure beans based on dependencies on the classpath
@ComponentScan	            Tells Spring to scan the current package and sub-packages for components, configs, etc.

🔁 Example: Simple Spring Boot App
@SpringBootApplication
public class MyApp {
public static void main(String[] args) {
SpringApplication.run(MyApp.class, args);
}
}

If you have a @Component, @Service, or @RestController in the same package (or subpackage), it will be automatically
detected and wired.

📍 Important Tip:
@SpringBootApplication performs component scanning starting from its package.
So place it in the root package of your project structure to ensure everything is scanned.

## how to customize component scanning and exclude auto-configurations using @SpringBootApplication.

🧭 1. Customizing Component Scanning

By default, @SpringBootApplication uses @ComponentScan to scan its package and subpackages.

✅ Custom base packages:
You can specify exactly which packages to scan like this:

@SpringBootApplication
@ComponentScan(basePackages = {"com.example.services", "com.example.controllers"})
public class MyApp {
public static void main(String[] args) {
SpringApplication.run(MyApp.class, args);
}
}
📌 Use case: If your @Component, @Service, or @Repository classes are in other packages not under the main class.

🚫 2. Excluding Auto-Configurations

Spring Boot’s @EnableAutoConfiguration enables a lot of features automatically based on the classpath.
Sometimes, you might want to exclude certain auto-configurations.

✅ Exclude one or more:
@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class})
public class MyApp {
public static void main(String[] args) {
SpringApplication.run(MyApp.class, args);
}
}
📌 Use case: You're using a custom database configuration or don’t want Spring Boot to configure one for you.

🧩 You can also use:
@EnableAutoConfiguration(exclude = {SecurityAutoConfiguration.class})
But since @SpringBootApplication includes @EnableAutoConfiguration, it's more common to just use the exclude 
attribute directly on @SpringBootApplication.

