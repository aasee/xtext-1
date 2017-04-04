package org.rmemory.guice;

import com.google.inject.Guice;
import com.google.inject.Injector;

public class TestProgram {

	public static void main(String[] args) {
		Injector injector = Guice.createInjector(new StandardModule());
		Service service = injector.getInstance(Service.class);
		service.execute("First command");
	}

}
