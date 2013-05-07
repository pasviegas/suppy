package br.org.pav.suppy;

import br.org.pav.suppy.configuration.*;
import br.org.pav.suppy.configuration.ControllerConfig;
import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

public class WebApplicationInitializer extends AbstractAnnotationConfigDispatcherServletInitializer {

    @Override
    protected Class<?>[] getRootConfigClasses() {
        return null;
    }

    @Override
    protected Class<?>[] getServletConfigClasses() {
        return new Class<?>[]{
                MvcConfig.class,
                ControllerConfig.class,
                PropertySourceConfig.class,
                MongoConfig.class,
                RepositoryConfig.class,
                ServiceConfig.class,
                MetricsConfig.class
        };
    }

    @Override
    protected String[] getServletMappings() {
        return new String[]{"/"};
    }
}