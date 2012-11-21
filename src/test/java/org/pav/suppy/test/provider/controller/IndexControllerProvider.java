package org.pav.suppy.test.provider.controller;

import org.pav.suppy.test.provider.TestProvider;
import org.springframework.ui.ModelMap;

public interface IndexControllerProvider extends TestProvider {

	public class HandleProvider {
		public static Object[] provide() {
			return new Object[] { new ModelMap("name", "pedro"),
					new ModelMap("name", null) };
		}
	}

}
