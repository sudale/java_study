package com.demo.mapper;

import org.apache.ibatis.annotations.Insert;

import beans.DataBean;

public interface MapperInterface {
	@Insert("insert into spring_mvc_table values(#{data1}, #{data2}, #{data3})")
	void insert_data(DataBean dataBean);
}
