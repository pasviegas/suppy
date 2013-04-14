package br.org.pav.suppy.repository;

import java.util.List;

import br.org.pav.suppy.model.SKU;

public interface SKUs {

	List<SKU> findAll();

	SKU findOne(String id);

}