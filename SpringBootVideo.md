https://www.youtube.com/watch?v=d4dcV7Kt3SI&list=PLA3GkZPtsafacdBLdd3p1DyRd5FGfr3Ue&index=4

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

## How to run .jar file
create package with mvn package
then check target\ (.jar created in target folder)
to run jar file cmd is java -jar jarFileName
