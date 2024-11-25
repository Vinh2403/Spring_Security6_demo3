package springsec.com.demo1.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import springsec.com.demo1.entity.Product;

public interface ProductRepository extends  JpaRepository<Product, Long> {

}
