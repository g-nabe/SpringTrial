package trial.spring.framework.without;

import trial.spring.framework.bean.Message;

/**
 * Hello world!
 *
 */
public class App {

	public static void main(String[] args) {
		Message message = new Message();
		message.setMessage("hello spring!");
		System.out.println(message.getMessage());
	}
}
