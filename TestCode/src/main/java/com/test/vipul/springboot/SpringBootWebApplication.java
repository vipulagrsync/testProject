package com.test.vipul.springboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class SpringBootWebApplication {

	
	public static void main(String[] args) throws Exception {
		SpringApplication.run(SpringBootWebApplication.class, args);
	}
	@Bean
	public GracefulShutdown gracefulShutdown() {
	    return new GracefulShutdown();
	}
	/*@Bean
	public ConfigurableServletWebServerFactory webServerFactory(final GracefulShutdown gracefulShutdown) {
	    TomcatServletWebServerFactory factory = new TomcatServletWebServerFactory();
	    factory.addConnectorCustomizers(gracefulShutdown);
	    return factory;
	}*/
}
