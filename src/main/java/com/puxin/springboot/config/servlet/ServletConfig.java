package com.puxin.springboot.config.servlet;

import com.puxin.springboot.servlet.MyServlet;
import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.servlet.Servlet;
import java.util.Arrays;

@Configuration
public class ServletConfig {
    //注册servlet
    @Bean
    public ServletRegistrationBean myServlet(){
        ServletRegistrationBean<Servlet> servletServletRegistrationBean = new ServletRegistrationBean<>();
        servletServletRegistrationBean.setServlet(new MyServlet());
        servletServletRegistrationBean.setUrlMappings(Arrays.asList("/hello"));
        return servletServletRegistrationBean;

    }

}
