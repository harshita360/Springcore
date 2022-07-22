package com.springcore.lifecycle;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class Colddrink implements InitializingBean, DisposableBean
{
     private int price;

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "Colddrink [price=" + price + "]";
	}

	public Colddrink(int price) {
		super();
		this.price = price;
	}

	public void afterPropertiesSet() throws Exception {
		// TODO Auto-generated method stub
		System.out.println("this is init step");
		
	}

	public void destroy() throws Exception {
		// TODO Auto-generated method stub
		System.out.println("this is destroy step");
		
	}

	public Colddrink() {
		super();
		// TODO Auto-generated constructor stub
	}
     
}
