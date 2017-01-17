package de.jonashackt.library.spring.repository;

import de.jonashackt.library.spring.domain.FooProduct;
import org.springframework.stereotype.Repository;

import java.util.Arrays;
import java.util.List;

@Repository
public class FooProductRepository {

    private List<FooProduct> products = Arrays.asList(
            new FooProduct("Product a", 23.6),
            new FooProduct("Product b", 45.8),
            new FooProduct("Product c", 67.9));


    public List<FooProduct> getProducts() {
        return products;
    }

    public void setProducts(List<FooProduct> products) {
        this.products = products;
    }
}
