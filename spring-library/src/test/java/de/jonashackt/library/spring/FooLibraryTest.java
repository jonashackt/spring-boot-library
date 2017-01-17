package de.jonashackt.library.spring;

import de.jonashackt.library.spring.service.FooLibraryService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.annotation.Import;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringRunner;

import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;


@RunWith(SpringRunner.class)
@ContextConfiguration
@Import(FooLibraryConfiguration.class)
public class FooLibraryTest {

    @Autowired
    private FooLibrary fooLibrary;

    @Test
    public void
    calculate_products_correctly() {
        double productPrice = fooLibrary.calculateProducts();

        assertThat(productPrice, is(equalTo(137.3)));
    }
}