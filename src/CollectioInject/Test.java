package org.sarindy.CollectioInject;


import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		ApplicationContext context= new ClassPathXmlApplicationContext("org/sarindy/CollectioInject/springConfigCollection.xml");
		Restaurant restaurantObj = (Restaurant) context.getBean("restaurantBean");
		restaurantObj.waiterList();	
		
		//TODO test adobject to list

	}

}
