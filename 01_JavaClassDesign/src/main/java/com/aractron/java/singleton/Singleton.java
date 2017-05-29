package com.aractron.java.singleton;

class Singleton {

	private static volatile Singleton instance ;
	private Singleton() {
	}

	public synchronized static Singleton getInstance() {
		if (instance==null) {
			instance=new Singleton();
			
		}
		return instance;

	}
}