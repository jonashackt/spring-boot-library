package de.jonashackt.library.spring.service;

import de.jonashackt.library.spring.FooLibrary;
import de.jonashackt.library.spring.domain.FooProduct;
import de.jonashackt.library.spring.repository.FooProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class FooLibraryService implements FooLibrary {

    @Autowired
    private FooProductRepository fooProductRepository;

    @Override
    public double calculateProducts() {
        return fooProductRepository.getProducts().stream().mapToDouble((FooProduct product) -> product.getPrice()).sum();
    }
}
