package com.github.zhanhb.joda.test;

import java.io.IOException;
import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.context.web.SpringBootServletInitializer;

@Slf4j
@SpringBootApplication
public class Application extends SpringBootServletInitializer {

    public static void main(String[] args) throws IOException {
        SpringApplication.run(Application.class, args);
    }

    @Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
        return application.showBanner(false)
                .addCommandLineProperties(false)
                .logStartupInfo(true)
                .sources(Application.class);
    }

}
