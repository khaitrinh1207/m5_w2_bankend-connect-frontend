package backend.crudangular.service.product;

import backend.crudangular.model.Product;
import backend.crudangular.repository.ProductRepostory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class ProductServiceImp implements IProductService {

    @Autowired
    private ProductRepostory productRepostory;


    @Override
    public List<Product> getAll() {
        return productRepostory.findAll();
    }

    @Override
    public Product save(Product product) {
        return productRepostory.save(product);
    }

    @Override
    public void delete(Long id) {
        productRepostory.deleteById(id);
    }

    @Override
    public Product findById(Long id) {
        return productRepostory.findById(id).get();
    }
}
