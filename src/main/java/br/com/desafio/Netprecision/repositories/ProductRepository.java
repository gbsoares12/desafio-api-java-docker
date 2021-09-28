/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.desafio.Netprecision.repositories;

import br.com.desafio.Netprecision.entities.Product;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 *
 * @author gabriel
 */
public interface ProductRepository extends JpaRepository<Product, Long> {

}
