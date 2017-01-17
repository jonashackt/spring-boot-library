package de.jonashackt.spring.user;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.web.client.RestTemplate;

import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;

@RunWith(SpringRunner.class)
@SpringBootTest(
		classes = SpringLibraryUserApplication.class,
		webEnvironment = SpringBootTest.WebEnvironment.DEFINED_PORT,
		properties = "server.port = 8080"
)
public class SpringLibraryUserApplicationTests {

	@Test
	public void calculate_Products_With_FooLibrary() {

		TestRestTemplate restTemplate = new TestRestTemplate();

		String response = restTemplate.getForObject("http://localhost:8080/productcalc", String.class);

		assertThat(response, is(equalTo(SpringLibraryUserApplication.REST_SERVICE_RESPONSE + "137.3")));
	}

}
