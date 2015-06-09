package com.vquochuy.observer3;

import java.util.Observable;
import java.util.Observer;


public class Client implements Observer{

	public Client() {
	}

	@Override
	public void update(Observable obs, Object obj) {
		System.out
				.println("The Client says a " + ((Database) obs).getOperation()
						+ " operation was performed on "
						+ ((Database) obs).getRecord());
	}

}
