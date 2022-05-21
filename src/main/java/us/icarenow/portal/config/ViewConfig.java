package us.icarenow.portal.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class ViewConfig implements WebMvcConfigurer{
    @Override
    public void addViewControllers(ViewControllerRegistry registry){
        registry.addViewController("/").setViewName("welcome.html");
    }
}
