import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import javax.sound.midi.Soundbank;

public class App {
    public static void main(String[] args) {
        ApplicationContext applicationContext =
                new AnnotationConfigApplicationContext(AppConfig.class);
        HelloWorld bean =
                (HelloWorld) applicationContext.getBean("helloworld");
        HelloWorld bean1 =
                (HelloWorld) applicationContext.getBean("helloworld");

        Cat catBean = (Cat) applicationContext.getBean("cat");
        Cat catBean1 = (Cat) applicationContext.getBean("cat");
        System.out.println(bean.getMessage());
        System.out.println(bean1.getMessage() + "\n");
        System.out.println(catBean1);
        System.out.println(catBean + "\n");
        System.out.println(bean == bean1);
        System.out.println(catBean == catBean1);
    }
}