package test;

import org.springframework.aop.framework.ProxyFactoryBean;

import business.Bank;
import services.LogBeforeService;

public class Client {

	public static void main(String[] args) {
		
		//Create target object
		Bank b = new Bank();
		
		//create advice
		LogBeforeService lbs = new LogBeforeService();
		
		//add target+advice to proxy
		ProxyFactoryBean pfb = new ProxyFactoryBean();	
		pfb.setTarget(b);
		pfb.addAdvice(lbs);
		//we go with below method in case of xml approach
		//pfb.setInterceptorNames(new String[] {"lbs"});
		
		//get generated proxy object
		Bank bankProxy = (Bank)pfb.getObject();
		int amount = bankProxy.deposit(5000, "sbi123");
		System.out.println(amount);
	}

}
