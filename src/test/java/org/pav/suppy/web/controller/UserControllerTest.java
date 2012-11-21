package org.pav.suppy.web.controller;

import junitparams.JUnitParamsRunner;
import junitparams.Parameters;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.pav.suppy.entity.basic.impl.User;
import org.pav.suppy.test.configuration.TestWebConfiguration;
import org.pav.suppy.test.controller.AbstractControllerTest;
import org.pav.suppy.test.provider.controller.UserControllerProvider;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.ui.ModelMap;

@RunWith(JUnitParamsRunner.class)
@ContextConfiguration(classes = { TestWebConfiguration.class })
@WebAppConfiguration
public class UserControllerTest extends AbstractControllerTest implements UserController {

	@Test
	@Override
	@Parameters(source = UserControllerProvider.HandleProvider.class)
	public String handle(ModelMap modelMap) throws Exception {
		
		return null;
	}

	@Test
	@Override
	@Parameters(source = UserControllerProvider.StoreProvider.class)
	public User storeUser(String entity, ModelMap modelMap) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	@Test
	@Override
	@Parameters(source = UserControllerProvider.FindProvider.class)
	public User findUser(Long id, ModelMap modelMap) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	@Test
	@Override
	@Parameters(source = UserControllerProvider.UpdateProvider.class)
	public User updateUser(Long id, ModelMap modelMap) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	@Test
	@Override
	@Parameters(source = UserControllerProvider.DeactivateProvider.class)
	public User deactivateUser(Long id, ModelMap modelMap) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	@Test
	@Override
	@Parameters(source = UserControllerProvider.ActivateProvider.class)
	public User activateUser(Long id, ModelMap modelMap) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

}