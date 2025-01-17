package ra.Controller;

import ra.model.Product;
import ra.service.ProductService;

import java.util.List;

public class ProductController implements IGenericController <Product, String> {
    private ProductService productService = new ProductService();

    @Override
    public List<Product> getAll() {
        return productService.getAll();
    }

    @Override
    public void save(Product product) {
        productService.save(product);
    }

    @Override
    public Product findById(String s) {
        return productService.findById(s);
    }

    @Override
    public void delete(String s) {
        productService.delete(s);
    }

    public String getNewIdProduct() {
        return productService.getNewIdProduct();
    }
}
