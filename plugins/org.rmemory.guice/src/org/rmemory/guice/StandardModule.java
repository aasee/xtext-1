package org.rmemory.guice;

import com.google.inject.AbstractModule;

public class StandardModule extends AbstractModule {
	@Override
	protected void configure() {
		bind(Processor.class).to(ProcessorImpl.class);
	}
}
