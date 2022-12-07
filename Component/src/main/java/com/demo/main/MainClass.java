package com.demo.main;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.demo.beans.TestBean1;
import com.demo.beans.TestBean2;
import com.demo.beans2.TestBean3;
import com.demo.beans2.TestBean4;
import com.demo.beans3.TestBean5;
import com.demo.config.BeanConfigClass;

public class MainClass {

	public static void main(String[] args) {

		AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(BeanConfigClass.class);

System.out.println("-------------------------------");
		
		TestBean1 java1 = ctx.getBean(TestBean1.class);
		System.out.printf("xml1 : %s\n", java1);
		
		TestBean2 java2 = ctx.getBean("java2", TestBean2.class);
		System.out.printf("xml2 : %s\n", java2);
		
		TestBean2 java3 = ctx.getBean("java3", TestBean2.class);
		System.out.printf("xml3 : %s\n", java3);
		
		System.out.println("-------------------------------");
		
		TestBean3 java4 = ctx.getBean(TestBean3.class);
		System.out.printf("xml4 : %s\n", java4);
		
		TestBean4 java5 = ctx.getBean("bean4", TestBean4.class);
		System.out.printf("xml5 : %s\n", java5);
		
		TestBean4 java100 = ctx.getBean("java100", TestBean4.class);
		System.out.printf("xml100 : %s\n", java100);
		
		TestBean4 java200 = ctx.getBean("java200", TestBean4.class);
		System.out.printf("xml200 : %s\n", java200);
		
		System.out.println("-------------------------------");
		
		TestBean5 java500 = ctx.getBean(TestBean5.class);
		System.out.printf("xml500 : %s\n", java500);



		ctx.close();
	}

}
