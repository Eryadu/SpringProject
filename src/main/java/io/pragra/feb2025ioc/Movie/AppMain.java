package io.pragra.feb2025ioc.Movie;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

public class AppMain {
    public static void main(String[] args) {
        //ApplicationContext context = new ClassPathXmlApplicationContext("movieBeanConst.xml"); // With Constructor

        // With Setter method, we need to comment @allArgConstructor
        ApplicationContext context = new ClassPathXmlApplicationContext("movieBeanSetter.xml");

       // ApplicationContext context1 = new FileSystemXmlApplicationContext("/Users/yadavgupta/Downloads/feb2025ioc/target/classes/movieBeanSetter.xml");
        Movie movie =context.getBean("movie3",Movie.class); // Just pass bean Id if more than one beans of a class
        System.out.println(movie);

       // Group group =context.getBean("group1",Group.class); // Just pass bean Id if more than one beans of a class

        // Bean for Map with Value as other bean
      // MyBean myBean =context.getBean("myBean",MyBean.class);
        //System.out.println(myBean);

    }
}
