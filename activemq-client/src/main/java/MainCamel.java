import org.apache.camel.CamelContext;
import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

/**
 * 
 */

/**
 * @author mukundha
 *
 */
public class MainCamel {
	public static void main(String[] args) throws BeansException, InterruptedException {
		// ApplicationContext appContext = new
		// ClassPathXmlApplicationContext("applicationContext.xml");
		// CamelContext camelContext = appContext.getBean(CamelContext.class);

		///ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		//CamelContext camelContext = context.getBean(CamelContext.class);
		
		GenericXmlApplicationContext gc = new GenericXmlApplicationContext();
		gc.setValidating(false);
		gc.load("applicationContext.xml");
		gc.refresh();
		Thread.sleep(60000);
		//gc.close();
		try {
			//camelContext.start();
			// camelContext.start();

		} catch (Exception e) {
			e.printStackTrace();
		}

	}
}
