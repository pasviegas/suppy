package br.org.pav.suppy.repository;

import br.org.pav.suppy.model.SKU;

import java.util.List;

public interface SKUs {

    List<SKU> findAll();

    SKU findOne(String id);

}