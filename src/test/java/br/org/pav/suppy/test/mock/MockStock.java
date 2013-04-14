package br.org.pav.suppy.test.mock;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import br.org.pav.suppy.model.SKU;
import br.org.pav.suppy.model.Stock;
import br.org.pav.suppy.repository.Stocks;

@Component
public class MockStock implements InitializingBean, DisposableBean {

	@Autowired
	private Stocks stocks;
	
	@Override
	public void afterPropertiesSet() throws Exception {
		
		
		stocks.store(getStock1());
	}

	@Override
	public void destroy() throws Exception {
		// TODO Auto-generated method stub
		
	}

	public static Stock getStock1(){
		Stock stock = new Stock();
		stock.setId("1");
		
		List<SKU> skus = new ArrayList<SKU>(); 
		SKU sku = new SKU();
		sku.setName("Dove");
		skus.add(sku);
		
		stock.setSKUs(skus);

		return stock;
	}
	
	public static Stock getStock2(){
		Stock stock = new Stock();
		stock.setId("2");
		
		List<SKU> skus = new ArrayList<SKU>(); 
		SKU sku = new SKU();
		sku.setName("Lux");
		skus.add(sku);
		
		stock.setSKUs(skus);

		return stock;
	}

}
