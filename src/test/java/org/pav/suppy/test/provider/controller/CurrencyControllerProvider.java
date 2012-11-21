package org.pav.suppy.test.provider.controller;

import org.pav.suppy.test.provider.TestProvider;
import org.springframework.ui.ModelMap;

public interface CurrencyControllerProvider extends TestProvider {

	public class HandleProvider {
		public static Object[] provide() {
			return new Object[] { new ModelMap("name", "pedro"),
					new ModelMap("name", null) };
		}
	}

	public class StoreProvider {
		public static Object[][] provide() {
			return new Object[][] { { "Store", new ModelMap("name", "pedro") } };
		}
	}

	public class FindProvider {
		public static Object[] provide() {
			return new Object[][] { { 1l, new ModelMap("name", "pedro") } };
		}
	}

	public class UpdateProvider {
		public static Object[] provide() {
			return new Object[][] { { 1l, new ModelMap("name", "pedro") } };
		}
	}

	public class ActivateProvider {
		public static Object[] provide() {
			return new Object[][] { { 1l, new ModelMap("name", "pedro") } };
		}
	}

	public class DeactivateProvider {
		public static Object[] provide() {
			return new Object[][] { { 1l, new ModelMap("name", "pedro") } };
		}
	}

}
