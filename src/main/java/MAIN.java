
import org.springframework.context.ApplicationContext;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
public class MAIN {
	static AbstractApplicationContext context;
	public static void main(String[] args) {
		context = new ClassPathXmlApplicationContext("bean.xml");
		context.registerShutdownHook();
		circle cr = (circle)context.getBean("circle");
		cr.draw();
	}
}
