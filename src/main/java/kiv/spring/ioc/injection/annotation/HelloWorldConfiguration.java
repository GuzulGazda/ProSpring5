package kiv.spring.ioc.injection.annotation;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@ComponentScan(basePackages = {"kiv.spring.ioc"})
@Configuration
public class HelloWorldConfiguration {

}
