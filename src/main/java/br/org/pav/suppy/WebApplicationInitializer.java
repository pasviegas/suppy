package br.org.pav.suppy;

import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

import br.org.pav.suppy.configuration.ControllerConfig;
import br.org.pav.suppy.configuration.MongoConfig;
import br.org.pav.suppy.configuration.MvcConfig;
import br.org.pav.suppy.configuration.PropertySourceConfig;
import br.org.pav.suppy.configuration.RepositoryConfig;
import br.org.pav.suppy.configuration.ServiceConfig;

public class WebApplicationInitializer extends AbstractAnnotationConfigDispatcherServletInitializer {

	@Override
	protected Class<?>[] getRootConfigClasses() {
		return null;
	}

	@Override
	protected Class<?>[] getServletConfigClasses() {
		return new Class<?>[] { 
				MvcConfig.class, 
				ControllerConfig.class, 
				PropertySourceConfig.class, 
				MongoConfig.class, 
				RepositoryConfig.class, 
				ServiceConfig.class 
		};
	}

	@Override
	protected String[] getServletMappings() {
		return new String[] { "/" };
	}
}