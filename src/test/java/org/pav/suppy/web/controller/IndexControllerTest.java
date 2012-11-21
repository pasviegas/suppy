package org.pav.suppy.web.controller;

import static org.springframework.test.web.server.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.server.result.MockMvcResultMatchers.forwardedUrl;
import static org.springframework.test.web.server.result.MockMvcResultMatchers.status;
import junitparams.JUnitParamsRunner;
import junitparams.Parameters;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.pav.suppy.test.configuration.TestWebConfiguration;
import org.pav.suppy.test.controller.AbstractControllerTest;
import org.pav.suppy.test.provider.controller.IndexControllerProvider;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.ui.ModelMap;

@RunWith(JUnitParamsRunner.class)
@ContextConfiguration(classes = { TestWebConfiguration.class })
@WebAppConfiguration
public class IndexControllerTest extends AbstractControllerTest implements IndexController {

	@Test
	@Override
	@Parameters(source=IndexControllerProvider.HandleProvider.class)
	public String handle(ModelMap modelMap) throws Exception {
		mockMvc.perform(get("/"))
			.andExpect(status().isOk())
			.andExpect(forwardedUrl("/WEB-INF/jsp/index.jsp"));
		
		return null;
	}

	
}