package springsec.com.demo1.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import springsec.com.demo1.entity.Product;
import springsec.com.demo1.repository.ProductRepository;
import springsec.com.demo1.service.ProductServices;

public class ProductServiceImpl implements ProductServices{

	@Autowired
	private ProductRepository repo;
	
	public ProductServiceImpl(ProductRepository repo) {
		this.repo = repo;
	}

	@Override
	public void delete(Long id) {
		// TODO Auto-generated method stub
		repo.deleteById(id);
	}

	@Override
	public Product get(Long id) {
		// TODO Auto-generated method stub
		return repo.findById(id).get();
	}

	@Override
	public Product save(Product product) {
		// TODO Auto-generated method stub
		return repo.save(product);
	}

	@Override
	public List<Product> listAll() {
		// TODO Auto-generated method stub
		return repo.findAll();
	}

}
