package io.pragra.feb2025ioc;

import io.pragra.feb2025ioc.BeanScope.BeanTester;
import io.pragra.feb2025ioc.H2Db.EmployeeService;
import io.pragra.feb2025ioc.H2Db.Practice.Student;
import io.pragra.feb2025ioc.H2Db.Practice.StudentDao;
import io.pragra.feb2025ioc.H2Db.Practice.StudentDaoImpl;
import io.pragra.feb2025ioc.H2Db.Practice.StudentService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;

@SpringBootApplication
@ComponentScan (basePackages = {"io.pragra.feb2025ioc", "Engine"}) // test how to scan from other packages as well for beans
public class Feb2025iocApplication   {

	/*@Autowired
	private MyClassTest myBeanTest;*/

	/*@Autowired // this will work with commandLineRunner interface
	private NotificationService notificationService;
*/
	/*@Override
	public void run(String... args) throws Exception {
		User user = new User("Alice");
		System.out.println("Creating User: " + user.getName());
		notificationService.notify("Welcome, " + user.getName() + "!");
	}*/


	public static void main(String[] args) {

		/*ConfigurableApplicationContext context = SpringApplication.run(Feb2025iocApplication.class, args);
/*--------------------------------------------------------------------------------------------------------------------*/
		// Fetching Employee from DB
		/*EmployeeService employeeService = context.getBean(EmployeeService.class);
		employeeService.displayEmployees();

		StudentService studentService = context.getBean(StudentService.class);
		studentService.displayAllStudents();*/

		// xml based implementation of database
		ApplicationContext context1 = new ClassPathXmlApplicationContext("student.xml");
		StudentService studentService = context1.getBean(StudentService.class);
		studentService.displayAllStudents();

/*--------------------------------------------------------------------------------------------------------------------*/
		/*ApplicationContext context = new AnnotationConfigApplicationContext(MainClass.class);
		Car car = context.getBean(Car.class);
		car.drive();*/

		/*MyClassTest myBeanTest = context.getBean(MyClassTest.class);
		myBeanTest.display();*/


		//NotificationService services = context.getBean(NotificationService.class);
		// AutoWiring Spring boot Package
		/*NotificationService notificationService = context.getBean(NotificationService.class);
		User user = new User("Alice");
		notificationService.notify("Welcome , " + user.getName());*/

		/*//BeanScope Package
		BeanTester beanTester = context.getBean(BeanTester.class);
		beanTester.testScope();
		//context.close();*/

	}

}
