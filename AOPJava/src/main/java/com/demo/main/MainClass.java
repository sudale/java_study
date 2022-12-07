package com.demo.main;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.demo.beans.TestBean1;
import com.demo.config.BeanConfigClass;

public class MainClass {

	public static void main(String[] args) {

		System.out.println("========================================");
		// 자바 빈 설정
		AnnotationConfigApplicationContext ctx2 = new AnnotationConfigApplicationContext(BeanConfigClass.class);

		TestBean1 java1 = ctx2.getBean(TestBean1.class);

		java1.method1();

		ctx2.close();

	}

}
