package br.org.pav.suppy.test.repository;

import br.org.pav.suppy.model.SKU;
import br.org.pav.suppy.repository.SKUs;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class InMemorySKUs implements SKUs {

    private final List<SKU> skus = new ArrayList<SKU>();

    public List<SKU> findAll() {
        return skus;
    }

    public SKU findOne(String id) {

        for (SKU sku : skus) {
            if (sku.getId().equals(id)) {
                return sku;
            }
        }

        return null;
    }
}