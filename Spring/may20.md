## sPEl - Spring Expression language 
// it allow to write logic that java don't allow, we can apply logic on flatFile #{'..'.}
i.e. #{'${movieDao}'.subString(2)}

## JDBC
jdbc template
database
h2 database - in memory database (not production grade db, very small db)
H2 exit in Active Jvm memory, when we close the app, Database wipe out immediately
spring data jdbc, h2, web dependency

how to create db connection?
What is h2 db ?

DataSource is responsible for all the connection.It helps to connect database

Spring boot : Version resolver, AutoConfiguration, Embedded Web Server(TomCat)

We first create bean of datasource for db connection.

## Search jdbc connection string for particular database
for h2 - 

public DataSource dataSource(){
DataSource dataSource = dataSourceBuilder
         .create
         .url("jdbc:h2:mem:appDb)(name of Database created in side H2, automatically configured we directly used it)
         .username("sa")
         .password("sa123")
         .build"
return dataSource;
}

## for enableAutoConfiguration -- flatFile
Enabled h2 in application.properties -> spring.h2.console.enabled= true
spring.h2.console.path=/h2 --> we can set path of h2 database to access through localHost
spring.dataSource.url=jdbc:h2:mem:appDb;
spring.dataSource.username=sa
spring.dataSource.password=sa123

## dataSourceBuilder create bean for database

## For external database we need driver

HikariPool ? keep pool of database Connection, 
we are creating bean of database just for Hikari to keep pool of database
It keeps connection ready to use with the help of Db bean

How many connection it keeps alive at one time ?

Interview purpose Hikari, TomCat ?

for DDL Command create file under Resource i.e scema.sql
All Command should be in Capital (search snakeStyle)
Data Query should be in data.sql file

When we sync data from database all snake style(Capital in h2 database) gets converts into camelCases(in java)

for SQl Script create an interface QueryConstants 

## Always focus naming convention when work with Java (Camel Casing) v/s Database(Capital with underScore)

Custom rowMapper used when database written in some other language or we want to customize
either use inbuild row mapper (BeanPropertyRowMapper)