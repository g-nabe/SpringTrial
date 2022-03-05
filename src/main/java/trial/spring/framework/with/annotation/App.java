package trial.spring.framework.with.annotation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;

import trial.spring.framework.bean.Message;

/**
 * Hello world!
 *
 */
public class App {

	public static void main(String[] args) {
		ApplicationContext context = new AnnotationConfigApplicationContext(BeanConfigurator.class);
		Message message = context.getBean(Message.class);
		((AbstractApplicationContext) context).close();

		System.out.println(message.getMessage());
	}

}
