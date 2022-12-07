package com.demo.main;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.demo.beans.TestBean;

public class MainClass {

	public static void main(String[] args) {
		// beans.xml파일을 로딩 (필요한 객체들을 자동생성)
		ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("com/demo/config/beans.xml");

		// id가 없으므로 클래스의 타입만 가지고 객체를 가져옴
		TestBean t0 = ctx.getBean("test0",TestBean.class);
		System.out.printf("t0 : %s\n", t0);
		// id가 tes1인 bean 객체의 주소값을 받아온다.
		TestBean t1 = ctx.getBean("test1",TestBean.class);
		System.out.printf("t1 : %s\n", t1);
		// id가 있을때 id로 가져옴
		TestBean t2 = ctx.getBean("test1",TestBean.class);
		System.out.printf("t2 : %s\n", t2);
		// lazy-init은 객체를 가져올때 생성한다
		TestBean t3 = ctx.getBean("test2",TestBean.class);
		System.out.printf("t3 : %s\n", t3);
		
		// scope=prototype은 가져올때마다 생성
		TestBean t4 = ctx.getBean("test3",TestBean.class);
		System.out.printf("t4 : %s\n", t4);
		
		TestBean t5 = ctx.getBean("test3",TestBean.class);
		System.out.printf("t5 : %s\n", t5);
		
		ctx.close();

	}

}
