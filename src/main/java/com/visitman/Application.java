package com.visitman;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.orm.jpa.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.scheduling.annotation.EnableScheduling;

/**
 * Hello world!
 *
 */
@EnableScheduling
@EnableAutoConfiguration
@ComponentScan("com.visitman")
@EntityScan("com.visitman.entity")
@EnableJpaRepositories("com.visitman.repository")
public class Application 
{
	 public static void main(String[] args) {
	     SpringApplication.run(Application.class, args);
	 }
}
