package br.org.pav.suppy.test.repository;

import br.org.pav.suppy.model.Stock;
import br.org.pav.suppy.repository.Stocks;
import com.google.common.base.Predicate;
import com.google.common.collect.Iterables;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class InMemoryStocks implements Stocks {

    private final List<Stock> stocks = new ArrayList<Stock>();

    public Stock findOne(String id) {
        for (Stock stock : stocks) {
            if (stock.getId().equals(id)) {
                return stock;
            }
        }
        return null;
    }

    @Override
    public void store(Stock stock) {
        stocks.add(stock);
    }

    @Override
    public void remove(String id) {
        Iterables.removeIf(stocks, hasIdOf(id));
    }

    private Predicate<Stock> hasIdOf(final String id) {
        return new Predicate<Stock>() {
            @Override
            public boolean apply(Stock stock) {
                return stock.getId().equals(id);
            }
        };
    }
}