package com.mp.reservations.config;

import org.apache.log4j.Logger;
import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

public class ReservationWebAppInitializer extends AbstractAnnotationConfigDispatcherServletInitializer {

	static final Logger LOGGER = Logger.getLogger(ReservationWebAppInitializer.class);
	@Override
	protected Class<?>[] getRootConfigClasses() {
		LOGGER.info("Inside getRootConfigClasses() method");
		return new Class<?>[] { RootConfig.class };
	}

	@Override
	protected Class<?>[] getServletConfigClasses() {
		LOGGER.info("Inside getServletConfigClasses() method");
		return new Class<?>[] { WebConfig.class };
	}

	@Override
	protected String[] getServletMappings() {
		LOGGER.info("Inside getServletMappings() method");
		return new String[] { "/" };
	}

}
