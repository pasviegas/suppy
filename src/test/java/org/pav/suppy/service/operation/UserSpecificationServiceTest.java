package org.pav.suppy.service.operation;

import junitparams.JUnitParamsRunner;
import junitparams.Parameters;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.pav.suppy.entity.basic.impl.User;
import org.pav.suppy.entity.operation.impl.UserSpecification;
import org.pav.suppy.test.configuration.TestServiceConfiguration;
import org.pav.suppy.test.provider.service.operation.UserSpecificationServiceProvider;
import org.pav.suppy.test.service.AbstractServiceTest;
import org.springframework.test.context.ContextConfiguration;

@RunWith(JUnitParamsRunner.class)
@ContextConfiguration(classes = { TestServiceConfiguration.class })
public class UserSpecificationServiceTest extends AbstractServiceTest implements UserSpecificationService {

	@Test
	@Override
	@Parameters(source=UserSpecificationServiceProvider.AddSpecificationProvider.class)
	public void addSpecification(User user, UserSpecification us) {
		// TODO Auto-generated method stub
		
	}

}
