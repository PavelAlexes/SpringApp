package Test;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestSpring {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
                "applicationContext.xml");

        Human human = context.getBean("pavel", Human.class);

        System.out.println(human);

        context.close();
    }


}
