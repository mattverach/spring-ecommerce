package com.curso.ecommerce.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.curso.ecommerce.model.Producto;

@Repository
public interface IProductoRepository extends JpaRepository<Producto, Integer> {

}
