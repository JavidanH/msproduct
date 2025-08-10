package az.company.javidan.msproduct.dao.repository;

import az.company.javidan.msproduct.dao.entity.ProductEntity;
import org.springframework.data.repository.CrudRepository;

public interface ProductRepository extends CrudRepository<ProductEntity,Long> {
}
