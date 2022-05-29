package com.example.twitter;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class TwitterApplication {

	public static void main(String[] args) {
		System.out.println("Hellow World");
		System.out.println("Hellow World2");
		SpringApplication.run(TwitterApplication.class, args);
	}

	public int add(int a,int b){

		
		return a+b;
	}

	public int sub(int a,int b){
		return a-b;
	}

	public int mul(int a,int b){
		return a*b;
	}

	public int div(int a,int b){
		return a/b;
	}


}
