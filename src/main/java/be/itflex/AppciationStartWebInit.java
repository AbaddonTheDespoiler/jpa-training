package be.itflex;

import be.itflex.config.AppConfig;
import be.itflex.service.StudentService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextInitializer;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Created by abaddon on 2/23/16.
 */
public class AppciationStartWebInit {

    public static void main(String [] args){
        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(AppConfig.class);
        final StudentService studentService = applicationContext.getBean(StudentService.class);
        System.out.print(studentService.getStudents());

//        logger.info("Spring context initialized.");

//        Message message = (Message) applicationContext.getBean("message");
    }
}
