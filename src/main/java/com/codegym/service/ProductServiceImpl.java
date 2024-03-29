package com.codegym.service;

import com.codegym.model.Product;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ProductServiceImpl implements ProductService {
    private static Map<Integer , Product> products;

    static {
        products = new HashMap<>();
        products.put(1, new Product(1,"Iphone Xs Max",2000,"Full Box"));
        products.put(2, new Product(2,"Galaxy Note 9 Pro",1500,"Full Box"));
        products.put(3, new Product(3,"Huawei v.9.0",1200,"Full Box"));
        products.put(4, new Product(4,"OPPO S7 egle",800,"Full Box"));
        products.put(5, new Product(5,"Sony Xperia",1000,"Full Box"));
    }


    @Override
    public List<Product> findAll() {
        return new ArrayList<>(products.values());
    }

    @Override
    public void save(Product product) {
        products.put(product.getId() , product);
    }

    @Override
    public Product findById(int id) {
        return products.get(id);
    }

    @Override
    public void update(int id, Product product) {
        products.put(id , product);
    }

    @Override
    public void remove(int id) {
        products.remove(id);
    }
}
