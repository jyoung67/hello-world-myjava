package org.youngjb.docker;

public class HelloWorldPing {
	
	public static void main(String args[]) throws Exception{
		for(int i = 0 ; i < 1000; i++){
			System.out.println("Hello World Ping DOCKER" + i );
			Thread.sleep(1000);
		}
	}
}

