package springsec.com.demo1.service;

import java.util.List;

import springsec.com.demo1.entity.Product;

public interface ProductServices {
	void delete(Long id);

	Product get(Long id);

	Product save(Product product);

	List<Product> listAll();
}
