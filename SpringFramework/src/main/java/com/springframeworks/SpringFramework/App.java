package com.springframeworks.SpringFramework;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App 
{
    public static void main( String[] args )
    {
    	ApplicationContext factory = new ClassPathXmlApplicationContext("example.xml");
    	
    	Alien obj1 = (Alien)factory.getBean("alien");
    	obj1.code();
    	
    	System.out.println(obj1.getAge());
    	 
       
    }
}
