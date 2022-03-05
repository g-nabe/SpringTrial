package trial.spring.framework.with.annotation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;

/**
 * Hello world!
 *
 */
public class AppCompo {

	public static void main(String[] args) {
		ApplicationContext context = new AnnotationConfigApplicationContext(BeanConfigurator.class);
		MessageComponent messageComponent = context.getBean(MessageComponent.class);
		((AbstractApplicationContext) context).close();

		messageComponent.showMessage();
	}

}
