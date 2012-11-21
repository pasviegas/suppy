package org.pav.suppy.test.provider.service.operation;

import org.pav.suppy.entity.basic.impl.User;
import org.pav.suppy.entity.operation.impl.UserSpecification;
import org.pav.suppy.test.provider.TestProvider;

public interface UserSpecificationServiceProvider extends TestProvider {

	public class AddSpecificationProvider{
		public static Object[][] provide() {
			return new Object[][] { {new User(),new UserSpecification()}};
		}		
	}

}
