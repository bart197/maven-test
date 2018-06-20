package com.oreilly.jenkins;

public class HelloWorldMaven {
    private HelloWorldMaven() {
    }

    public static void main(String[] args) {
	System.out.println("Hello from a Maven project.");
    }

    private String bug() {
	String s = null;
	return s.toUpperCase();
    }
}
