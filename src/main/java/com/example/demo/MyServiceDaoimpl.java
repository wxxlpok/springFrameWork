package com.example.demo;

import org.springframework.stereotype.Component;

@Component(value="myservicedao")
public class MyServiceDaoimpl implements MyServiceDao {
	public void save() {
		System.out.println("保存数据成功！");
	}
	

}
