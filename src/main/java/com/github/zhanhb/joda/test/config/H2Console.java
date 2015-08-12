package com.github.zhanhb.joda.test.config;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.context.embedded.ServletRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Controller;

@Slf4j
@Controller
public class H2Console {

    public static final String CONSOLE_URL_PREFIX = "/console/";

    @Bean(name = "h2console")
    public ServletRegistrationBean console() {
        log.debug("Initialize H2 console");
        ServletRegistrationBean bean = new ServletRegistrationBean(new org.h2.server.web.WebServlet(), CONSOLE_URL_PREFIX + "*");
        // don't load properties from file.
        bean.addInitParameter("-properties", "null");
        return bean;
    }

}
