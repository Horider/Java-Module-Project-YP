package service;

import java.util.List;

import model.Product;

public interface ProductService {
    List<Product> addProductsToTheCalculator();

    String addNameProduct();

    double addPriceProduct();

    boolean finishAddingProducts();
}
