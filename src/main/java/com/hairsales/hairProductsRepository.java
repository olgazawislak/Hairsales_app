package com.hairsales;

import java.util.UUID;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface hairProductsRepository extends CrudRepository<Product, UUID> {
}
