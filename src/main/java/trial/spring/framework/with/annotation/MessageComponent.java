package trial.spring.framework.with.annotation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import trial.spring.framework.bean.Message;

@Component
public class MessageComponent {

	@Autowired
	private Message bean;

	public void showMessage() {
		System.out.println("Printed by MessageComponent: " + bean.toString());
	}

}
