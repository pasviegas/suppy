package br.org.pav.suppy.test.mock;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import br.org.pav.suppy.model.SKU;
import br.org.pav.suppy.repository.SKUs;

@Component
public class MockSKU implements InitializingBean, DisposableBean {

	@Autowired
	private SKUs skus;
	
	@Override
	public void afterPropertiesSet() throws Exception {
		
	}

	@Override
	public void destroy() throws Exception {
		// TODO Auto-generated method stub
		
	}
	
	public static SKU getSKU(){
		SKU sku = new SKU();
		sku.setName("Lux");
		sku.setDirty(true);

		return sku;
	}

}
