package trial.spring.framework.with.annotation;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import trial.spring.framework.bean.Message;

@Configuration
@ComponentScan
public class BeanConfigurator {

	@Bean
	public Message getMessage() {
		Message bean = new Message();
		bean.setMessage("Created by Config Class.");
		return bean;
	}
}
