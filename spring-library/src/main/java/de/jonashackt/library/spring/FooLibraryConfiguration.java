package de.jonashackt.library.spring;

import de.jonashackt.library.spring.service.FooLibraryService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("de.jonashackt.library.spring")
public class FooLibraryConfiguration {

    @Bean
    public FooLibrary fooLibrary() {
        return new FooLibraryService();
    }
}
