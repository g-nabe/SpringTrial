package trial.spring.framework.with.xml;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("bean.xml");
		Message message = context.getBean("message", Message.class);
		((AbstractApplicationContext) context).close();

		System.out.println(message.getMessage());
	}

}
