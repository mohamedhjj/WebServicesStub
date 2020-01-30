package com.mkyong.client;

import com.mkyong.ws.HelloWorld;
import com.mkyong.ws.HelloWorldImplService;

public class MainClient {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HelloWorldImplService implService=new HelloWorldImplService();
		HelloWorld service= implService.getHelloWorldImplPort();
		System.out.println(service.getHelloWorldAsString("m hajaiej"));	

	}

}
