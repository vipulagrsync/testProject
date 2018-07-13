package com.test.vipul.springboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class SpringBootWebApplication {

	
	public static void main(String[] args) throws Exception {
		ConfigurableApplicationContext ctx = 	SpringApplication.run(SpringBootWebApplication.class, args);
	//	ctx.close();
	}
	
	
	/*@Bean
	public GracefulShutdown gracefulShutdown() {
	    return new GracefulShutdown();
	}*/
	/*@Bean
	public ConfigurableServletWebServerFactory webServerFactory(final GracefulShutdown gracefulShutdown) {
	    TomcatServletWebServerFactory factory = new TomcatServletWebServerFactory();
	    factory.addConnectorCustomizers(gracefulShutdown);
	    return factory;
	}*/
}
