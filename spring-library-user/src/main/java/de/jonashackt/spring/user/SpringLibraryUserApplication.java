package de.jonashackt.spring.user;

import de.jonashackt.library.spring.FooLibrary;
import de.jonashackt.library.spring.FooLibraryConfiguration;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Import;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;

@SpringBootApplication
@Import(FooLibraryConfiguration.class)
@RestController("/productcalc")
public class SpringLibraryUserApplication {

	@Autowired
	private FooLibrary fooLibrary;

	public static final String REST_SERVICE_RESPONSE = "Nice to have you here! I calculated our Products prices for you: ";

	public static void main(String[] args) {
		SpringApplication.run(SpringLibraryUserApplication.class, args);
	}

	@RequestMapping
	public String calc() {
		System.out.println("Rocking the Libray usage :) !");
		return REST_SERVICE_RESPONSE +
				String.valueOf(fooLibrary.calculateProducts());
	}

}
