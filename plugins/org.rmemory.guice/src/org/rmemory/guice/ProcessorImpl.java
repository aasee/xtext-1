package org.rmemory.guice;

import com.google.inject.Inject;

public class ProcessorImpl implements Processor {
	@Inject private Logger logger;

	@Override
	public void process(Object o) {
		logger.log("processing");
		System.out.println("processing " + o + "...");
	}
}
