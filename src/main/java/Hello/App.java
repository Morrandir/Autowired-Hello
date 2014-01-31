package Hello;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


/**
 * Created by 曲波 on 14-1-31.
 */
public class App {

    public static void main(String[] args) {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring-config.xml");

        TestData td = applicationContext.getBean(Hello.TestData.class);

        System.out.println(td.GetDescription());
    }
}
