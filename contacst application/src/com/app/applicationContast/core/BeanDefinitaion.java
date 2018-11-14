package com.app.applicationContast.core;

public interface BeanDefinitaion {
	public void initBean();
	public void initBean(Class<?> clazz);
	public void initBean(String path);
	public String getBeanNames(Class<?> clazz);
		
	
}
