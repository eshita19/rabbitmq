package com.esh.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

@Configuration
@ComponentScan({"com.esh", "com.esh.config"})
@Import({MessagingConfig.class})
public class AppConfig {

}
