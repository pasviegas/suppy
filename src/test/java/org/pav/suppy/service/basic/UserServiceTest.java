package org.pav.suppy.service.basic;

import junitparams.JUnitParamsRunner;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.pav.suppy.test.configuration.TestServiceConfiguration;
import org.pav.suppy.test.service.AbstractServiceTest;
import org.springframework.test.context.ContextConfiguration;

@RunWith(JUnitParamsRunner.class)
@ContextConfiguration(classes = { TestServiceConfiguration.class })
public class UserServiceTest extends AbstractServiceTest implements UserService {

	@Test
	@Override
	public void store() {
		// TODO Auto-generated method stub
		
	}

}
