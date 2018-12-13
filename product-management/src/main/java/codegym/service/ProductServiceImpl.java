package codegym.service;

import codegym.model.Product;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ProductServiceImpl implements ProductService {
    private  static  Map<Integer, Product> products;

    static {

        products = new HashMap<>();
        products.put(1, new Product(1, "Xe May", 50000000));
        products.put(2, new Product(2, "O To", 900000000));
        products.put(3, new Product(3, "Tau Hoa", 450000000));
        products.put(4, new Product(4, "Xe Dap", 5000000));
        products.put(5, new Product(5, "Xich Lo", 4000000));
        products.put(6, new Product(6, "Du Thuyen", 500000000));
    }

    @Override
    public List<Product> findAll(){
        return new ArrayList<>(products.values());
    }

    @Override
    public void save(Product product){

        products.put(product.getId(),product);
    }

    @Override
    public Product findById(int id){
        return products.get(id);
    }

    @Override
    public  void update(int id, Product customer){
        products.put(id, customer);

    }

    @Override
    public void remove(int id){
        products.remove(id);
    }
}