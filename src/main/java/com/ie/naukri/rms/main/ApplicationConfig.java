package com.ie.naukri.rms.main;

import com.ie.naukri.rms.controllers.DemoController;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.config.ServiceLocatorFactoryBean;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.AutoConfigureOrder;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Primary;
import org.springframework.core.annotation.Order;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;
import org.springframework.web.client.RestTemplate;

import javax.inject.Inject;
import javax.sql.DataSource;
import java.util.Properties;

/**
 * @author karan
 */

@SpringBootApplication
@EnableAutoConfiguration(exclude = { DataSourceAutoConfiguration.class})
@EnableConfigurationProperties
@ComponentScan("com.ie.naukri.rms" )
// Disable Spring default datasource configuration to use Naukri one
public class ApplicationConfig {

	@Bean
	public RestTemplate restTemplate() {

		return new RestTemplate();
	}

    public static void main(final String[] args) {
		SpringApplication.run(ApplicationConfig.class, args);
	}



}